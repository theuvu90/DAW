
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

            setcookie('contador', $_COOKIE['contador'] + 1, time() + 32850000);
            //Descripción. setcookie() define una cookie para ser enviada junto con el resto de las cabeceras de HTTP.
            //Si nos ha visitado le colocamos la cookie tenemos que poner el tiempo en segundos
            //32850000 segundos , también podemos realizar el cálculo matemático (+365*24*60*60; nos tiene que dar 32850000 segundo)

            /*echo "Número de visitas:" . $_COOKIE['contador'];*/
            //número de visitas que el usuario tiene guardad en su cuenta
            //
        } else {
            setcookie('contador', 0, time() + 32850000); //Si nunca nos ha visitado le colocamos la cookie
            //como es la primera vez le colocamos el 1, tenemos que poner el tiempo en segundos
            //32850000 segundos , también podemos realizar el cálculo matemático (+365*24*60*60; nos tiene que dar 32850000)
            echo "Bienvenido por primera vez a nuestra página"; //Mostramos mensaje en la primera visita
        }
        ?>
    </body>
</html>
