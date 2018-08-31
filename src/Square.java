import java.util.Scanner;

public class Square {
	public static Scanner scan;
public static void main(String args [])
{
int num,sq;
scan = new Scanner(System.in);
System.out.print("Enter the number");
num=scan.nextInt();
sq=num*num;
System.out.print(num+"*1="+num+"; "+"Square:"+sq);
}
}

