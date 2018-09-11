
public class Solution {

	/* Input
	 * n - number of rows */
	public static void printPattern(int n){

		// Write your code here

      int k=1;
      int h=0;
      if(n%2==0)
      {
        h=n/2;
      }
      else{
        h=(n/2)+1;
      }
      for(int i=1;i<=h;i++)
      {
        for(int j=1;j<=n;j++)
        {
          System.out.print(k++ +" ");
        }
        k+=n;
          System.out.println();
     
	}
     k-=n+1;
   
      if(n%2!=0)
      {
         k-=2*n-1;
      int o=2;
  	for(int i=1;i<=(n/2);i++)
      {
        for(int j=1;j<=n;j++)
        {
          System.out.print(k++ +" ");
        }
        k-=(o+i)*n-1;
      o--;
      k--;
          System.out.println();
   }
      }
        else{
          k++;
        for(int j=1;j<=n;j++)
        {
          System.out.print(k++ +" ");
        }
             System.out.println();
       
                  k-=3*n;   
   for(int i=1;i<h;i++)
      {
        for(int j=1;j<=n;j++)
        {
          System.out.print(k++ +" ");
        }
        k-=3*n;
          System.out.println();
   }

          
          
        }
      
    }
}
