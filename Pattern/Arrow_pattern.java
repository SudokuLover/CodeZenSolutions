import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();

 int k=n/2;
		for(int i=1;i<=k+1;i++)
        {
          for(int j=1;j<i;j++)
          {
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++)
          {
            System.out.print("* ");
          }
            System.out.println();
          
        }
		for(int i=1;i<=k;i++)
        {
          for(int j=i;j<k;j++)
          {
            System.out.print(" ");
          }
          for(int j=i;j<=k;j++)
          {
            System.out.print("* ");
          }
            System.out.println();
          
        }
		
	}

}
