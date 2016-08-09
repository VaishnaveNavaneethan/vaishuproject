import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[]=new int[]{5,3,1,6,4};
		int b=a.length;
		System.out.println("enter the nos");
		for(int i=0;i<b;i++)
		{//System.out.println(a[i]);
			for(int j=i+1;j<b;j++)
			{
 
				if(a[j]<a[i])
				{
					System.out.print(a[j]);
					break;
				}
				else 
				{
					System.out.print(-1);
					break;
				}
 
			}
			if(i==b-1)
			{
				System.out.print(-1);
				break;
			}
		}
	}
}
