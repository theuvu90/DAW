<?php
$usuario = "root"; 
$password = "";  
$servidor = "localhost"; 
$basededatos ="for5"; 

$conexion = mysqli_connect  ($servidor,$usuario,"") or die ("Error con el servidor de la Base de datos"); 

$db = mysqli_select_db($conexion, $basededatos) or die ("Error conexión al conectarse a la Base de datos");

$nombre = $_POST['nombre']; 
$apellido = $_POST['apellido']; 
$telefono = $_POST['telefono']; 
$correo = $_POST['correo']; 
$direccion = $_POST['direccion']; 
$localidad = $_POST['localidad']; 

echo "Nombre: " . $nombre . "<br>";
echo "Apellido: " . $apellido . "<br>";
echo "Teléfono: " . $telefono . "<br>";
echo "Mail: " . $correo . "<br>";
echo "Dirección: " . $direccion . "<br>";
echo "Localidad: " . $localidad . "<br>";

$sql = "INSERT INTO datos (nombre, apellido, telefono, correo, direccion, localidad) VALUES ('$nombre', '$apellido', '$telefono', '$correo', '$direccion', '$localidad')"; 


$ejecutar = mysqli_query($conexion, $sql);


if (!$ejecutar) {
    echo "Hubo algún error"; 
} else {
    echo "Datos guardados correctamente <br><a href='index.php'>Nuevo Registro</a>"; 
}
?>

