package confirmedGroupProject;

public class personB {

	public static void main (String [] args, String name)
	{
		System.out.println("Type in your name");
		String newName = nameChange(name);
	}

	public String nameChange(String name)
	{
		String newName = "";
		for(int i = name.length() - 1; i >= 0; i--)
		{
			newName = newName + name.charAt(i);
		}
		return newName;
	}
}
