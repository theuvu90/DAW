<?php
require_once __DIR__ . '/vendor/autoload.php';

$connect = new MongoDB\Client('mongodb://localhost:27017');
$database = $connect->selectDatabase('my_database');
$collection = $database->my_collection;

$nombre = $_POST['nombre'];
$apellido = $_POST['apellido'];
$telefono = $_POST['telefono'];
$mail = $_POST['mail'];
$direccion = $_POST['direccion'];
$localidad = $_POST['localidad'];

$documento = [
    'nombre' => $nombre,
    'apellido' => $apellido,
    'telefono' => $telefono,
    'mail'=> $mail,
    'direccion'=> $direccion,
    'localidad'=> $localidad,
];

$resultado = $collection->insertOne($documento);

if($resultado->getInsertedCount() > 0){
    echo 'Los datos se han insertado correctamente en MongoDB.';
}else{
    echo 'Error al insertar los datos en MongoDB';
}
?>