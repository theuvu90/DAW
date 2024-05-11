<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Formulario</title>
</head>
<body> 
    <style>       
        .button {
            color: white;
            background-color: green;
            border: none; 
            display: inline-block;
            margin-top: 8px;
            width: 120px;
        }
        input {
            border-radius: 4px;
            padding: 8px;
            margin-right: 0;
            width: 50%;
        }
        
        label{
            display: inline-block;
            padding-top: 10px;
        } 
        .nuevoRegistro {
            background-color: grey;           
           
        }
    
    </style>
    <h1>Formulario</h1>   

    <form action="conexion.php" method="POST">
        <a href='index.php'><input class="nuevoRegistro button" type="button" value="Nuevo Registro"></a><br><br>
        <label for="nombre">Nombre</label><br>
        <input type="text" id="nombre" name="nombre" required><br> 
        
        <label for="nombre">Apellido</label><br>
        <input type="text" id="apellido" name="apellido" required><br>
        
        <label for="nombre">Teléfono</label><br>
        <input type="number" id="telefono" name="telefono" required><br> 

        <label for="correo">Mail</label><br>
        <input type="email" id="correo" name="correo" required><br>
        
        <label for="nombre">Dirección</label><br>
        <input type="text" id="direccion" name="direccion" required><br> 
        
        <label for="nombre">Localidad</label><br>
        <input type="text" id="localidad" name="localidad" required><br>        

        <input class="button" type="submit" value="Guardar Datos">
    </form>
</body>
</html>
