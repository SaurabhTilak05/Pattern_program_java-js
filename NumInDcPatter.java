/*
1
6	1
10	5	1
13	8	4	1
15	10	6	3	1
16	11	7	4	2	1
*/

public class NumInDcPatter 
{
	public static void main(String x[])
	{
		int a = 1;
        for (int i = 1; i <= 6; i++)
        {
            int currentNum = a;
            int b = 5; 

            for (int j = 1; j <= i; j++)
            {
                System.out.print(currentNum + "\t");
                if (j < i) {
                    currentNum -= (b - (j - 1)); 
                }
            }
            System.out.println();
            if (i < 6) {
                a += (6 - i);
            }
        }
	}
}