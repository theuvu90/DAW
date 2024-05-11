<!DOCTYPE html>
<html>
<head>
    <title>Calculadora Básica</title>
</head>
<body>
    <h1>Calculadora Básica</h1>
    
    <form method="post">
        <label for="num1">Número 1:</label>
        <input type="number" id="num1" name="num1">
        <br>
        <label for="num2">Número 2:</label>
        <input type="number" id="num2" name="num2">
        <br>
        <select name="operacion">
            <option value="suma">Suma</option>
            <option value="resta">Resta</option>
            <option value="multiplicacion">Multiplicación</option>
            <option value="division">División</option>
        </select>
        <br>
        <input type="submit" value="Calcular">
    </form>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $num1 = $_POST["num1"];
        $num2 = $_POST["num2"];
        $operacion = $_POST["operacion"];
        
        switch ($operacion) {
            case "suma":
                $resultado = $num1 + $num2;
                break;
            case "resta":
                $resultado = $num1 - $num2;
                break;
            case "multiplicacion":
                $resultado = $num1 * $num2;
                break;
            case "division":
                if ($num2 != 0) {
                    $resultado = $num1 / $num2;
                } else {
                    $resultado = "Error: División por cero.";
                }
                break;
            default:
                $resultado = "Operación no válida.";
                break;
        }
        
        echo "El resultado de la operación es: $resultado";
    }
    ?>
</body>
</html>
