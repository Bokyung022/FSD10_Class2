package June8th;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int mynum = 9;
		double myDouble = mynum;
		
		System.out.println(mynum);
		System.out.println(myDouble);
		*/
		
		double avg = 22.4;
		int intavg = (int) avg;
		System.out.println(intavg);
		
		//widening casting int -> double
		int intNum = 11;
		double doubleNum = intNum;
		System.out.println(doubleNum);
		
		//narrowing casting double -> int
		double doubleAvg = 11.2;
		int intAvg = (int) doubleAvg;
		System.out.println(intAvg);
		
		/*
		 Widening Casting (automatically) - convert a smaller type to a larger type size
		 
		 Narrowing Casting (manually) - convert a larger type to a smaller type size
		 */
	}

}
