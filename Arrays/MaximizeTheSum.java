
/*
Maximize the sum

Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces
Output Format :
Maximum sum value
Constraints :
1 <= M, N <= 10^6
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Sample Output Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81

*/


/*you just need to write your own main where read 2 arrays and pass in maximumSumPath*/
public class Solution {

	public static long maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
      int i=0;
      int j=0;
      int l1=input1.length;
      int l2=input2.length;
      int n;
      int prev1=0;
      int prev2=0;
   
      long sum=0;
      
      
        int k1=0;
        int k2=0;
      
      while(i<l1 && j<l2){
        if(input1[i]==input2[j])
        {
          	k1=calculate(prev1,i,input1);
         	k2=calculate(prev2,j,input2);
    //      System.out.println(input1[i] +" "+input2[j] );
      //    System.out.println(k1 +"  k2   " +k2 );
          sum+=max(k1,k2);
        //  System.out.println(sum );
          
          i++;
          j++;
            prev1=i;
            prev2=j;
        }
        else if(input1[i]<input2[j]){
          i++;
        }
        else{
          j++;
        }
        
      }
      
       k1=0;
        k2=0;
        if(i<l1)
        {
          k1=calculate(prev1,l1-1,input1);
        }
        if(j<l2)
        {
        	  k1=calculate(prev2,l2-1,input2);     
        }
       
        sum+=max(k1,k2);
        
      //System.out.println(sum);
		return sum;
	}
  
  public static int max(int i,int j)
  {
    if(i>j)
      return i;
    else
      return j;
  }
  public static int calculate(int i,int j,int[] arr){
    int sum=0;
    for(int k=i;k<=j;k++)
      sum+=arr[k];
    
    return sum;
  }
  
}
