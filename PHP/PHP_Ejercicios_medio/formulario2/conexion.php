<?php
$usuario = "root"; //en este caso root por ser localhost
$password = "";  //contraseña por si tiene algún servicio de hosting en mi caso no
$servidor = "localhost"; //localhost por lo del xampp
$basededatos ="for2"; //nombre de la base de datos donde guardamos los datos, en mysql nombraremos la db "formulario1"

//por si hay error de conexión nos de un mensaje "or die= o imprime un mensaje" "Error con el servidor de la Base de datos".
$conexion = mysqli_connect  ($servidor,$usuario,"") or die ("Error con el servidor de la Base de datos"); 

//por si hay error de conexión base de datos un mensaje "or die= o imprime un mensaje" "Error con el servidor de la Base de datos".
$db = mysqli_select_db($conexion, $basededatos) or die ("Error conexión al conectarse a la Base de datos");

//llamamos a los parámetros. Recuperar las variables
$nombre = $_POST['nombre']; //'nombre' nos sale de archivo index.html (name="nombre")
$correo = $_POST['correo']; //name="correo"
$mensaje = $_POST['mensaje']; //name="mensaje"

echo "Nombre: " . $nombre . "<br>";
echo "Correo: " . $correo . "<br>";
echo "Mensaje: " . $mensaje . "<br>";

//sentencia sql, solicitamos que inserte los datos
$sql = "INSERT INTO datos (nombre, correo, mensaje) VALUES ('$nombre', '$correo', '$mensaje')"; 

//ejecutamos la sentencia de sql
$ejecutar = mysqli_query($conexion, $sql);

//verificación de la ejecución
if (!$ejecutar) {
    echo "Hubo algún error"; //si algo sale mal mándanos este mensaje
} else {
    echo "Datos guardados correctamente <br><a href='index.php'>volver</a>"; //si todo sale bien mándanos este mensaje
}
?>
