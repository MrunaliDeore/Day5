package Five;

import java.util.Scanner;

public class HeadTail 
{
	public static void main(String[] args) 
	{ 
		int hCount = 0;
		int tCount = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("How many coins should be tossed? ");
		int coinsCount = input.nextInt();
		for (int i=0; i < coinsCount; i++) 
		{
			if (Math.random() < 0.5)
			{
				System.out.println("Heads");
				hCount++;
			} else 
			{
				System.out.println("Tails");
				tCount++;
			}
		}
		System.out.println("Heads: "+hCount+", Tails: "+tCount);
		
		int total_count_HT=hCount+tCount;
		System.out.println("Total count of head and tail :"+total_count_HT);
		
		int percentage= (total_count_HT/coinsCount)*100;
        System.out.println("Percentage of flip coin :"+percentage);
	}
}
