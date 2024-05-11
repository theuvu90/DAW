<?php
session_start(); 
?>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>
</head>
<body>
  <div class="container">
    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
      <div class="container-fluid">
        <div class="collapse navbar-collapse">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item"><a class="nav-link" href="home.html">App MongoDB + PHP + Bootstrap</a></li>
            <li class="nav-item"><a class="nav-link" href="inicio.html">Inicio</a></li>
            <li class="nav-item"><a class="nav-link" href="captcha.html">Registro</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Twitter</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Facebook Theu Vu</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="mt-5">
      <?php
      if($_SESSION['numRandom'] == $_REQUEST['number']){
        echo 'Valor correcto. <a href="registro.html">Registrarme</a>';
      }else{
        echo 'Incorrecto. <a href="captcha.html">Verificar otra vez</a>';
      }
      ?>
    </div>
  </div>
</body>
</html>