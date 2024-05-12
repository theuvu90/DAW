package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ejer01 {

	public static void main(String[] args) {

		String linea,tb[],cp;	
		try(BufferedReader br=new BufferedReader(new FileReader("c:\\ficheros\\Restaurants.csv")); ){
						linea=br.readLine();
						while(linea!=null) {
							tb=linea.split(",");
							cp=tb[tb.length-1];
							
							if (cp.charAt(0)=='6')System.out.println(linea); 
								
							linea=br.readLine();
						}
					}catch(IOException e) {
						  System.out.println("error en el tratamiento");
						  
					}catch(Exception e) {
						  System.out.println("nuevo");
				    }
		

	}

}
