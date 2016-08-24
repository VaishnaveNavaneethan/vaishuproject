
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class justifyy
{
	public void justline(String lin,int l )
	{
		ArrayList<String> s1=new ArrayList<String>();
		StringBuffer str=new StringBuffer();
	StringBuffer s=new StringBuffer();
String last=" ";
	int n=0;
		for(String p:lin.split( ","))
		{
		/*	for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='\'')
				{
					str.deleteCharAt(i);
					i=-1;
				}
			}*/
			int n1=0;
			for(int i=0;i<p.length();i++)
			{
				if((p.charAt(i)>=97)&&(p.charAt(i)<=122))
				{	n1++;
				}
			}
		//	System.out.println(str+" "+n1);
			n+=n1+1;
			//n+=p.length()+1;
			if(n<=l)
			{
			//System.out.println(n);
			s.append(p+" ");
			}
			else
			{
				//System.out.println(s);
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='\'')
					{	int k=i+1;
						while(k<s.length()-1)
						{
							if(s.charAt(k)=='\'')
							{
								s.deleteCharAt(k);
								k=k-1;
							}
							k++;
						}
						break;
					}
				}
				//System.out.println(s);
				String srk=s.toString();
				srk=srk.trim();
				srk+="'";
				s1.add(srk);
				n=0;
				s=new StringBuffer(" ");
				s.append(p+" ");
			}

		}
		String srk=s.toString();
		for(String q:srk.split("]"))
		{q=q.trim();
		s1.add(q);
		break;
		}
		s1.add("]");
		Iterator<String> it=s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}



public class LeftJust1 {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the line");
	String line=sc.nextLine();
	System.out.println("enter the l value");
	int l=sc.nextInt();
	justifyy j=new justifyy();
	j.justline(line,l);
	}

}
