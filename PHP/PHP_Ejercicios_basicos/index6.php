<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Registro de Usuarios</title>
</head>
<body>
    <h1>Registro de Usuarios</h1>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $nombre = $_POST["nombre"];
        $email = $_POST["email"];
        
        // Aquí puedes agregar código para guardar los datos en una base de datos o realizar validaciones.
        
        echo "¡Usuario registrado! Nombre: $nombre, Email: $email";
    }
    ?>
    
    <form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        
        <button type="submit">Registrarse</button>
    </form>
</body>
</html>
