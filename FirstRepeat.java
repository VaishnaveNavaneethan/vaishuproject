import java.util.*;
public class FirstRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int [] a=new int[n];
				int count=0;
				int num=0;
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
				for(int i=0;i<n;i++)
				{
					for(int j=i+1;j<n;j++)
					{
						if(a[i]==a[j])
						{
							count=1;
							num=a[i];
							break;
						}
					}
					if(count==1)
					{
						break;
					}
				}
				if(count==1)
				System.out.println(num);
				else
					System.out.println("no number");
				
				
			}

		}

