import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

      
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1");
			}
          System.out.println();
		}
	}
}
