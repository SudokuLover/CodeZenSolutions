
public class solution {

	public static void print(int n) {
	//Write your code here

      int k=(n/2)+1;
      for(int i=1;i<=k;i++)
      {
        for(int j=k;j>i;j--)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++)
        {
          System.out.print("*");
        }
          System.out.println();       
      }
      for(int i=k-1;i>=1;i--)
      {
        for(int j=i;j<=k;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++)
        {
          System.out.print("*");
        }
        System.out.println();       
      }
	}


}
