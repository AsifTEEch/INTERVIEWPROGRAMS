package ALLPROGRAM;

import java.util.Scanner;

public class fibnoscieseries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		
		int n1 = 0, n2 =1;
		
		System.out.print(n1 + " " + n2);
		
		
		for(int i = 2; i<num ; i++) {
		int sum = n1 + n2;
		System.out.print("this is fibnosseries :");
		System.out.print(" "+ sum );
		
		n1 = n2;
		
		n2 = sum;
		
		
		
		
	}

}
}
