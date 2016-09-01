
import java.util.Scanner;

public class DoubleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		if(s.length()%2==0)
		{
			    int hlen=s.length()/2;
				String s1=s.substring(0, hlen);
				String s2=s.substring(hlen, s.length());
				if(s1.equalsIgnoreCase(s2))
				{
					System.out.println("double string");
				}
				else
				{
					System.out.println("not a double string");
				}

		}
	else
	{
		System.out.println("not a double string");
	}


	}

}
