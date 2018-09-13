import java.util.ArrayList;

public class solution {
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    // Write your code here

      int sum=0;
      int max=-23478389;
      int start=0;
      int end=0;
      
      for(int i=0;i<a.size();i++)
      {
        if(sum<0)
        {
           sum=0;
          start=i;
        }
        sum+=a.get(i);
        if(max<sum)
        {
         max=sum;
          end=i;
        }
      }
      ArrayList<Integer> al=new ArrayList<Integer>();
      for(int i=start;i<=end;i++)
      {
        al.add(a.get(i));
      }
      return al;
	}
}