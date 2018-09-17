import java.util.Scanner;
import java.util.*;
public class CarRegistrationNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Car Registered number");
		String a=sc.next();
		carnumber(a);
	}
public static boolean carnumber(String s)
{
	if(s.length()==10)
	{
		if(s.charAt(0)>=65 && s.charAt(0)<=90 && s.charAt(1)>=65 && s.charAt(1)<=90 &&
				s.charAt(2)>=48 && s.charAt(2)<=57 && s.charAt(3)>=48 && s.charAt(3)<=57 &&
				s.charAt(4)>=65 && s.charAt(4)<=90 && s.charAt(5)>=65 && s.charAt(5)<=90 && 
				s.charAt(6)>=48 && s.charAt(6)<=57 && s.charAt(7)>=48 && s.charAt(7)<=57 &&
				s.charAt(8)>=48 && s.charAt(8)<=57 && s.charAt(9)>=48 && s.charAt(9)<=57) 
		          {
					System.out.println("Valid Car Registered Number");
				  }
					else
					{
						System.out.println("Enter Correct Car Registered number");
					}
					}
	else
	{
	System.out.println("Enter Valid Car Registered number");
}


return true;
}
}