import java.util.Scanner;
public class SimpleCompound {
	public static Scanner scan;
	public static void main(String args [])
	{
		double si,ci;
		int p,t,r;
		scan = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
	     p=scan.nextInt();
	     System.out.print("Enter the Interest rate per anum: ");
		 r=scan.nextInt();
		 System.out.print("Enter the time period: ");
		 t=scan.nextInt();
		    si=(p*t*r)/100;
		    ci=(p+r)*t;
		    System.out.println("Simple interest is: " + si);
		    System.out.println("Compound interest is: " + ci);
	}
}
