<?php
// Incluimos el archivo de encabezado para la página web
require './template/header.php';

// Requerimos el archivo que contiene la conexión a la base de datos de MongoDB
require './connection.php';

// Comprobamos si se han recibido los parámetros GET necesarios para realizar una operación de eliminación
if (isset($_GET['action']) && $_GET['action'] == 'delete' && isset($_GET['id'])) {
    // Llamamos al método "deleteOne" de la instancia "$person" para eliminar el documento correspondiente
    $person->deleteOne(['_id' => intval($_GET['id'])]);
    // Creamos una variable de sesión para almacenar el mensaje de éxito y mostramos el ID de la persona eliminada
    $_SESSION['action'] = "Delete PersonID:<b>" . $_GET['id'] . "</b> Successfully";
    // Creamos otra variable de sesión para indicar que se debe mostrar el mensaje de éxito en la página
    $_SESSION['display'] = 1;
    // Redirigimos al usuario a la página principal
    return header('Location:./');
}
?>

<!-- Mostramos el formulario de creación de nuevos documentos y un botón para crear un nuevo documento -->
<div class="col-md-3"></div>
<div class="col-md-6">
    <h4 class="text-center mb-3">PHP CRUD MongoDB <a href="create.php" class="float-end btn btn-success">Create</a></h4>
    
    <?php
    // Comprobamos si existe una variable de sesión llamada 'action' que contiene un mensaje de éxito para mostrar al usuario
    if (isset($_SESSION['action'])) {
        // Mostramos el mensaje de éxito dentro de un elemento de alerta con la clase 'alert-success'
        echo '<div style="display:none"id="action"class="alert alert-success">' . $_SESSION['action'] . '</div>';
    }
    ?>
</div>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>#</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>action</th>
            </tr>
        </thead>
        <tbody>
            <?php
            if ($person->count() >= 1) {
                foreach ($person->find() as $value) {
            ?>
                    <tr>
                        <td><?= $value['_id'] ?></td>
                        <td><?= $value['Nombre'] ?></td>
                        <td><?= $value['Apellido'] ?></td>
                        <td>
                            <a href="update.php?id=<?= $value['_id'] ?>" class="btn btn-sm btn-warning">Update</a>
                            <a href="?action=delete&id=<?= $value['_id'] ?>" class="btn btn-sm btn-danger">Delete</a>
                        </td>
                    </tr>
                <?php
                }
            } else {
                ?>
                <tr>
                    <td colspan="4" class="text-center text-info">not found</td>
                </tr>
            <?php } ?>
        </tbody>
    </table>
</div>
<div class="col-md-3"></div>

<?php
require './template/footer.php';
?>