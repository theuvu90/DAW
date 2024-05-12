package Principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer04 {

	public static void main(String[] args) {
		String linea, tb[], cp;	

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\ficheros\\Restaurants.csv"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ficheros\\Restaurants2.csv"));) {
			linea = br.readLine();
			while (linea != null) {
				tb = linea.split(",");
				cp = tb[tb.length - 1];
				if (cp.charAt(0) == '6') {
					System.out.println(linea);
					}else{bw.write(linea + "\n");}
				linea = br.readLine();

			}
		} catch (IOException e) {
			System.out.println("Error en el tratamiento");
		} catch (Exception e) {
			System.out.println("nuevo");
		}	
		

	}

}
