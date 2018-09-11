import java.util.*;
public class Main {
	
  public static String reverse(String sum)
  {
    String s="";
    
    for(int i=sum.length()-1;i>=0;i--)
    {
      s+=sum.charAt(i);
    }
    
    return s;
  }
	public static void main(String[] args) {
		// Write your code here
		
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
     String sum="";
      while(n>0)
      {
         sum+=n%2;
        n/=2;
       
      }
      sum=reverse(sum);
      if(sum.equals(""))
      	System.out.println("0");
      else
        System.out.println(sum);
       
	}
}
