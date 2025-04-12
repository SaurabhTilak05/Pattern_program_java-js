/*
19. Print Inverted Number Pattern
Description: Write a program to print an inverted number pattern.
Input: n = 5
Output:

 Copy
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

import java.util.*;
public class InvertNumberPattern
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int a=5;
			for(int j=1;j<=n;j++)
			{
				if(j>=i)
				{
					System.out.print(a);
					
				}
				a--;
			}
			System.out.println("");
		}
		
		
	}
}