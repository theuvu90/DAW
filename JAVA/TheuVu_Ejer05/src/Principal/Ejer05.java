package Principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ejer05 {

	public static void main(String[] args) {
		String linea, tb[],club;	
		HashMap<String,ArrayList<String>> equipos = new HashMap<String,ArrayList<String>>();
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\ficheros\\jugadores.csv"));) {
			linea = br.readLine();
			
			while (linea != null) {
				tb = linea.split(",");
				club=tb[7];
				if(!equipos.containsKey(club)) {
					equipos.put(club, new ArrayList<String>());
				}
				equipos.get(club).add(linea);
				
				linea = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error en el tratamiento");
		} catch (Exception e) {
			System.out.println("nuevo");
		}
		
		
		for(Entry<String,ArrayList<String>> item: equipos.entrySet()){
			club=item.getKey();
			ArrayList<String> jugadores=item.getValue();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ficheros\\"+club+".csv"));) {
				
				for(String ju:jugadores)bw.write(ju+"\n");
				
			} catch (IOException e) {
				System.out.println("Error en el tratamiento");
			} catch (Exception e) {
				System.out.println("nuevo");
			}	
			
			
		}

	}

}
