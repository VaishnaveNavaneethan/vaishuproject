/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the k");
		int k=sc.nextInt();
		String s=String.valueOf(n);
		char[]a=s.toCharArray();
		Arrays.sort(a);
		s=String.valueOf(a);
		System.out.println(s);
		
		int output=0;
		if(k<s.length())
		{
		if(n>1)
		{
			if(s.charAt(0)=='0')
			s=s.charAt(1)+""+s.charAt(0)+""+s.substring(2,s.length());
			
			output=Integer.parseInt(s.substring(0,s.length()-k));
		}
		else
		{
			int j=s.length()-1;
			String ss=new String();
				System.out.println("i "+s.length());
			for(int i=1;i<=((s.length()-1)-k);i++)
			{
				
			 ss=ss+s.charAt(j)+"";
			j--;
			}
			output=-Integer.parseInt(ss);
		}
		System.out.println("least num "+output);
		}
	}
}
