<?php
// Inicio del bloque PHP
require './template/header.php'; // Requerir el archivo de encabezado para la página web

if (isset($_POST['Nombre']) && isset($_POST['Apellido'])) {
    // Verificar si las variables Nombre y Apellido fueron enviadas mediante POST

    require './connection.php'; // Requerir el archivo de conexión a la base de datos

    $query = $person->insertOne([
        '_id' => getIncrement($con), // Generar un nuevo ID para la persona
        'Nombre' => $_POST['Nombre'], // Asignar el valor de la variable Nombre a la propiedad Nombre de la persona
        'Apellido' => $_POST['Apellido'] // Asignar el valor de la variable Apellido a la propiedad Apellido de la persona
    ]);

    if ($query) {
        // Verificar si la consulta a la base de datos se realizó correctamente

        $_SESSION['action'] = 'Create PersonID:<b>' . $query->getInsertedId() . '</b> Successfully';
        // Asignar un mensaje de éxito a la variable de sesión action

        $_SESSION['display'] = 1; // Asignar el valor 1 a la variable de sesión display

        return header('Location:./');
        // Redirigir al usuario a la página principal del sitio web
    }
}
// Fin del bloque PHP
?>


<div class="col-md-3"></div>
<div class="col-md-6">
    <h4 class="text-center mb-3">Create<a href="index.php" class="float-end btn btn-secondary">Back</a></h4>
    <form action="" method="post">
        <div class="form-goup mb-2">
            <label for="Nombre">Nombre</label>
            <input type="text" class="form-control" id="Nombre" name="Nombre" maxlength="60" required>
        </div>
        <div class="form-goup mb-2">
            <label for="Apellido">Apellido</label>
            <input type="text" class="form-control" id="Apellido" name="Apellido" maxlength="60" required>
        </div>
        <button class="btn btn-success">Create</button>
    </form>
</div>
<div class="col-md-3"></div>

<?php
require './template/footer.php';
?>