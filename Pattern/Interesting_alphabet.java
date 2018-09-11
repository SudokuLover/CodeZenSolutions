public class solution {

	public static void print(int n) {
		//Write your code here
      char ch='A';
      ch+=n;
      
      for(int i=1;i<=n;i++)
      {
        char k=ch;
        k-=i;
        for(int j=1;j<=i;j++)
        {
        System.out.print(k);
          k++;
        }
        
        System.out.println();
      }
	}

}
