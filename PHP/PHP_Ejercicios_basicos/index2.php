<!DOCTYPE html>
<html>
<head>
    <title>Suma de Dos Números</title>
</head>
<body>
    <h1>Suma de Dos Números</h1>
    
    <form method="post">
        <label for="num1">Número 1:</label>
        <input type="number" id="num1" name="num1">
        <br>
        <label for="num2">Número 2:</label>
        <input type="number" id="num2" name="num2">
        <br>
        <input type="submit" value="Sumar">
    </form>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $num1 = $_POST["num1"];
        $num2 = $_POST["num2"];
        
        $resultado = $num1 + $num2;
        
        echo "La suma de $num1 y $num2 es $resultado.";
    }
    ?>
</body>
</html>
