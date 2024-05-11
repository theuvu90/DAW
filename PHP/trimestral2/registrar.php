<?php
$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "forlogin4";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexión con el servidor de la Base de datos");
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexión al conectarse a la Base de datos");

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nombre = $_POST['nombre'];
    $user = $_POST['user'];
    $email = $_POST['email'];
    $tel = $_POST['tel'];
    $password =  password_hash($_POST['password'], PASSWORD_DEFAULT);
    
    $consulta = "SELECT * FROM usuarios WHERE user = '$user'";
    $resultado = mysqli_query($conexion, $consulta);

    if ($resultado && mysqli_num_rows($resultado) > 0) {
        echo "El nombre de usuario ya existe. <a href='registro.html'>Volver</a>";
    } else {        
        $sql = "INSERT INTO usuarios (nombre, user, email, tel, password) VALUES ('$nombre', '$user', '$email', '$tel', '$password')";
        $ejecutar = mysqli_query($conexion, $sql);

        if (!$ejecutar) {
            echo "Hubo un error al registrar el usuario. <a href='registro.html'>Volver</a>";
        } else {
            echo "Usuario registrado correctamente. <a href='login.html'>Iniciar Sesión</a>";
        }
    }
}
?>
