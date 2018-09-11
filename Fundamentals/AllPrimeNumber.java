import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=2;i<=n;i++)
      {
       	 int k=primeCheck(i);
        if(k==1)
          System.out.println(i);
      }
		
	}
  static int primeCheck(int n){
    for(int i=2;i<n;i++)
    {
    	if(n%i==0)
          return 0;
    }
    return 1;
  }
}
