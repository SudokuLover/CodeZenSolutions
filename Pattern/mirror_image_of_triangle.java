
public class solution {

	public static void print(int n) {

       for(int i=0;i<=n;i++)
      {
          
          for(int j=n;j>i;j--)
        	{	
			System.out.print(" ");
    	    }
          for(int j=i;j>0;j--)
        	{
			
			System.out.print(j);
  
			}
		  	System.out.print("0");
         
          for(int j=1;j<=i;j++)
        	{
			
			System.out.print(j);
  
			}
        
			System.out.println();
      }
	}

}
