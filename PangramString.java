import java.util.*;
class PangramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		Set<Character> se=new TreeSet<Character>();
		char[]a=s.toLowerCase().toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isAlphabetic(a[i]))
			{
			se.add(a[i]);
			}
		}
		System.out.println(se);
		
		System.out.println(se.size());
		if(se.size()==26)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
