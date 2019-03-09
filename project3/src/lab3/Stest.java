package lab3;
//Experiment 3
public class Stest 
{
	public static void main(String[] args)
	{
		//changes integer to string
		int x  = 42;
		String s =  "" + x;
		System.out.println(s);
		
		//changes string to integer
		String s1 = "42";
		int x1 = Integer.parseInt(s1);
		System.out.println(x1);
		
		//attempts to change the string "Hello" to an integer
		String s2 = "Hello";
		int x2 = Integer.parseInt(s2);
		System.out.println(x2);
		
		//attempts to change the string "23Skidoo" to an integer
		String s3 = "23Skidoo";
		int x3 = Integer.parseInt(s3);
		System.out.println(x3);
	}

}
