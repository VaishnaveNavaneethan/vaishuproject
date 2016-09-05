package first;
import java.util.*;
public class GuviPlayer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(Character.isAlphabetic(str.charAt(0)))
		{
		StringBuffer l=new StringBuffer(str);
		l.reverse();
		System.out.println(l);
		}
		else
		{
			System.out.println("not a String");
		}
	}

}
