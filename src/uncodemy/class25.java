package uncodemy;

public class class25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e;
		int result;
		for(int i=0; i < 10; i++) { 
		result = 1;
		
		e = i;
		System.out.println("2 to the power of " + i + " is "+ result);
		while(e > 0) {
		result *= 2; 
		e--;
		}
		}
	}
}


