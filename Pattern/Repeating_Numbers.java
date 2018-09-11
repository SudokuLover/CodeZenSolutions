
public class solution {

	public static void print(int n) {
		//Write your code here
	
      int k=1;
      for(int i=0;i<n;i++)
      {
        for(int j=1;j<=Math.pow(2,i);j++)
        {
          k=k%10;
          if(k==0)
            k++;

          System.out.print(k);
          k++;
        }
          System.out.println();
      }
    }
}
