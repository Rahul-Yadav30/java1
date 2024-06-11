package uncodemy;

import java.io.IOException;

public class class27 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch; 
		for( ; ; ) {
			ch = (char) System.in.read(); // get a char 
			if(ch == 'q') break;
			}
			System.out.println("You pressed q!");
	}

}
