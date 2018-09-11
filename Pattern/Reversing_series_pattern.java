public class solution {

	public static void print(int n) {
		//Write your code here

      int k=0;
      for(int i=1;i<=n;i++)
      {
        if(i%2==0)
        {
          k=i*(i+1)/2;
        }
        else{
          k+=i;
        }
        for(int j=1;j<=i;j++)
        {
         	if(i%2!=0)
            {
              System.out.print(k++ +" ");
            }
          else{
            System.out.print(k--  +" ");
          }
          
        }
            System.out.println();
        
      }
	}

}
