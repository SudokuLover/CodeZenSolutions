import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      
      int i=0;
      
      while(n>0)
      {
      	i=10*i+n%10;
        n/=10;
      }
      System.out.println(i);
	}
}
