package first;

import java.util.Scanner;

public class mindistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		String []arr=new String[n];
		int count=0;
		int min=n;
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("enter the first element");
		String a=sc.next();
		System.out.println("enter the last element");
		String b=sc.next();
		for(int i=0;i<n;i++)
		{
			count=0;
			if(arr[i].equals(a))
			{
				for(int j=i;j<n;j++)
				{
					count++;
					if(arr[j].equals(b))
					{

						if(min>count)
							min=count-1;
						System.out.println(min);
						i=j;
						break;
					}
				}
			}
			else if(arr[i].equals(b))
			{
				for(int j=i;j<n;j++)
				{
					count++;

					if(arr[j].equals(a))
					{
						if(min>count)
							min=count-1;
						System.out.println(min);
						i=j;
						break;
					}
				}
			}

		}
		System.out.println("count "+min);


	}

}
