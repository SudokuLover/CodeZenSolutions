
public class solution {

	public static void print(int n) {
      int k=1;
        for(int i=n;i>=1;i--)
      {
        for(int j=1;j<=i;j++)
        {
          if(k%2!=0)
          {
            System.out.print("1");
          }
          else{
            System.out.print("0");
          }
        }
          k++;
          System.out.println();
        
      }
	}

}
