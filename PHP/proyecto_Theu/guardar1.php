<?php
//Mongodb
require_once __DIR__ . '/vendor/autoload.php';

$connect = new MongoDB\Client('mongodb://localhost:27017');
$database = $connect->selectDatabase('my_database');
$collection = $database->my_collection;

//PhpMyAdmin
$usuario = "root";
$password = "";
$servidor = "localhost";
$basededatos = "registro1";

$conexion = mysqli_connect($servidor, $usuario, $password) or die("Error conexión con el servidor de la base de datos");
$db = mysqli_select_db($conexion, $basededatos) or die("Error conexión al conectarse a la base de datos");

if ($_SERVER['REQUEST_METHOD'] === 'POST'){
    $nombre = $_POST['nombre'];
    $apellido = $_POST['apellido'];
    $telefono = $_POST['telefono'];
    $mail = $_POST['mail'];
    $direccion = $_POST['direccion'];
    $localidad = $_POST['localidad'];
    $password = password_hash($_POST['password'], PASSWORD_DEFAULT);

    //MongoDB
    $documento = [
        'nombre' => $nombre,
        'apellido' => $apellido,
        'telefono' => $telefono,
        'mail'=> $mail,
        'direccion'=> $direccion,
        'localidad'=> $localidad,
        'password'=> $password,
    ];
    
    $resultado = $collection->insertOne($documento);
    
    if($resultado->getInsertedCount() > 0){
        echo "Los datos se han insertado correctamente en MongoDB. <br>";
    }else{
        echo "Error al insertar los datos en MongoDB. <a href='registro.html'>Volver</a> <br>";
    }

    //PhpMyAdmin
    $sql = "INSERT INTO datos (nombre, apellido, telefono, mail, direccion, localidad, password) 
                    VALUES ('$nombre','$apellido', '$telefono', '$mail', '$direccion', '$localidad', '$password')";
    $ejecutar = mysqli_query($conexion, $sql);

    if(!$ejecutar){
        echo "Hubo un error al registrar el usuario. <a href='registro.html'>Volver</a>";
    }else{
        echo "Registrado correctamente en PhpMyAdmin. <br> <a href='inicio.html'>Iniciar Sesión</a>";
    }   
    
}
?>