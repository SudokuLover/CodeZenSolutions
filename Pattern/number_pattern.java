import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=n;i>=1;i--)
      {
          
          for(int j=i;j<=n;j++)
        	{	
			System.out.print(j);
    	    }
          for(int j=1;j<i;j++)
        	{
			
			System.out.print(n);
  
			}
        
			System.out.println();
      }

		
	}

}
