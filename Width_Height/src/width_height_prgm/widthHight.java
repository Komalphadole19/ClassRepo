package width_height_prgm;

import java.util.Scanner;

    public class widthHight {
	public static void main(String[] args) {
		
		int a, b, c;
		Scanner in = new Scanner(System.in);
		
		 System.out.println("Enter a:");
		 a=in.nextInt();
		 
		 System.out.println("Enter b:");
		 a=in.nextInt();
		 
		 System.out.println("Enter c:");
		 a=in.nextInt();
		 
		 if(a > b && a > c) {
			 System.out.println("a is big number");
		 }
		 
		 
		 else if(b > a && b > c) {
			 System.out.println("b is big number");
		 }
		 
		 else 
			 System.out.println("c is big number");
	}
}

