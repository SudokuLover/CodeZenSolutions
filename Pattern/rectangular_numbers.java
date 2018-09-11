
public class solution {

	public static void print(int n) {
	//Write your code here
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          System.out.print(n-j+1);
        }
        for(int j=n;j>i;j--)
        {
          System.out.print(n-i+1);
        }
         for(int j=i;j<n;j++)
        {
          System.out.print(n-i+1);
        }
         for(int j=i;j>1;j--)
        {
          System.out.print(n-j+2);
        }
        System.out.println();
      }
      
      
      for(int i=2;i<=n;i++)
      {
          for(int j=n;j>=i;j--)
        {
          System.out.print(j);
        }
         for(int j=1;j<2*(i-1);j++)
        {
          System.out.print(i);
        }
         for(int j=i;j<=n;j++)
        {
          System.out.print(j);
        }
         
        System.out.println();
      }
      
      
	}

}
