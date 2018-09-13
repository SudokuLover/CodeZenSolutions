public class solution {

	public static void change(int arr[])
	{
	//Write code here 
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]/4!=0 )
        {
          
          arr[i]=arr[i]/4;
        }
        else{
         arr[i]=-1;  
        }
      }
      
        }
}
