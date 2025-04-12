/*Print Hollow Square
Description: Write a program to print a hollow square pattern.
Input: n = 5
Output:
*****
*   *
*   *
*   *
*****
*/
import java.util.*;
public class PrintPatternHollowSquare
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter For Square");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||i==n||j==n)
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
