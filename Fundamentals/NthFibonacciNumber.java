
import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int a=1;
      int b=1;
      int c=0;
      while(n>2)
      {
        c=a+b;
        a=b;
        b=c;
        n--;
      }
		System.out.println(c);
	}

}
