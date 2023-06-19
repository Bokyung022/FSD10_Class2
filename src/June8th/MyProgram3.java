package June8th;

import java.util.Scanner;

public class MyProgram3 {

	static final int LEGAL_AGE = 18;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * boolean isPargolFun = true; System.out.println(isPargolFun);
		 * 
		 * int x,y; x = 9; y = 2;
		 * 
		 * boolean comp = x > y;
		 * 
		 * System.out.println(comp); 
		 * System.out.println(x == 9); 
		 * System.out.println(10 == 9);
		 */

		Scanner kb = new Scanner(System.in);
		System.out.println("Give me your age");
		int age = kb.nextInt();
		System.out.println("You are bigger than legal age");
		System.out.println(age > LEGAL_AGE);
		
		kb.close();

	}

}
