<?php
$usuario = "root"; // en este caso root por ser localhost
$password = "";  // contraseña por si tiene algún servicio de hosting en mi caso no
$servidor = "localhost"; // localhost por lo del xampp
$basededatos = "for3"; // nombre de la base de datos donde guardamos los datos, en MySQL nombraremos la db "formulario1"

// por si hay error de conexión nos de un mensaje "or die= o imprime un mensaje" "Error con el servidor de la Base de datos".
$conexion = mysqli_connect($servidor, $usuario, "") or die("Error con el servidor de la Base de datos");

// por si hay error de conexión a la base de datos un mensaje "or die= o imprime un mensaje" "Error con el servidor de la Base de datos".
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexión al conectarse a la Base de datos");

// llamamos a los parámetros. Recuperar las variables
$nombre = $_POST['nombre']; //'nombre' nos sale de archivo index.html (name="nombre")
$correo = $_POST['correo']; // name="correo"
$mensaje = $_POST['mensaje']; // name="mensaje"
$fecha_hora = date('Y-m-d H:i:s'); // Obtiene la fecha y hora actual
$direccion = $_POST['direccion']; // name="direccion"
$telefono = $_POST['telefono']; // name="telefono"
$categoria = $_POST['categoria']; // name="categoria"
$dato_numerico = $_POST['dato_numerico']; // name="dato_numerico"
$estado = $_POST['estado']; // name="estado"

//Verificado de los parámetros introducidos
echo "Nombre: " . $nombre . "<br>";
echo "Correo: " . $correo . "<br>";
echo "Mensaje: " . $mensaje . "<br>";
echo "Fecha y Hora: " . $fecha_hora . "<br>";
echo "Dirección: " . $direccion . "<br>";
echo "Teléfono: " . $telefono . "<br>";
echo "Categoría: " . $categoria . "<br>";
echo "Dato Numérico: " . $dato_numerico . "<br>";
echo "Estado: " . $estado . "<br>";

// sentencia sql, solicitamos que inserte los datos
$sql = "INSERT INTO datos (nombre, correo, mensaje, fecha_hora, direccion, telefono, categoria, dato_numerico, estado) 
        VALUES ('$nombre', '$correo', '$mensaje', '$fecha_hora', '$direccion', '$telefono', '$categoria', '$dato_numerico', '$estado')";

// ejecutamos la sentencia de sql
$ejecutar = mysqli_query($conexion, $sql);

// verificación de la ejecución
if (!$ejecutar) {
    echo "Hubo algún error"; // si algo sale mal mándanos este mensaje
} else {
    echo "Datos fueron guardados correctamente <br><a href='index.php'>volver</a>"; // si todo sale bien mándanos este mensaje
}
?>
