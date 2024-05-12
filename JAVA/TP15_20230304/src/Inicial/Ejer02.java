package Inicial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Ejer02 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Tajamar\\Programacion\\Ficheros\\Restaurants.csv"));) {

			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error en el tratamiento");
		} catch (Exception e) {
			System.out.println("nuevo");
		}

	}

}
