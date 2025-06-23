

public class Q1Pattern {

	public static void main(String[] args) {
		int a=5;
	for(int i=0;i<a;i++) {
		
		for(int j=0;j<a;j++)
		{
			int n;
			if(i>j) {
				n=i-j;
			}
			else {
				n=j-i;
			}
			System.out.print(n+" ");
		}
		System.out.println("");
		
	}

	}

}
