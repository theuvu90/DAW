<!DOCTYPE html>
<html>
<head>
    <title>Formulario MongoDB</title>
</head>
<body>
    <h2>Formulario MongoDB</h2>
    <form action="guardar.php" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>

        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido" required><br><br>

        <label for="email">Correo electrónico:</label>
        <input type="email" id="email" name="email" required><br><br>

        <input type="submit" value="Guardar">
    </form>
</body>
</html>

