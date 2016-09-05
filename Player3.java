
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		if(n>9)
		{
		while(n!=0)
		{
			int a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		System.out.println(sum);
		}
		else
		{
			System.out.println(n);
		}
		
	}
	
}
