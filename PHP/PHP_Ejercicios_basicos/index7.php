<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Conversor de Unidades</title>
</head>
<body>
    <h1>Conversor de Unidades</h1>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $cantidad = $_POST["cantidad"];
        $unidad_origen = $_POST["unidad_origen"];
        $unidad_destino = $_POST["unidad_destino"];
        
        $conversiones = [
            "metros_a_pies" => 3.28084,
            "kilogramos_a_libras" => 2.20462,
            "litros_a_galones" => 0.264172,
        ];
        
        $resultado = $cantidad * $conversiones["$unidad_origen"."_a_"."$unidad_destino"];
        
        echo "Resultado: $cantidad $unidad_origen es igual a $resultado $unidad_destino";
    }
    ?>
    
    <form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <label for="cantidad">Cantidad:</label>
        <input type="number" id="cantidad" name="cantidad" required>
        
        <label for="unidad_origen">Unidad de origen:</label>
        <select id="unidad_origen" name="unidad_origen">
            <option value="metros">Metros</option>
            <option value="kilogramos">Kilogramos</option>
            <option value="litros">Litros</option>
        </select>
        
        <label for="unidad_destino">Unidad de destino:</label>
        <select id="unidad_destino" name="unidad_destino">
            <option value="pies">Pies</option>
            <option value="libras">Libras</option>
            <option value="galones">Galones</option>
        </select>
        
        <button type="submit">Convertir</button>
    </form>
</body>
</html>
