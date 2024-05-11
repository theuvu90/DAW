<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- Link con el archivo CSS -->
    <link rel="stylesheet" type="text/css" href="css/index_styles.css" />

    <!-- Link con Bootstrap CSS -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />

    <title>Proyecto Final</title>
  </head>

  <body>
    <header>
      <div class="container nav-container">
        <div class="caja-logo">
          <div class="logo">
            <img
              src="resources/images/logo_indominus_tex.jpg"
              class="img-fluid"
              alt="logo"
            />
          </div>
        </div>

        <nav>
          <div class="menu-items">
            <a href="#">Inicio</a>
            <a href="#">Sobre Nosotros</a>
            <a href="#">Servicios</a>
            <a href="html/tienda/tienda.html">Tienda</a>
            <a href="html/contacto/contacto.html">Contáctanos</a>

            <div class="social">
              <a href="#">
                <img src="resources/images/facebook.png" alt="" />
              </a>

              <a href="#">
                <img src="resources/images/instagram.png" alt="" />
              </a>

              <a href="#">
                <img src="resources/images/twitter.png" alt="" />
              </a>
            </div>

            <a href="html/login/login.php">Inicia sesión</a>
          </div>
        </nav>
      </div>

      <!-- Final del nav -->

      <div class="header-wrapper">
        <div class="my-header">
          <div class="text-content">
            <h1>Indominus Tex</h1>

            <div class="sub-heading">
              <p>
                Lorem ipsum dolor sit amet lorem ipsum dolor sit amet Lorem
                ipsum dolor sit amet lorem ipsum dolor sit amet Lorem ipsum
                dolor sit amet lorem ipsum dolor sit amet
              </p>

              <p>Lorem ipsum dolor sit amet lorem ipsum dolor sit amet</p>
            </div>

            <div class="botones">
              <a href="#" class="btn">Leer más</a>

              <a href="#" class="btn">¡Empezar!</a>
            </div>
          </div>

          <div class="imagen">
            <img src="resources/images/modelo3.png" class="imagen-modelo" alt="" />
            <div class="imagen-bg"></div>
          </div>
        </div>
      </div>
    </header>

    <div class="mobile-navmenu">
      <div class="logo">LOGO</div>

      <div class="menu-icons">
        <img class="menu-icon" src="resources/images/menu-icon.png" alt="" />

        <img class="close-icon" src="resources/images/close-icon.png" alt="" />
      </div>
    </div>

    <div class="mobile-menu-items">
      <a href="#">Inicio</a>
      <a href="#">Sobre Nosotros</a>
      <a href="#">Servicios</a>
      <a href="#">Tienda</a>
      <a href="#">Contáctanos</a>

      <div class="social">
        <a href="#">
          <img src="resources/images/facebook.png" alt="" />
        </a>

        <a href="#">
          <img src="resources/images/instagram.png" alt="" />
        </a>

        <a href="#">
          <img src="resources/images/twitter.png" alt="" />
        </a>
      </div>
    </div>

    <main></main>

    <footer></footer>

    <script src="js/main.js"></script>
  </body>
</html>
