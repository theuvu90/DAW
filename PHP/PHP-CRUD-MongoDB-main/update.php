<?php
// Inicio del bloque PHP

require './template/header.php';
// Requerir el archivo de encabezado para la página web

$action = null;
// Inicializar la variable $action en nulo

if (isset($_GET['id'])) {
    // Verificar si la variable id fue enviada mediante GET

    require './connection.php';
    // Requerir el archivo de conexión a la base de datos

}

if (isset($_POST['Nombre']) && isset($_POST['Apellido']) && isset($_GET['id'])) {
    // Verificar si las variables Nombre, Apellido e id fueron enviadas mediante POST y GET respectivamente

    $query = $person->findOneAndUpdate(['_id' => intval($_GET['id'])], ['$set' => ['Nombre' => $_POST['Nombre'], 'Apellido' => $_POST['Apellido']]]);
    // Actualizar la información de la persona con el ID correspondiente en la base de datos

    if ($query) {
        // Verificar si la consulta a la base de datos se realizó correctamente

        $_SESSION['action'] = 'Update PersonID:<b>' . $_GET['id'] . '</b> Successfully';
        // Asignar un mensaje de éxito a la variable de sesión action

        $_SESSION['display'] = 1;
        // Asignar el valor 1 a la variable de sesión display

        return header('Location:./');
        // Redirigir al usuario a la página principal del sitio web
    }
}

if (isset($_GET['id'])) {
    // Verificar si la variable id fue enviada mediante GET

    $result = $person->findOne(['_id' => intval($_GET['id'])]);
    // Buscar la información de la persona con el ID correspondiente en la base de datos

    if (!$result) {
        // Verificar si la consulta a la base de datos no devolvió resultados

        return print_r("Error 404");
        // Mostrar un mensaje de error en pantalla indicando que la información no fue encontrada
    }
}

// Fin del bloque PHP
?>


<div class="col-md-3"></div>
<div class="col-md-6">
    <h4 class="text-center mb-3">Update<a href="index.php" class="float-end btn btn-secondary">Back</a></h4>
    <form action="?id=<?= $_GET['id'] ?>" method="post">
        <div class="form-goup mb-2">
            <label for="Nombre">Nombre</label>
            <input type="text" class="form-control" id="Nombre" name="Nombre" maxlength="60" value="<?= $result['Nombre'] ?>" required>
        </div>
        <div class="form-goup mb-2">
            <label for="Apellido">Apellido</label>
            <input type="text" class="form-control" id="Nombre" name="Apellido" maxlength="60" value="<?= $result['Apellido'] ?>" required>
        </div>
        <button class="btn btn-success">Update</button>
    </form>
</div>
<div class="col-md-3"></div>

<?php

require './template/footer.php';
?>