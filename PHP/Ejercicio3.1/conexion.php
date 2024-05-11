<?php
$usuario = "root"; 
$password = "";  
$servidor = "localhost"; 
$basededatos ="for4"; 

$conexion = mysqli_connect  ($servidor,$usuario,"") or die ("Error con el servidor de la Base de datos"); 

$db = mysqli_select_db($conexion, $basededatos) or die ("Error conexión al conectarse a la Base de datos");

$nombre = $_POST['nombre']; 
$correo = $_POST['correo']; 
$mensaje = $_POST['mensaje']; 

echo "Welcome " . $nombre . "<br>";
echo "Your email address is: " . $correo . "<br>";

$sql = "INSERT INTO datos (nombre, correo, mensaje) VALUES ('$nombre', '$correo', '$mensaje')"; 


$ejecutar = mysqli_query($conexion, $sql);


if (!$ejecutar) {
    echo "Hubo algún error"; 
} else {
    echo "Datos guardados correctamente <br><a href='index.php'>Volver</a>"; 
}
?>

