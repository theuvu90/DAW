<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Calculadora Básica</title>
</head>
<body>
    <h1>Calculadora Básica</h1>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $numero1 = $_POST["numero1"];
        $numero2 = $_POST["numero2"];
        $operador = $_POST["operador"];
        
        switch ($operador) {
            case "+":
                $resultado = $numero1 + $numero2;
                break;
            case "-":
                $resultado = $numero1 - $numero2;
                break;
            case "*":
                $resultado = $numero1 * $numero2;
                break;
            case "/":
                if ($numero2 != 0) {
                    $resultado = $numero1 / $numero2;
                } else {
                    $resultado = "División por cero no permitida.";
                }
                break;
            default:
                $resultado = "Operador no válido.";
                break;
        }
        
        echo "Resultado: $resultado";
    }
    ?>
    
    <form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="numero1">Número 1:</label>
        <input type="number" id="numero1" name="numero1" required>
        
        <label for="operador">Operador:</label>
        <select id="operador" name="operador">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        
        <label for="numero2">Número 2:</label>
        <input type="number" id="numero2" name="numero2" required>
        
        <button type="submit">Calcular</button>
    </form>
</body>
</html>
