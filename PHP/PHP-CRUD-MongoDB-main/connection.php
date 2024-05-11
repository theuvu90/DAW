
<!--Este código es un script PHP que hace lo siguiente:

1. Requiere la clase autoload.php desde el directorio vendor/
2. Crea una conexión a un servidor MongoDB local (127.0.0.1:27017)
3. Selecciona la colección person de la base de datos php_crud_1 en el servidor MongoDB
4. Define una función getIncrement que toma la conexión a MongoDB como parámetro
5. La función getIncrement selecciona la colección person_increment de la base de datos php_crud_1
6. La función actualiza el documento con _id 'auto_increment', incrementando su campo 'value' en 1 y devuelve el valor 
actualizado
7. Si el documento 'auto_increment' no existe, se inserta un documento con _id 'auto_increment' y valor 1
8. Devuelve el valor actualizado o 1 si el documento 'auto_increment' no existía. 
-->


<?php
// Inicio del bloque PHP

require_once __DIR__ . '/vendor/autoload.php';
// Requerir el archivo de clases y funciones definidas en la carpeta vendor

$con = new MongoDB\Client('mongodb://127.0.0.1:27017');
// Crear una nueva instancia del objeto MongoDB\Client para conectarse a la base de datos MongoDB

$person = $con->php_crud3->person3;
// Asignar la colección person3 de la base de datos php_crud3 a la variable $person

function getIncrement($con)
{
    // Definir una función llamada getIncrement que recibe como parámetro el objeto de conexión a la base de datos

    $person_increment = $con->php_crud3->person_increment;
    // Asignar la colección person_increment de la base de datos php_crud a la variable $person_increment

    $increment = $person_increment->findOneAndUpdate(['_id' => 'auto_increment'], ['$inc' =>  ['value' => +1]], ['returnDocument' => MongoDB\Operation\FindOneAndUpdate::RETURN_DOCUMENT_AFTER]);
    // Actualizar el valor del ID incremental, buscar el documento con _id igual a "auto_increment" en la colección person_increment, incrementar su valor en 1 y devolver el documento actualizado

    if ($increment == null) {
        // Verificar si el valor devuelto por la consulta anterior es nulo

        $increment = $person_increment->insertOne([
            '_id' => 'auto_increment', // Insertar un nuevo documento con _id igual a "auto_increment"
            'value' => 1 // Establecer el valor inicial de "value" en 1
    ]);

        if ($increment->getInsertedId() == 'auto_increment') {
            // Verificar si el ID del documento recién insertado es igual a "auto_increment"

            $increment = new stdClass(); // Crear un nuevo objeto vacío
            $increment->value = 1; // Establecer el valor de "value" en 1
        }
    }

    return $increment->value;
    // Devolver el valor de la propiedad "value" del objeto $increment
}
// Fin de la función getIncrement

// Fin del bloque PHP
?>
