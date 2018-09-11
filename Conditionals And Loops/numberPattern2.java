import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		if(n>=1)
		{
			System.out.println("1");
		}
		if(n>=2)
		{
			System.out.println("11");
		}
		
		for( i=3;i<=n;i++)
		{
			System.out.print(i-1);
			for(int j=1;j<=i-2;j++)
			{
				System.out.print("0");
			}
			System.out.print(i-1);
			System.out.println();
		}
	}
}
