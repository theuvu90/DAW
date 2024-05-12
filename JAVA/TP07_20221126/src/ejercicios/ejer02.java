package ejercicios;

public class ejer02 {

	public static void main(String[] args) {
		int tb[][] = new int[4][3];
		tb[0][0]=5; tb[0][1]=6;tb[0][2]=7;
		tb[1][0]=3; tb[1][1]=10;tb[1][2]=6;
		tb[2][0]=8; tb[2][1]=4; tb[2][2]=6;
		tb[3][0]=10; tb[3][1]=9; tb[3][2]=8;
		int nf=tb.length;
		int nc=tb[0].length;
		for(int i=0;i<nf;i++) {
			for(int j=0;j<nc;j++) {
				System.out.printf("%5d",tb[i][j]);
				
			}
			System.out.println();
		}
		
		

	}

}
