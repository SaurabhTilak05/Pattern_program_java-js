/*
0
0	1
0	1	2
0	1	2	3
0	1	2	3	4
0	1	2	3	4	5

*/
public class Pattern
{
	public static void main(String x[])
	{
		for (int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}