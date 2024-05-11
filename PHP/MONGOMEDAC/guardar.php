<?php
require_once __DIR__ . '/vendor/autoload.php';

// Establecer la conexión a MongoDB
$client = new MongoDB\Client('mongodb://localhost:27017');

// Seleccionar la base de datos y la colección
$database = $client->selectDatabase('mi_base_de_datos');
$collection = $database->mi_coleccion;

// Recuperar los datos del formulario
$nombre = $_POST['nombre'];
$apellido = $_POST['apellido'];
$email = $_POST['email'];

// Crear un documento para insertar en MongoDB
$documento = [
    'nombre' => $nombre,
    'apellido' => $apellido,
    'email' => $email,
];

// Insertar el documento en la colección
$resultado = $collection->insertOne($documento);

if ($resultado->getInsertedCount() > 0) {
    echo 'Los datos se han insertado correctamente en MongoDB.';
} else {
    echo 'Error al insertar los datos en MongoDB.';
}
?>

