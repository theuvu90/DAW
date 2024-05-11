<?php

    function conectarDB(){
            
        try{
            
            $cadenaConexion = "mysql:host=localhost;dbname=login_p_final";
            $usuario = "root";
            $passW = "";
            $db = new PDO($cadenaConexion, $usuario, $passW);
            $db->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
            
            return $db;
            
        } catch(PDOException $ex){
            
            echo "Error conectando".$ex->getMessage();
            
        }
        
        
    }

    function getUser($db, $sUser, $sClave){
		
		try{
			
			$stmt = $db->query("SELECT * FROM USERS WHERE USERNAME='".$sUser."' AND CLAVE='".$sClave."'");
			$fila = $stmt->fetch(PDO::FETCH_ASSOC);
			
		} catch(PDOException $ex) {
			
			echo("Error! getUser".$ex->getMessage());
			
		}
		
		return $fila;
		
	}

    function existeUser($db, $sUser){
		
		try{
			
			$sqlI = "SELECT * FROM USERS WHERE USERNAME=:userB";
			$sth = $db->prepare($sqlI, array(PDO::ATTR_CURSOR => PDO::CURSOR_FWDONLY));
			$sth->execute(array(':userB' => $sUser));
			$fila = $sth->fetchAll();
			
		} catch(PDOException $ex) {
			
			echo("Error! existeUser".$ex->getMessage());
			
		}
		
		return $fila;
		
	}

    function insertarUser ($db, $sUser, $sEmail, $sClave){
		
		$sentenciaI = "INSERT INTO USERS(USERNAME, EMAIL, CLAVE) VALUES (:USERNAME ,:EMAIL ,:CLAVE)";
		
		try{
			
			$stmt = $db->prepare($sentenciaI);
			$stmt->bindParam (":USERNAME", $sUser);
            $stmt->bindParam (":EMAIL", $sEmail);
			$stmt->bindParam (":CLAVE", $sClave);
			$stmt->execute();
			
		} catch (PDOException $ex){
			
			echo "Error insertarUser ".$ex->getMessage();
			
		}
		
		return $db->lastInsertId();
		
	}

?>