<?php
$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "forlogin5";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexion con el servidor de base de datos");
$db = mysql_select_db($conexion, $basededatos) or die("Error conexion al conectarse a la base de datos");

if($_SERVER['REQUEST METHOD'] === 'POST'){
    $nombre = $_POST['nombre'];
    $contrasena = $_POST['contrasena'];
    
    $consulta = "SELECT * FROM usuarios WHERE nombre = '$nombre'";
    $resultado = mysqli_query($conexion, $consulta);
    
    if($resultado && mysqli_num_rows($resultado) > 0){
        echo 'El nombre ya existe. <a href="inicio.html">Volver</a>';           
    }else{
       $sql = "INSERT INTO usuarios (nombre, contrasena) VALUES ('$nombre', '$contrasena')";
       $ejecutar = mysqli_query($conexion, $sql);
       
       if(!ejecutar){
           echo 'Hubo un error al registrar el usuario. <a href="inicio.html">Volver</a>';
       }else{
           echo 'Usuario registrado correctamente. <a href="autenticar.php">Iniciar sesión</a>';
       }
    }
    
}
?>


