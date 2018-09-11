import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      
      int i=0;
      int sum=0;
      while(n>0)
      {
      	int k = n%10;
        
        sum+=Math.pow(2,i++)*k;
        n/=10;
      }
      System.out.println(sum);
	}
}
