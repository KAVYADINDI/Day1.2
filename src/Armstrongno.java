import java.util.Scanner;

public class Armstrongno {
	public static Scanner scan;
	public static void main(String args [])
	{
		int num,temp,rem,sum=0;
    scan = new Scanner(System.in);
	System.out.print("Enter the number");
	num=scan.nextInt();
	temp=num;
	while(num>0)
	{
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.print("It is an armstrong number");
	}
	else
	{
		System.out.print("It is not an Armstrong number");
	}
	}
}