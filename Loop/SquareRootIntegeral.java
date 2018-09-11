import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      
    int i=1;
      while((i*i)<n)
      {
        i++;
      }
      System.out.println(i-1);
	}
}
