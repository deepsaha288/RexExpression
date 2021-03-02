
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

	public static void lastName()
	{
		String lastName = user.next();
		boolean name1= Pattern.matches("^[A-Z]{1}[a-z]{3,}$",lastName);
		if(name1==true)
		{
			System.out.println(lastName+" is valid firstname");
		}
		else
		{ 
			System.out.println("Please reenter valid user name");
			lastName();
		}

	}

	public static void email()
	{
		String email = user.next();
		boolean email1= Pattern.matches("^[A-Za-z0-9]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", email);
		if(email1==true)
		{
			System.out.println(email1+" is valid email");
		}
		else
		{ 
			System.out.println("InValid !!!,,Please reenter valid email");
			email();  
		}

	}

	static void phoneNumber() {

		String phone = user.nextLine();
		boolean result = Pattern.matches("^[0-9]{2}[ ][6-9]{1}[0-9]{9}$", phone);
		if (result == true) {
			System.out.println("You Have Enter Valid Mobile Number: " +phone);
		}else {
			System.out.println("Please Re-enter Mobile Number: ");
			phoneNumber();
		}
	}


	public static void password() 
	{
		String pwd= user.next(); 
		
		boolean passwords= Pattern.matches("(?=.?[A-Z]).{1,}(?=.?[a-z]).{7,}(?=.*?[0-9]).{1,}$",pwd);
		

		if(passwords==true)   
		{  
			System.out.println("you have entered valid password");  
		}
		else
		{  
			System.out.println("Invalid !!-->Please reenter valid password") ;
			password();
		}

	}



	public static void main(String[] args) {
		System.out.println("enter the user first name"); 
		firstName();
		System.out.println("enter the user last name");
		lastName();
		System.out.println("enter the user email id");
		email();
		System.out.println("enter the user phone-number ");
		phoneNumber();
		System.out.println("enter your passward ");
		password();

	}
}
