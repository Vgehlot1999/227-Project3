package lab3;

import java.util.Random;

public class RandomSample 
{
	public static void main(String [] args)
	{
		Random rand = new Random();
		int x = rand.nextInt(6);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		
		System.out.println(rand.nextInt(137));
		System.out.println(rand.nextInt(137));
		System.out.println(rand.nextInt(137));
		System.out.println(rand.nextInt(137));
		System.out.println(rand.nextInt(137));
		System.out.println(rand.nextInt(137));
		System.out.println(rand.nextInt(137));
		System.out.println(rand.nextInt(137));
	}

}
