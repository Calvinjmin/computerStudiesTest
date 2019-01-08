package confirmedGroupProject;

//Person A: Calvin Min
public class personC extends personA {

	//added a main method
	public static void main ( String [] args ) {
		int return = randoRange( int low, int high );
		System.out.println( "Random Number: " + return );
	}

	public int randoRange( int low, int high ) //changed the amount of parameters taken
	{
		int i = 0;
		i = (int)( Math.random() * high) + low; //changed this to a Math.Random() scenario
		return i;
	}
}
