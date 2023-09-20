package studio3;

import java.util.Scanner;

public class sieve {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter an integer value, under 30 mofo: ");

		int n = in.nextInt();
		int[] a = new int [100];
		if (n>0) {
			
			double div = (n%n);
			
			if (div == 0) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
			
			
		}


		// TODO Auto-generated method stub

	}

	

}
