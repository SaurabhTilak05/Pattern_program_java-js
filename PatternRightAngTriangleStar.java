/* Print Triangle of Stars
Description: Write a program to print a triangle of stars.
Input: n = 4
Output:
*
**
***
****
*/
import java.util.*;
public class PatternRightAngTriangleStar
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Triangle");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
