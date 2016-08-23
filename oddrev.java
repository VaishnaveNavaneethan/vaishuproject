

import java.util.Scanner;

public class oddrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the line");
		String s=new Scanner(System.in).nextLine();
		String[] a=s.split(" ");
		StringBuffer sb;
		String str=new String();
		int i=0;
		int j=0;
		if(!(s.isEmpty()))
		{
		for(String p:s.split(" "))
		{
			if(i==j)
			{
				sb=new StringBuffer(p);
				p=sb.reverse().toString();
				j=j+2;
			}
			str+=p+" ";
			i++;
		}
		System.out.println(str);
		}
		else
		{
			System.out.println("no words");
		}
	}

}
