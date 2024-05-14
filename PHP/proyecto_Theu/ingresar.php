<?php
session_start();
$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "registro1";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexión con el servidor");
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexión con la base de datos");

if($_SERVER['REQUEST_METHOD'] === 'POST'){
    $nombre = $_POST['nombre'];
    $password = $_POST['password'];
    
    $sql = "SELECT * FROM datos WHERE nombre = '$nombre'";
    $result = mysqli_query($conexion, $sql);
    
    if($result && mysqli_num_rows($result)>0){
        $row = mysqli_fetch_assoc($result);
        $hashed_password = $row['password'];
        
        if(password_verify($password, $hashed_password)){
            $_SESSION['nombre'] = $nombre;
            header("Location: home.html");
            exit();
        }else{
            echo 'Contraseña incorrecta. <a href="inicio.html">Volver</a>';
        }
    }else{
        echo 'Nombre no encontrado. <a href="inicio.html">Volver</a>';
    }
}
?>
