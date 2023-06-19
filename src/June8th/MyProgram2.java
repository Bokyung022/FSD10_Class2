package June8th;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int val1, val2;

		System.out.println("Please give me the first int num");
		val1 = kb.nextInt();
		System.out.println("Please give me the second int num");
		val2 = kb.nextInt();

		System.out.println("Your first int num is " + val1);
		System.out.println("Your second int num is " + val2);
		System.out.println("================================");

		int add, sub, mult, div, mod;
		add = val1 + val2;
		sub = val1 - val2;
		mult = val1 * val2;
		div = val1 / val2;
		mod = val1 % val2;

		System.out.println("The addition in int is " + add);
		System.out.println("The subtraction in int is " + sub);
		System.out.println("The mult in int is " + mult);
		System.out.println("The division in int is " + div);
		System.out.println("The reminder in int is " + mod);
		System.out.println("================================");

		double dval1, dval2;

		System.out.println("Please give me the first double num");
		dval1 = kb.nextDouble();
		System.out.println("Please give me the second double num");
		dval2 = kb.nextDouble();

		System.out.println("Your first double num is " + dval1);
		System.out.println("Your second double num is " + dval2);
		System.out.println("================================");

		double dadd, dsub, dmult, ddiv, dmod;
		dadd = dval1 + dval2;
		dsub = dval1 - dval2;
		dmult = dval1 * dval2;
		ddiv = dval1 / dval2;
		dmod = dval1 % dval2;

		System.out.println("The addition in double is " + dadd);
		System.out.println("The subtraction in double is " + dsub);
		System.out.println("The mult in double is " + dmult);
		System.out.println("The division in double is " + ddiv);
		System.out.println("The reminder in double is " + dmod);
		System.out.println("================================");

		kb.close();
	}

}
