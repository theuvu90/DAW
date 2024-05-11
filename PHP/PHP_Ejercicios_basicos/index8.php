<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Encuesta Simple</title>
</head>
<body>
    <h1>Encuesta Simple</h1>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $respuesta = $_POST["respuesta"];
        
        // Aquí puedes agregar código para guardar las respuestas en una base de datos o realizar análisis.
        
        echo "¡Gracias por participar en la encuesta! Tu respuesta: $respuesta";
    }
    ?>
    
    <form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <p>¿Te gusta la programación?</p>
        <input type="radio" id="si" name="respuesta" value="Si" required>
        <label for="si">Sí</label><br>
        <input type="radio" id="no" name="respuesta" value="No">
        <label for="no">No</label><br>
        
        <button type="submit">Enviar</button>
    </form>
</body>
</html>
