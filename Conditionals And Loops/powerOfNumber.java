import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int product=1;
      for(int i=1;i<=b;i++)
      {
        product*=a;
      }
      System.out.println(product);
	}
}
