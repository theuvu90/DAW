package Inicial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer03 {
	private static boolean primo(int n) {

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void leer() {
		String linea;

		try (BufferedReader br = new BufferedReader(new FileReader("c:\\ficheros1\\primos.txt"));) {
			linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("error en el tratamiento");
		} catch (Exception e) {
			System.out.println("nuevo");
		}
	}

	public static void escribir() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\ficheros1\\primos.txt"));) {

			for (int i = 1; i < 500; i++) {
				if (primo(i))
					bw.write(String.valueOf(i) + "\n");
			}
		} catch (IOException e) {
			System.out.println("error en el tratamiento");
		} catch (Exception e) {
			System.out.println("nuevo");
		}
	}

	public static void main(String[] args) {
		escribir();
		leer();

	}

}
