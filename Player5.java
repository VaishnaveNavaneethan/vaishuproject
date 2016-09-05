/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=new String();
		String s=new String();
		s=sc.nextLine();
		for(String a:s.split(" "))
		{
			a=a.substring(0,1).toUpperCase()+a.substring(1,a.length());
			str=str+a;
		}
		System.out.println(str);
	}
	
}
