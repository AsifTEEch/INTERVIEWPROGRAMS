package ALLPROGRAM;
import java.util.Scanner;

public class REVERSENUMBERS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		while(num>0) {
		int rem = num%10;
		
		int result = rem;
		
		 num = num/10;
		 
		 System.out.print(result);
		}
		
		


	}

}
