import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      Scanner sc = new Scanner(System.in);
      int basic = sc.nextInt();
      char ch= sc.next().charAt(0);
      
      int allow=0;
      if(ch=='A')
        allow=1700;
      else if(ch=='B')
        allow=1500;
      else 
        allow=1300;
      
      float total=(float)(159*basic)/100+allow;
      System.out.println(Math.round(total));

	}
}
