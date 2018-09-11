import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      
      int i=0;
      int p=1;
      while(i<n)
      {
        int k=3*p+2;
        if(k%4!=0)
        {
          System.out.print(k+" ");
          i++;
        }
        p++;
      }
	}
}
