<?php
$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "forlogin";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexión con el servidor de la Base de datos");
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexión al conectarse a la Base de datos");

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nombre = $_POST['nombre'];
    $password =  password_hash($_POST['password'], PASSWORD_DEFAULT); // Hash de la contraseña para almacenarla de forma segura

    // Consulta para verificar si el nombre de usuario ya existe
    $consulta = "SELECT * FROM usuarios WHERE nombre = '$nombre'";
    $resultado = mysqli_query($conexion, $consulta);

    if ($resultado && mysqli_num_rows($resultado) > 0) {
        echo "El nombre de usuario ya existe. <a href='registro.html'>Volver</a>";
    } else {
        // Insertar el nuevo usuario en la base de datos
        $sql = "INSERT INTO usuarios (nombre, password) VALUES ('$nombre', '$password')";
        $ejecutar = mysqli_query($conexion, $sql);

        if (!$ejecutar) {
            echo "Hubo un error al registrar el usuario. <a href='registro.html'>Volver</a>";
        } else {
            echo "Usuario registrado correctamente. <a href='login.html'>Iniciar Sesión</a>";
        }
    }
}
?>
