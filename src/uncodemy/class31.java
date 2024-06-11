package uncodemy;

public class class31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerloop:
			for(int i=1; i < 10; i++) { 
			System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
			for(int j = 1; j < 10; j++) { 
			if(j == 5) continue outerloop; 
			System.out.print(j);
			}
			}
	}

}
