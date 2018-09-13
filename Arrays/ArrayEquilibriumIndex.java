public class ArrayEquilibrium{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
      int sum=0;
      int n=arr.length;
      for(int i=2;i<n;i++)
        sum+=arr[i];
      
      int k=arr[0];
      for(int i=1;i<n-1;i++)
      {
        if(k==sum)
          return i;
        else {
          k+=arr[i];
          sum-=arr[i+1];
        }
      }
      return -1;
	}
}