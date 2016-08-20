/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Isomorphic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int f=0;
		if(str1.length()==str2.length())
		{
			int a[]=new int[str1.length()];
			for(int i=0;i<str1.length();i++)
			{
				for(int j=i+1;j<str1.length();j++)
				{
					if(str1.charAt(i)==str1.charAt(j))
					{
						a[i]=1;
						a[j]=1;
					}
				}
			}

			int a1[]=new int[str2.length()];
			for(int i=0;i<str2.length();i++)
			{
				for(int j=i+1;j<str2.length();j++)
				{
					if(str2.charAt(i)==str2.charAt(j))
					{
						a1[i]=1;
						a1[j]=1;
					}
				}
				if(a1[i]==a[i])
				{
					f++;
				}
			}

			/*for(int i=0;i<a.length;i++)
			{
				if(a[i]==a1[i])
				{
					f++;
				}

			}*/
			if(f==a.length)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			System.out.println("false");
		}

	}
}
