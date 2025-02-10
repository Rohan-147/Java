

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int row = 1;
		
		int space = 3;
		int nst = 1;
		
		while(row<=n) {
			
			int i = 1;
			while(i<=space) {
				System.out.print(" " + "\t");
				i = i + 1;
			}
			
			int j = 1;
			while(j<=nst) {
				System.out.print("*" + "\t");
				j = j + 1;
			}
			
			if (row<3) {
				space = space - 1;
			} else {
				space = space + 1;
			}
			
			if (row<3) {
				nst = nst + 2;
			} else {
				nst = nst - 2;
			}
			
			row = row + 1 ;
			System.out .println();
		}

	}

}

