
public class solution {

	public static void print(int n) {
	//Write your code here
     
      for(int i=1;i<n;i++)
      {
        for(int j=1;j<i;j++)
        {
          System.out.print(" ");
        }
          System.out.print(i);
        for(int j=1;j<=2*(n-i)-1;j++)
        {
          System.out.print(" ");
        }
          System.out.print(i);
        
         System.out.println();
      }
         for(int j=1;j<n;j++)
        {
          System.out.print(" ");
        }
          System.out.println(n);
     
      for(int i=n-1;i>=1;i--)
      {
        for(int j=1;j<i;j++)
        {
        	  System.out.print(" ");
        }
          System.out.print(i);
         for(int j=1;j<=2*(n-i)-1;j++)
        {
        	  System.out.print(" ");
        }
          System.out.print(i);
        
        System.out.println();
        
      }
      
	}

}
