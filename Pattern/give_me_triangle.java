
public class solution {

	public static void print(int n) {
		//Write your code here

      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<i;j++)
        {
          System.out.print(" ");
		}
        for(int j=i;j<=n;j++)
        {
          System.out.print("*");
		}
          System.out.println();
		
      }
	}

}
