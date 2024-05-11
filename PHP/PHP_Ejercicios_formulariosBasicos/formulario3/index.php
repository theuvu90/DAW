<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Formulario de Registro de Usuario</title>
</head>
<body>
    <h1>Formulario de Registro de Usuario</h1>

    <form action="conexion.php" method="POST">
        <label for="nombre">Nombre de Usuario:</label>
        <input type="text" id="nombre" name="nombre" required>
        
        <label for="correo">Correo Electrónico:</label>
        <input type="email" id="correo" name="correo" required>
        
        <label for="mensaje">Mensaje:</label>
        <textarea id="mensaje" name="mensaje" required></textarea>

        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion">

        <label for="telefono">Número de Teléfono:</label>
        <input type="tel" id="telefono" name="telefono">

        <label for="categoria">Categoría o Etiqueta:</label>
        <input type="text" id="categoria" name="categoria">

        <label for="dato_numerico">Dato Numérico:</label>
        <input type="number" id="dato_numerico" name="dato_numerico">

        <label for="estado">Estado (Activo/Inactivo):</label>
        <select id="estado" name="estado">
            <option value="1">Activo</option>
            <option value="0">Inactivo</option>
        </select>

        <input type="submit" value="Registrar">
    </form>
</body>
</html>
