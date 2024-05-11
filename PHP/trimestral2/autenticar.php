<?php
session_start();

$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "forlogin4";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexión con el servidor de la Base de datos");
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexión al conectarse a la Base de datos");

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $user = $_POST['user'];     
    $password = $_POST['password'];
    
    $sql = "SELECT * FROM usuarios WHERE user = '$user'";
    $result = mysqli_query($conexion, $sql);

    if ($result && mysqli_num_rows($result) > 0) {
        $row = mysqli_fetch_assoc($result);        
        $hashed_password = $row['password'];

        if (password_verify($password, $hashed_password)) {
            $_SESSION['user'] = $user; 
            header("Location: usuario.html");
            exit();
        } else {
            echo "Contraseña incorrecta. <a href='login.html'>Volver</a>";
        }
    } else {
        echo "Nombre de usuario no encontrado. <a href='login.html'>Volver</a>";
    }
}
?>
