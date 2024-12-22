package ALLPROGRAM;

public class MaxNumberusingArrayMethod {
	
	
	 static void max(int arr[]) {
		
		int max = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			
			
			if(max<arr[i]) {
				
				max = arr[i];
				
				System.out.println("max number is : "+ max);
			}
		}
		
		
	}

	public static void main(String[] args) {
		int a[] = {44,4,5,67,7,};
		
		max(a);

	}

}
