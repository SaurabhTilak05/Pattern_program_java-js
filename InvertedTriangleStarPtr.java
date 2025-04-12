/*Print Inverted Star Pattern
Description: Write a program to print an inverted star pattern.
Input: n = 4
Output:
 ****
 ***
 **
 *
*/
import java.util.*;
public class InvertedTriangleStarPtr
{
	public static void main(String x[])
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter Size Of Pattern ");
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}