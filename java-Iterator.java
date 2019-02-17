package homework;
import java.util.*;

public class Iterator {
	static Iterator func(ArrayList mylist)
	   {
	      Iterator it=(Iterator) mylist.iterator();
	      while(((java.util.Iterator) it).hasNext())
	      {
	         Object element = ((java.util.Iterator) it).next();
	         if(element instanceof String) //Hints: use instanceof operator
	            break;
	      }
	      return it;
	      
	}

	public static void main(String[] args) {
		 ArrayList mylist = new ArrayList();
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	      for(int i=0;i<n;i++)
	      {
	         mylist.add(sc.nextInt());
	      }
	      mylist.add("###");
	      for(int i=0;i<m;i++)
	      {
	         mylist.add(sc.next());
	      }
	      
	      
	      Iterator it=func(mylist);
	      while(((java.util.Iterator) it).hasNext())
	      {
	         Object element = ((java.util.Iterator) it).next();
	         System.out.println((String)element);
	      }
	}

}
