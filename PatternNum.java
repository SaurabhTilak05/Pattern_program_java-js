import java.util.*;
public class PatternNum
{
	public static void main(String x[])
	{
		for(int i=1;i<=4;i++)
		{
			int a=1;
			for(int j=1;j<=7;j++)
			{
				if(j>4-i && j<4+i)
				{
					System.out.print(a);
					if(j<=3){
						a++;
					}
					else{
						a--;
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}


/*


import java.util.*;
class PatternApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int r=sc.nextInt();
		
		for(int i=1; i<=4; i++){
			int no=1;
			for(int j=1; j<=7; j++){
				if(j>4-i && j<4+i){
					System.out.print(no);
					if(j<=3){
						no++;
					}
					else{
						no--;
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
*/