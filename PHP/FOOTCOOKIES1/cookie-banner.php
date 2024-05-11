<?php
// Verifica si la solicitud es una petición de tipo POST para aceptar las cookies
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Crea una cookie llamada "cookie_banner_accepted" con un valor de "1", que expira en un año (86400 segundos = 1 día * 30 días * 12 meses), y está disponible en todo el sitio web ("/").
    setcookie('cookie_banner_accepted', '1', time() + (86400 * 30 * 12), "/"); // Expira en 1 año
    // Redirige al usuario a la misma página actual para actualizar la página después de aceptar las cookies.
    header("Location: " . $_SERVER['PHP_SELF']);
}
?>

<!-- Muestra el banner de cookies y contiene un formulario que envía una solicitud de aceptación de cookies al servidor. -->
<div class="cookie-banner">
    <!-- Muestra el mensaje del banner de cookies -->
    <p>Utilizamos cookies para mejorar su experiencia en nuestro sitio web. Al continuar navegando, acepta nuestro uso de cookies. Consulte nuestra <a href="URL_POLITICA_PRIVACIDAD" target="_blank" rel="noopener noreferrer">Política de Privacidad</a> para obtener más información.</p>
    <!-- Crea un formulario que envía una solicitud de aceptación de cookies al servidor cuando se presiona el botón Aceptar -->
    <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
        <!-- Crea un botón Aceptar -->
        <button type="submit" name="accept_cookies">Aceptar</button>
    </form>
</div>

