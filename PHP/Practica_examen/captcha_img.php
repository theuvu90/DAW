<?php
$ancho = 100;
$alto = 50;
$imagen = imageCreate($ancho, $alto); 

$amarillo = ImageColorAllocate($imagen, 255, 255, 0);
$azul = ImageColorAllocate($imagen, 0, 0, 255);

ImageFill($imagen, 0, 0, $amarillo);
$valorRandom = rand(1000000, 9999999);

session_start();
$_SESSION['numRandom'] = $valorRandom;
ImageString($imagen, 5, 25, 5, $valorRandom, $azul);

for ($i = 0; $i <= 6; $i++){
    $x1 = rand(0, $ancho);
    $y1 = rand(0, $alto);
    $x2 = rand(0, $ancho);
    $y2 = rand(0, $alto);
    ImageLine ($imagen, $x1, $y1, $x2, $y2, $azul);
}

Header("Content-type: image/jpeg");
ImageJPEG($imagen);
ImageDestroy($imagen);
?>