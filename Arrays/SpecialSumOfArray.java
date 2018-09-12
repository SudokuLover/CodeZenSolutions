public class solution {

	public static int sum(int arr[])
	{
         //Write code here
      int sum=200;
      int y=1;
      int k=0;
      for(int i=0;i<arr.length;i++)
      {
		k+=arr[i];
      }
      
     while(k>10)
     {
       sum=k;
       k=0;
       while(sum>0)
      {
        k+=sum%10;
        sum/=10;
      }
       
     }
      return k;
	}
}
