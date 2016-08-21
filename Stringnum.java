
import java.util.*;
public class Stringnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				char a=s.charAt(i);
				while(Character.isDigit(s.charAt(i+1)))
				{
					i=i+1;
					sum=(sum*10)+Integer.parseInt(String.valueOf(s.charAt(i)));
					if(i==s.length()-1)
						break;
				}
				while(sum>=1)
				{
					System.out.print(a);
					sum--;
				}
			}
			else
			{
				System.out.println("invalid String");
				break;
			}

		}
	}

}
