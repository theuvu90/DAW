package Principal;

public class Ejer01 {

	public static void main(String[] args) {
		String a ="Big Daddy Barbeque,1005 Ikon Drive, Suite G, Jefferson City,MO,65109";
		String tb[]=a.split(",");
		
		System.out.println(tb[0]);
		String cadena="";
		for (int i=1; i<=tb.length-4;i++)cadena +=tb[i]+",";
		cadena=cadena.substring(0,cadena.length()-1);
			System.out.println(cadena);
			System.out.println(tb[tb.length-3]);
			System.out.println(tb[tb.length-2]);
			System.out.println(tb[tb.length-1]);
		
		

	}

}
