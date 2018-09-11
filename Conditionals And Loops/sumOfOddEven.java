import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int even=0;
      int odd=0;
      while(n>0)
      {
        int c=n%10;
        if(c%2==0)
          even+=c;
        else
          odd+=c;
          
          n/=10;
      }
      System.out.println(even+" "+odd);
	}
}
