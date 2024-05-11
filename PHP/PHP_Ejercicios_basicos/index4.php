<!DOCTYPE html>
<html>
<head>
    <title>Mayor de Dos Números</title>
</head>
<body>
    <h1>Mayor de Dos Números</h1>
    
    <form method="post">
        <label for="num1">Número 1:</label>
        <input type="number" id="num1" name="num1">
        <br>
        <label for="num2">Número 2:</label>
        <input type="number" id="num2" name="num2">
        <br>
        <input type="submit" value="Calcular">
    </form>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $num1 = $_POST["num1"];
        $num2 = $_POST["num2"];
        
        if ($num1 > $num2) {
            echo "$num1 es mayor que $num2.";
        } elseif ($num1 < $num2) {
            echo "$num2 es mayor que $num1.";
        } else {
            echo "Ambos números son iguales.";
        }
    }
    ?>
</body>
</html>
