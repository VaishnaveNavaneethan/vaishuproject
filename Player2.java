
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fct=1;
		if(n>1)
		{
		for(int i=1;i<=n;i++)
		{
			fct*=i;
		}
		System.out.println(fct);
		}
		else
		{
			System.out.println("-infinity");
		}
	}
	
}
