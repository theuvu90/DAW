<!DOCTYPE html>
<html>
<head>
    <title>Captcha Example</title>
    <!--Referencia a css-->
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
    <body>
        <!--Esta línea de código es la etiqueta de inicio del formulario HTML. El atributo "method" especifica el método HTTP que se 
        utilizará para enviar los datos del formulario, que en este caso es "POST". El atributo "action" especifica la URL del archivo 
        PHP que procesará los datos del formulario cuando se envíe.-->
        <form method="POST" action="submit.php">
            <label for="name">Name:</label>
            <input type="text" name="name" id="name" required>
            <br>
            <label for="email">Email:</label>
            <input type="email" name="email" id="email" required>
            <br>
            <label for="captcha">Ingrese el captcha:</label>
            <input type="text" name="captcha" id="captcha" required>
            
        <!--La etiqueta div crea un contenedor con la clase CSS captcha-container. La imagen del captcha se muestra dentro de este contenedor 
        utilizando la etiqueta img. El atributo src especifica la URL de la imagen, que en este caso es "captcha.php". El atributo alt 
        proporciona un texto alternativo que se mostrará si la imagen no se carga correctamente, y la clase CSS captcha-image se utiliza 
        para dar estilo a la imagen del captcha.-->
            <div class="captcha-container">
                <img src="captcha.php" alt="captcha image" class="captcha-image">
            </div>

            <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
