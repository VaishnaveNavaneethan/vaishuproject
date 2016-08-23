
import java.util.*;
public class Firstoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []a1=new String[n];
		Set<String> a=new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.next();
			if(a.contains(a1[i]))
			{
				a.remove(a1[i]);
			}
			else
			{
				a.add(a1[i]);
			}
		}
		Object []s=a.toArray();
			if(s.length!=0)
		System.out.println(s[0]);
		else
		System.out.println("no element");
		
	}

}
