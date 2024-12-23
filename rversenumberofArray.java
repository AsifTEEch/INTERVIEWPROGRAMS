package ALLPROGRAM;

public class rversenumberofArray {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50};
		
		int b[] = new int[a.length];
		
		for(int i =0; i<a.length;i++) {
			
			b[i] = a[a.length-1-i];
		}
		
		for(int j =0; j<b.length;j++) {
			
			System.out.print(b[j]+ " ");
		}
		
		//System.out.println();
	}



	}


