<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Registro de Usuarios</title>
</head>
<body>
    <h1>Registro de Usuarios</h1>
    <form action="" method="post">
        <input type="text" name="nombre" placeholder="Nombre" required>
        <input type="email" name="correo" placeholder="Correo Electrónico" required>
        <input type="password" name="contrasena" placeholder="Contraseña" required>
        <input type="password" name="confirmacion" placeholder="Confirmar Contraseña" required>
        <input type="submit" value="Registrarse">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $nombre = $_POST["nombre"];
        $correo = $_POST["correo"];
        $contrasena = $_POST["contrasena"];
        $confirmacion = $_POST["confirmacion"];

        if ($contrasena !== $confirmacion) {
            echo "Las contraseñas no coinciden. Por favor, inténtalo de nuevo.";
        } else {
            // Aquí debes implementar la lógica para registrar al usuario en una base de datos.
            // Puedes usar las técnicas de hashing para almacenar contraseñas de forma segura.
            // Luego, puedes redirigir al usuario a una página de inicio de sesión.
        }
    }
    ?>
</body>
</html>
