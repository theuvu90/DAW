<?php
    $usuario = "root"; //en este caso root por ser localhost
    $password = "";  //contraseña por si tiene algún servicio de hosting en mi caso no
    $servidor = "localhost"; //localhost por lo del xampp
    $basededatos ="for9"; //nombre de la base de datos donde guardamos los datos, en mysql nombraremos la db "formulario1"


//por si hay error de conexión nos de un mensaje "or die= o imprime un mensaje" "Error con el servidor de la Base de datos".
$conexion = mysqli_connect  ($servidor,$usuario,"") or die ("Error con el servidor de la Base de datos"); 

//por si hay error de conexión base de datos un mensaje "or die= o imprime un mensaje" "Error con el servidor de la Base de datos".
$db = mysqli_select_db($conexion, $basededatos) or die ("Error conexión al conectarse a la Base de datos");


//llamamos a los parámetros. Recuperar las variables
    $nombre=$_POST['nombre']; //'nombre' nos sale de archivo index.html (name="nombre")


    //sentencia sql, solicitamos que inserte los datos
    $sql="INSERT INTO datos VALUES ('$nombre')"; //Esto nos manda traer los valores de '$nombre','$correo','$mensaje'
    
    //ejecutamos la sentencia de sql
    $ejecutar=mysqli_query($conexion, $sql);


    //verificación de la ejecución
    if(!$ejecutar){
        echo"hubo algun error"; //si algo sale mal mándanos este mensaje
    }else{
        echo"datos guardado correctamente <br><a href='index.php'>volver</a>"; //si todo sale bien mándanos este mensaje
    }
     
?>﻿