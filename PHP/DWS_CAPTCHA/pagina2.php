<?php

/*Se crea una imagen con un ancho de 100 píxeles y una altura de 40 píxeles utilizando la función imageCreate. 
 * La imagen se almacena en la variable $imagen.*/
$ancho = 100;
$alto = 40;
$imagen = imageCreate($ancho, $alto);


/*Se define un color amarillo utilizando ImageColorAllocate con valores RGB (255, 255, 0) y se utiliza para rellenar toda la imagen 
 con ese color mediante ImageFill. Esto establece el fondo de la imagen en amarillo.*/
$amarillo = ImageColorAllocate($imagen, 255, 255, 0);


ImageFill($imagen, 0, 0, $amarillo);
/*$imagen es la imagen en la que se va a aplicar el relleno. Esta imagen fue creada previamente con imageCreate y se almacena en la 
 variable $imagen.
 
 * 0, 0 son las coordenadas (posición) desde donde se comenzará a aplicar el relleno. En este caso, 0, 0 se refiere a la esquina 
 superior izquierda de la imagen, que es el punto de partida.
 
 * $amarillo es el color que se utilizará para rellenar la imagen. Este color se definió previamente con ImageColorAllocate, utilizando 
 valores RGB (255, 255, 0), que corresponden al amarillo.*/


/*Se define un color rojo utilizando ImageColorAllocate con valores RGB (255, 0, 0), que se utilizará para dibujar el número aleatorio 
 en la imagen y las líneas.*/
$rojo = ImageColorAllocate($imagen, 255, 0, 0);

$valoraleatorio = rand(100000, 999999);

/*Se inicia una sesión PHP con session_start() y se almacena el valor aleatorio en una variable de sesión llamada "numeroaleatorio".*/
session_start();
$_SESSION['numeroaleatorio'] = $valoraleatorio;

/*Se utiliza ImageString para escribir el valor aleatorio en la imagen con un tamaño de fuente de 5 píxeles y se coloca en las 
 coordenadas (25, 5) con el color rojo.*/
ImageString($imagen, 5, 25, 5, $valoraleatorio, $rojo);


/*Se crea un bucle for que dibuja cinco líneas aleatorias en la imagen utilizando ImageLine. Cada línea se genera con coordenadas X e Y 
 aleatorias dentro de los límites del ancho y alto de la imagen, y se dibuja en rojo.*/
for ($c = 0; $c <= 5; $c++) {
    $x1 = rand(0, $ancho);
    $y1 = rand(0, $alto);
    $x2 = rand(0, $ancho);
    $y2 = rand(0, $alto);
    ImageLine($imagen, $x1, $y1, $x2, $y2, $rojo);
}

/*Se establece el encabezado HTTP para indicar que el contenido que se envía al navegador es una imagen JPEG con Header
 ("Content-type: image/jpeg").*/
Header("Content-type: image/jpeg");

/*Se genera la imagen JPEG con ImageJPEG y se envía al navegador.*/
ImageJPEG($imagen);

/*Finalmente, se libera la memoria utilizada por la imagen con ImageDestroy una vez que se ha generado y enviado la imagen.*/
ImageDestroy($imagen);
?>
 
