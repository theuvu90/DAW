//funcion que devuelve el mapa con las palabras repetidas
function mapaRepeticiones(array){
    //instanceof --> true si es un array y false en caso contrario
    if(array instanceof Array == false){
        return null;
    }else{
        let mapa = new Map();
        //llamamos clave a cada valor del array porque serán las claves del mapa
        for(let clave of array){
            //comprobamos si el valor está en el mapa
            //get --> devuelve el "valor" asignado a la clave indiquemos
            if(mapa.get(clave) != undefined){
                //si lo está incrementamos el contador
                mapa.set(clave, mapa.get(clave)+1);
            }else{
                //si no, la añadimos con contador 1
                mapa.set(clave, 1);
            }
        }
        return mapa;
    }
    
}