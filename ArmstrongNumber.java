package ALLPROGRAM;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int originalnum = num;
		int arm = 0 ;
		
		while(num>0) {
			
			int rem =num%10;
			
			arm = arm + rem*rem*rem;
			
			num = num/10;
			
		
		}
		if(originalnum==arm) {
			
			System.out.println(arm + " it is armstrong number");
		}
		
		else {
			System.out.println("it is not a armstrong number");
		}
	}
	}

