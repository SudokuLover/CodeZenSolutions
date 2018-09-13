import java.util.*;
public class Solution {

	// input - input array
	public static boolean containsConsecutiveNumbers(int[] input){
		// Write your code here	
      Arrays.sort(input);
      
      for(int i=1;i<input.length;i++)
      {
        if(input[i-1]+1!=input[i])
          return false;
      }

      return true;
	}
	
}
