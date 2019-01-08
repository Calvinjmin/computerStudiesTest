package confirmedGroupProject;

public class personA {
	public static void main( String [] args, int one, int two ) {
		System.out.println("Type in two integers");
		int average = avg( one, two );
		System.out.println("This is your average: " + average);
	}
	
	public int avg( int a , int b ) {
		return (a + b) / 2;
	}

}
