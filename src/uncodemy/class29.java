package uncodemy;

public class class29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		done:
			for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
			for(int k=0; k<10; k++) { 
			System.out.println(k);
			if(k == 5) 
			break 
			done; // jump to done
			}
			System.out.println("After k loop"); // skipped
			}
			System.out.println("After j loop"); // skipped
			}
			System.out.println("After i loop");
	}

}
