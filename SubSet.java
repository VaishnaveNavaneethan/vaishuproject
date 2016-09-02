/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SubSetpgm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int []a=new int[len];
		int f=0;
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		int len1=sc.nextInt();
		if(len1<len)
	{
		int []a1=new int[len];
		for(int i=0;i<len1;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len1;j++)
			{
				if(a[i]==a[j])
				{
					i++;
					if(j==len1-1)
						f=1;
				}
				else
				{
					System.out.println(i);
					break;
				}
				
			}
		}
		if(f==1)
		System.out.println("a1 is aubset of a2");
	
	}	
	}
}
