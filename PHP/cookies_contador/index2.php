
<?php
session_start();
//Una sesión es un mecanismo para persistir información en diferentes páginas web para identificar usuarios mientras estos navegan 
//un sitio o app


$_SESSION["nombre"] = "David Ventura";
//$_SESSION es un array especial utilizado para guardar información a través de los requests que un usuario hace durante su visita 
//a un sitio web o aplicación. La información guardada en una sesión puede llamarse en cualquier momento mientras la sesión esté abierta.
//session_destroy();

//La forma de borrar las sesiones es con la función nativa session_destroy().

if (isset($_SESSION["nombre"])) 
            // isset verifica si una variable esta definida o no, $_SESSION

{
    print "<p>Su nombre es $_SESSION[nombre].</p>\n";
} else {
    print "<p>No sé su nombre.</p>\n";
}
?>


<!DOCTYPE html>
<!--
Desarrollado por José David Ventura
-->
<html lang="es">
    <head>
        <title>Cookies</title>
        <meta charset="UTF-8"/>
    </head>
    <body>
        <?php
        if (isset($_COOKIE['contador'])) {
            // if (isset  )si la cookie existe
            // isset verifica si una variable esta definida o no, si la cookie contador esta definida.

            setcookie('contador', $_COOKIE['contador'] + 1, time() + 100);
            //Descripción. setcookie() define una cookie para ser enviada junto con el resto de las cabeceras de HTTP.
            //Si nos ha visitado le colocamos la cookie tenemos que poner el tiempo en segundos
            //32850000 segundos , también podemos realizar el cálculo matemático (+365*24*60*60; nos tiene que dar 32850000)

            /*echo "Número de visitas:" . $_COOKIE['contador'];*/
            //número de visitas que el usuario tiene guardad en su cuenta
            //
        } else {
            setcookie('contador', 0, time() + 100); //Si nunca nos ha visitado le colocamos la cookie
            //como es la primera vez le colocamos el 1, tenemos que poner el tiempo en segundos
            //32850000 segundos , también podemos realizar el cálculo matemático (+365*24*60*60; nos tiene que dar 32850000)
            echo "Bienvenido por primera vez a nuestra página"; //Mostramos mensaje en la primera visita
        }
        ?>
    </body>
</html>
