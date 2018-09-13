import java.util.*;
public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		/* Your class should be named DuplicateInArray
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
    
      Arrays.sort(arr);
      for(int i=1;i<arr.length;i++)
      {
        if(arr[i]==arr[i-1])
          return arr[i];
      }
      return 0;
	}
}