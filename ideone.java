import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ideone
{
	public static void main (String[] args)
	{
	 int n;
	 Scanner scr=new Scanner(System.in);
	 n=scr.nextInt();
	 if(n>0)
	 {
	 	System.out.println("positive number");
	 }
	 else if(n<0)
	 {
	 	System.out.println("negative number");
	 }
	 else if(n==0)
	 {
	 	System.out.println("zero");
	 }
	}
}
