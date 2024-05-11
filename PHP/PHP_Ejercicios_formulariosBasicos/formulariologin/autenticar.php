<?php
session_start();

$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "forlogin";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexión con el servidor de la Base de datos");
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexión al conectarse a la Base de datos");

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nombre = $_POST['nombre'];
    $password = $_POST['password'];

    // Consulta para verificar el nombre de usuario y la contraseña
    $sql = "SELECT * FROM usuarios WHERE nombre = '$nombre'";
    $result = mysqli_query($conexion, $sql);

    if ($result && mysqli_num_rows($result) > 0) {
        $row = mysqli_fetch_assoc($result);
        // Si la condición en la línea anterior se cumple, significa que hay al menos una fila de resultados. 
        // $row = mysqli_fetch_assoc($result) En esta línea, se utiliza mysqli_fetch_assoc($result) para obtener 
        // la primera fila de resultados como un array asociativo. Esto significa que puedes acceder a los valores 
        // de las columnas por su nombre.
        $hashed_password = $row['password'];

        if (password_verify($password, $hashed_password)) {
            $_SESSION['nombre'] = $nombre; // Almacenar el nombre de usuario en la sesión
            header("Location: bienvenida.php"); // Redirigir al usuario a la página de bienvenida
            exit();
        } else {
            echo "Contraseña incorrecta. <a href='login.html'>Volver</a>";
        }
    } else {
        echo "Nombre de usuario no encontrado. <a href='login.html'>Volver</a>";
    }
}
?>
