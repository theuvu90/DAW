<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Bienvenido</title>
</head>
<body>
    <?php
    session_start();
    if (isset($_SESSION['nombre'])) {
        echo "<h1>Bienvenido, " . $_SESSION['nombre'] . "!</h1>";
        echo "<a href='cerrar_sesion.php'>Cerrar Sesión</a>";
    } else {
        header("Location: login.html");
        exit();
    }
    ?>
</body>
</html>
