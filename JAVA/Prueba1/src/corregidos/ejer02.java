package corregidos;

public class ejer02 {
	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void main(String[] args) {
		int tb[] = new int[5];
		for (int i = 0; i < tb.length; i++) {
			tb[i] = alea(10, 50);
		}

		for (int i = 0; i < tb.length; i++)
			System.out.println(tb[i]);
		int n = tb.length - 1;
		while (n >= 0) {
			System.out.println(n + " " + tb[n]);
			n--;
		}
		
		//Otra manera
		for(int j=tb.length-1;j>=0;j--) System.out.println(j + " " + tb[j]);
			
		

	}

}
