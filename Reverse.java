/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		StringBuffer sb=new StringBuffer(a);
	for(int i=0;i<sb.length();i++)
	{
		if(sb.charAt(i)=='a'|sb.charAt(i)=='e'|sb.charAt(i)=='i'|sb.charAt(i)=='o'|sb.charAt(i)=='u'|sb.charAt(i)=='A'|sb.charAt(i)=='E'|sb.charAt(i)=='I'|sb.charAt(i)=='O'|sb.charAt(i)=='U')
		{
			sb.deleteCharAt(i);
			i=i-1;
		}
	}
	sb.reverse();
	String a1=sb.toString();
	System.out.println(a1);

	}
}
