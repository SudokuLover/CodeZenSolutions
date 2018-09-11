
public class solution {

	public static void print(int n) {
		//Write your code here
      
      for(int i=1;i<n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(i%2==0)
          {
            if(j%2==0)
            System.out.print("*");
            else
              System.out.print(" ");
            
          }
          else if(i%2!=0)
          {
            if(j%2!=0)
            System.out.print("*");
            else
              System.out.print(" ");
          }
        }
         
         for(int j=1;j<=2*(n-i)-1;j++)
          {
			System.out.print(" ");
          }
         for(int j=1;j<=i;j++)
          {
              if(j%2!=0)
              System.out.print("*");
              else
                System.out.print(" ");
          }
        
            System.out.println();
      }
      
     if(n%2!=0)
     {
         for(int i=1;i<=2*n-1;i++)
        {
            if(i%2!=0)
            System.out.print("*");
            else
              System.out.print(" ");
        }
            System.out.println();
     
     }
      else{
       for(int i=1;i<=2*(n-1);i++)
        {
            if(i%2==0)
            System.out.print("*");
            else
              System.out.print(" ");
        }
            System.out.println();    
      }
      
      for(int i=n-1;i>=1;i--)
      {
        for(int j=1;j<=i;j++)
        {
          if(i%2==0)
          {
            if(j%2==0)
            System.out.print("*");
            else
              System.out.print(" ");
            
          }
          else if(i%2!=0)
          {
            if(j%2!=0)
            System.out.print("*");
            else
              System.out.print(" ");
          }
        }
          for(int j=1;j<=2*(n-i)-1;j++)
          {
			System.out.print(" ");
          }
         for(int j=1;j<=i;j++)
          {
              if(j%2!=0)
              System.out.print("*");
              else
                System.out.print(" ");
          }
       
            System.out.println();
      }
      
	}

}
