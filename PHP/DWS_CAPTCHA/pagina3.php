<?php
session_start();
?>
<html>
    <head>
        <title>Problema</title>
    </head>
    <body>
        <?php
        
        /*Esta línea compara el valor almacenado en la variable de sesión "numeroaleatorio" */
        /*($_SESSION['numeroaleatorio']) con el valor que se recibe a través de la solicitud en el parámetro "numero" 
         ($_REQUEST['numero']). Si estos dos valores son iguales, significa que el usuario ha ingresado el valor correcto.*/
        if ($_SESSION['numeroaleatorio'] == $_REQUEST['numero']) {
            echo "Ingresó el valor correcto";
        } else {
            echo "Incorrecto";
        }
        ?>
    </body>
</html> 
