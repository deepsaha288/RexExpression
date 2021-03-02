import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regax {
	static Scanner user =new Scanner(System.in);

	public static void firstName()
	{
		String firstName = user.next();
		boolean name= Pattern.matches("^[A-Z]{1}[a-z]{3,10}$",firstName);
		if(name==true)
		{
			System.out.println(firstName+" is valid firstname");
		}
		else
		{ 
			System.out.println("Please reenter valid user name");
			firstName();
		}

	}

	public static void main(String[] args) {
		System.out.println("enter the user first name");
		firstName();
	}
}
