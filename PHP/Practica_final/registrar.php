<?php
$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "form_final";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexion con el servidor");
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexion con la base de datos");

if($_SERVER['REQUEST_METHOD'] === 'POST'){
    $nombre = $_POST['nombre'];
    $password = password_hash($_POST['password'], PASSWORD_DEFAULT);
    $email = $_POST['email'];
    $direccion = $_POST['direccion'];
    
    $consulta = "SELECT * FROM usuarios WHERE nombre = '$nombre'";
    $resultado = mysqli_query($conexion, $consulta);
    
    if($resultado && mysqli_num_rows($resultado) > 0){
        echo 'El nombre ya existe. <a href="registro.html">Volver</a>';
    }else{
        $sql = "INSERT INTO usuarios (nombre, password, email, direccion) VALUES ('$nombre', '$password', '$email', '$direccion')";
        $ejecutar = mysqli_query($conexion, $sql);
        
        if(!$ejecutar){
            echo 'Error al registrar. <a href="registro.html">Volver</a>';
        }else{
            echo 'Usuario registrado correctament. <a href="inicio.html">Iniciar sesión</a>';
        }
    }
}
?>

