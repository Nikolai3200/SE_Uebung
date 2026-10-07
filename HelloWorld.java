import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) 
	{
		System.out.println("Hello World");
		Scanner myObj = new Scanner(System.in);
    	System.out.println("Enter username");
		String Name = myObj.nextLine();
    	System.out.println("Hallo " + Name);
	}	
}
