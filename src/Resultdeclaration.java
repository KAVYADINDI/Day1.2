import java.util.Scanner;
public class Resultdeclaration {
	public static Scanner scan;
	public static void main(String args [])
	{
		int maths,science,social,count =0;
		scan = new Scanner(System.in);
		System.out.print("Enter the maths marks: ");
	    maths =scan.nextInt();
	    System.out.print("Enter the social marks: ");
	    social =scan.nextInt();
	    System.out.print("Enter the science marks: ");
	    science=scan.nextInt();
	    if(maths>0 && social>0 && science>0)
	    {
	    if(maths>60) {
	    count++;
	    }
	    if(science>60) { count++; }
	    if(social>60) { count++; }
	    switch(count)
	    {
	    case 0 : System.out.print("failed");break;
	    case 1 : System.out.print("failed"); break;
	    case 2 : System.out.print("promoted"); break;
	    case 3 : System.out.print("passed promoted"); break;
	    }	
	    }
	    }
	}
