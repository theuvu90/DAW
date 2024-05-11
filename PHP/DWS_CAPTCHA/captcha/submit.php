<?php

/*Comenzamos la sesión del usuario para poder acceder a las variables de sesión, como el valor del captcha generado.*/
/*La función session_start() inicia una nueva sesión o reanuda una sesión existente en el servidor. Una sesión es una forma de almacenar 
 *información sobre el usuario y su interacción con el sitio web en variables de sesión.*/
session_start();

/*Comprobamos si el valor del captcha que ingresó el usuario (que se encuentra en $_POST["captcha"]) coincide con el valor del captcha 
 * almacenado en la sesión (que se encuentra en $_SESSION["captcha"]). Si no coinciden, mostramos un mensaje de error. 
 * Si coinciden, procesamos el envío del formulario.*/
if ($_POST["captcha"] != $_SESSION["captcha"]) {
    
    /*Si no coinciden, mostramos un mensaje de error. Si coinciden, procesamos el envío del formulario..*/
	echo "El captcha que ingresaste es incorrecto.<a href='formulario.php'>Vuelve al formulario</a>.";
} else {
    
    /*Si el captcha es correcto, se procesa la información del formulario aquí. En este caso, el código simplemente imprime un mensaje de éxito.*/
	echo "¡Formulario enviado exitosamente!!.<a href='formulario.php'>Vuelve al formulario</a>.";
}

/*Eliminamos el valor del captcha almacenado en la sesión del usuario para evitar que se use dos veces y para mantener la seguridad del 
 *formulario.
 */
unset($_SESSION["captcha"]);
?>
