import java.util.*;
public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		String se=new String();
		Set <Character> ss=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			
			if(ss.add(s.charAt(i)))
			{
				se=se+s.charAt(i)+"";
				System.out.println(se);
			}
			
		}
		System.out.println(ss);
		 System.out.println("String"+se);		
	
		
	}

}
