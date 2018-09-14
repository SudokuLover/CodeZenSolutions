import java.util.*;
public class solution {

	public static void rearrange(int arr[])
	{
	//Write code here
      
      int n = arr.length;
      int neg=0;
     
      for(int i=0;i<n;i++)
      {
        if(arr[i]>=0)
          neg++;
        if(neg*2>n)
          arr[i]=0;
      }
      neg=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]<0)
          neg++;
        if(neg*2>n)
          arr[i]=0;
      }
     
      int a[]=new int [neg];
      int b[]= new int[n-neg];
     
     int p=0; 
      for(int i=0;i<n;i++)
      {
        if(arr[i]<0)
          a[p++]=arr[i];
      }
     p=0; 
      for(int i=0;i<n;i++)
      {
        if(arr[i]>=0)
          b[p++]=arr[i];
      }
     
      
      p=0;
      int k=0;
      for(int i=0;i<n;i++)
      {
        if(i%2==0)
        {
          arr[i]=b[p++];
        }
        else{
          arr[i]=a[k++];
          
        }
      }
      
     }
}
