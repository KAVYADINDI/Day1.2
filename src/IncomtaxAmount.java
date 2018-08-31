import java.util.Scanner;
public class IncomtaxAmount {
	public static Scanner scan;
	public static void main(String args [])
	{
	   int ctc,taxamount=0;
	   scan = new Scanner(System.in);
		System.out.print("Enter the ctc: ");
	     ctc=scan.nextInt();
	     if(ctc>0 && ctc<=180000)
	     {
	    	 taxamount=0;
	     }
	     else if(ctc>180000 && ctc<=300000)
	     {
	    	 taxamount= ctc/10;
	     }
	     else if(ctc>300000 && ctc<=500000) 
	     {
	    	 taxamount= ctc/5;
	     }
	     else if(ctc>500000 && ctc<=1000000)
	     {
	    	 taxamount=(ctc*3)/10;
	     }
	     System.out.print("Amount to be paied is: " + taxamount);
	}

}
