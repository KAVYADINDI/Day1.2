import java.util.Scanner;
public class Palindrome {
	public static Scanner scan;
	public static void main(String args [])
	{
		int num,res=0,temp,rem;
		scan = new Scanner(System.in);
		System.out.print("Enter the number");
		num=scan.nextInt();
		temp=num;
		while(num!=0)
		{
		rem=num%10;
		res=10*res+rem;
		num=num/10;
		}
		if(res==temp) {
			System.out.print("true");
		}
		else
		{
			System.out.print("false"); 
		}
	}
}
