 <?php
#session_start();: Inicia la sesión de PHP para poder utilizar las variables de sesión.
session_start();

// Inicializa la cesta si aún no existe
#Si la variable de sesión 'cart' no existe, se crea como un arreglo vacío para guardar los productos seleccionados.
#La exclamación ! es un operador de negación en PHP, que se usa para negar una expresión booleana. En este caso, !isset($_SESSION['cart']) 
#verifica si la variable de sesión "cart" NO está definida, y devuelve true en caso afirmativo. 
#Entonces, la condición se cumple y se inicializa la variable de sesión "cart" como un arreglo vacío
if (!isset($_SESSION['cart'])) {
    
    #crea un nuevo arreglo vacío llamado "cart" en la sesión actual. Este arreglo se utiliza para almacenar los productos que se han agregado 
    #a la cesta de la compra
    $_SESSION['cart'] = array();
}

// Agrega los productos seleccionados a la cesta
#if ($_SERVER['REQUEST_METHOD'] === 'POST') {: Si se ha enviado un formulario mediante POST, se agregan los productos seleccionados a la cesta.
#REQUEST_METHOD' es una variable global en PHP que almacena el método utilizado para enviar una solicitud HTTP al servidor web. 
#El valor de esta variable es una cadena de caracteres que indica si la solicitud se realizó utilizando el método 
#GET, POST, PUT, DELETE, HEAD, OPTIONS, TRACE, CONNECT u otro método de solicitud HTTP definido en la especificación HTTP.
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    
    #for ($i = 1; $i <= 2; $i++) {: Se itera sobre los productos para agregarlos a la cesta.
    for ($i = 1; $i <= 2; $i++) {
        
        
        #Se valida que la cantidad sea un número positivo.
        if (isset($_POST['cantidad' . $i]) && is_numeric($_POST['cantidad' . $i]) && $_POST['cantidad' . $i] > 0) {
            
            # Se crea un arreglo con los datos del producto a agregar a la cesta.
            $producto = array(
                'id' => $i,
                'nombre' => 'Producto ' . $i,
                'precio' => $i == 1 ? 10 : 20,
                'cantidad' => $_POST['cantidad' . $i]
            );

           #Se inicializa una variable para saber si el producto ya está en la cesta.
            $producto_existente = false;
            
            #Se itera sobre los productos en la cesta.
            for ($j = 0; $j < count($_SESSION['cart']); $j++) {
                
                #Si el producto ya existe en la cesta, se suma la cantidad seleccionada al producto existente.
                if (isset($_SESSION['cart'][$j]['id']) && $_SESSION['cart'][$j]['id'] === $producto['id']) { 
                    
                    #Se actualiza la cantidad del producto existente en la cesta.
                    $_SESSION['cart'][$j]['cantidad'] += $producto['cantidad'];
                    
                    #Se actualiza la variable que indica que el producto ya existe en la cesta.
                    $producto_existente = true;
                    
                    #Se termina el ciclo.
                    break;
                }
            }


            #Si el producto no existe en la cesta, se agrega a la cesta.
            if (!$producto_existente) {
                array_push($_SESSION['cart'], $producto);
            }
        }
    }
}

#Si se ha enviado una petición para eliminar un producto de la cesta.
if (isset($_GET['eliminar']) && isset($_GET['nombre'])) {
    
    #Se guarda el nombre del producto a eliminar.
    $nombre = $_GET['nombre'];
    
    #Se itera sobre los productos en la cesta.
    for ($i = 0; $i < count($_SESSION['cart']); $i++) {
        

        #Si el nombre del producto en la cesta es igual al nombre del producto a eliminar, se elimina el producto de la cesta
        if ($_SESSION['cart'][$i]['nombre'] === $nombre) {
            array_splice($_SESSION['cart'], $i, 1);
            break;
        }
    }
}
#Se inicializa la variable que acumula el total de la compra.
$total = 0;
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Cesta de la compra</title>
    </head>
    <body>
        <h1>Cesta de la compra</h1>

        <table>
            <thead>
                <tr>
                    <th>Producto</th>
                    <th>Precio</th>
                    <th>Cantidad</th>
                    <th>Total</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <?php
                
                #comienza el ciclo foreach que recorre el array $_SESSION['cart'] y asigna cada elemento a la variable $producto.
                foreach ($_SESSION['cart'] as $producto) {
                    
                    #calcula el subtotal de cada producto multiplicando su precio por su cantidad.
                    $subtotal = $producto['precio'] * $producto['cantidad'];
                    
                    #suma el subtotal de cada producto al total general de la compra.
                    #<tr>: crea una nueva fila en la tabla para mostrar la información del producto.
                    $total += $subtotal;
                    ?>
                    <tr>
                        
                        <!--muestra el nombre del producto en una celda de la tabla.-->
                        <td><?php echo $producto['nombre']; ?></td>
                        
                        <!--muestra el precio del producto en una celda de la tabla, con formato de moneda de dos decimales.-->                       
                        <td>$<?php echo number_format($producto['precio'], 2); ?></td>
                        
                        <!--muestra la cantidad del producto en una celda de la tabla.-->
                        <td><?php echo $producto['cantidad']; ?></td>
                        
                        <!--muestra el subtotal del producto en una celda de la tabla, con formato de moneda de dos decimales.-->
                        <td>$<?php echo number_format($subtotal, 2); ?></td>
                        
                        <!--muestra un enlace para eliminar el producto del carrito de compras, pasando como parámetros su nombre y una 
                        bandera para indicar que se debe eliminar.-->
                        <td><a href="cart.php?eliminar=true&nombre=<?php echo $producto['nombre']; ?>">Eliminar</a></td>
                    </tr>
                <?php } ?>
                <tr>
                    <td colspan="3"></td>
                    <td><strong>Total:</strong></td>
                    <td>$<?php echo number_format($total, 2); ?></td>

                </tr>
            </tbody>
        </table>

        <form action="cart.php" method="post">
            <h2>Añadir productos</h2>
            <div>
                <img src="producto1.png" alt="Producto 1">
                <h3>Producto 1</h3>
                <p>$10</p>
                <label for="cantidad1">Cantidad:</label>
                <input type="number" id="cantidad1" name="cantidad1" value="0">
            </div>
            <div>
                <img src="producto2.png" alt="Producto 2">
                <h3>Producto 2</h3>
                <p>$20</p>
                <label for="cantidad2">Cantidad:</label>
                <input type="number" id="cantidad2" name="cantidad2" value="0">
            </div>
            <button type="submit">Agregar al carrito</button>
        </form>

    </body>
</html>