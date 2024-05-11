<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Formulario</title>
</head>
<body> 
    <style>       
        .button {           
            background-color: silver;
            border: none; 
            border-radius:16px;
            display: inline-block;
            margin-top: 32px;
            margin-left: 80px;
            margin-right: 80px;
            width: 120px;
            padding-top: 10px;
            padding-bottom: 10px;
        }
        textarea {            
            padding: 8px;            
            width: 30%;
        }
        
        label{
            text-align: center;
            display: inline-block;
            padding-top: 16px;
            padding-bottom: 16px;
        }
        
        #mensaje{
            height: 100px;
        }       
        
    
    </style>
    
    <h1>Este es el Formulario para DAW2:</h1>   

    <form action="conexion.php" method="POST">
        
        <label for="nombre">INTRODUZCA SU NOMBRE</label><br>
        <textarea placeholder="Nombre" id="nombre" name="nombre" required></textarea><br>
        <label for="correo">DIRECCIÓN DE CORREO</label><br>
        <textarea placeholder="@mail.com" id="correo" name="correo" required></textarea><br>
        <label for="mensaje">COMENTARIOS</label><br>
        <textarea placeholder="Mensaje" id="mensaje" name="mensaje" required></textarea><br>

        <input class="button" type="submit" value="Enviar">
        <a href='index.php'><input class="button" type="button" value="Limpiar"></a>
    </form>
</body>
</html>

