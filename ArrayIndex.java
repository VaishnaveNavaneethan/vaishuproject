/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayIndex
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
			if(i>0&&a[i-1]<a[i])
			{
				continue;
			}
			else if(i>0&&a[i-1]>a[i])
			{
				f=1;
				System.out.println(a[i]);
				break;
			}
		
		}
		if(f==1)
			{
				System.out.println("give increasing array");
			}
		else{
		for(int i=0;i<len;i++)
		{
				if(a[i]==i)
				{
					System.out.println(a[i]);
				}
		}
		}
		
	}
}
