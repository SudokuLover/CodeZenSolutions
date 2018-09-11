import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		
      Scanner sc = new Scanner(System.in);
      long n= sc.nextInt();
      long k=sc.nextInt();
 	  long sum=0;
      if(k==1)
      {
        for(long i=1;i<=n;i++)
        {
          sum+=i;
        }
      }
      else if(k==2)
      {
        sum=1;
        for(long i=1;i<=n;i++)
        {
          sum*=i;
        }
      }
      else{
        sum=-1;
      }
System.out.println(sum);
	}
}
