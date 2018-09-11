
public class solution {

	public static void print(int n) {
		//Write your code here

      
       for(int i=1;i<=n/2+1;i++)
      {
          
          for(int j=1;j<=i;j++)
        	{	
			System.out.print("*");
    	    }
			System.out.println();
      }
       for(int i=1;i<=n/2;i++)
      {
          
          for(int j=n/2;j>=i;j--)
        	{	
			System.out.print("*");
    	    }
			System.out.println();
      }


	}

}
