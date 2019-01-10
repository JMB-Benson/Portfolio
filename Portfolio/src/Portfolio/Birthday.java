package Portfolio;
import java.util.Scanner;
public class Birthday {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		final int num128 = 128;
		final int num64 = 64;
		final int num32 = 32;
		final int num16 = 16;
		final int num8 = 8;
		final int num4 = 4;
		final int num2 = 2;
		final int num1 = 1;

		
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		
		
		
		
		int inputnum = 0;
		
		int whatsLeft;
		
		for(int i=0 ;i<31;i++) {
			String biannum ="";
			//System.out.println("enter a number between 0 and 255");
			
			inputnum = inputnum+1;
			
			whatsLeft = inputnum;
			if(inputnum >= num128) {
				whatsLeft = inputnum - num128;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num64) {
				whatsLeft = whatsLeft  - num64;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num32) {
				whatsLeft = whatsLeft  - num32;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num16) {
				whatsLeft = whatsLeft  - num16;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num8) {
				whatsLeft = whatsLeft  - num8;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num4) {
				whatsLeft = whatsLeft  - num4;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num2) {
				whatsLeft = whatsLeft  - num2;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num1) {
				whatsLeft = whatsLeft  - num1;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			System.out.println("the bianary number for "+inputnum+ " is "+ biannum);
			
			
			char xnum7 = biannum.charAt(7);
			char xnum6 = biannum.charAt(6);
			char xnum5 = biannum.charAt(5);
			char xnum4 = biannum.charAt(4);
			char xnum3 = biannum.charAt(3);
			
			if (xnum7=='1') {
				set1=set1+inputnum;
			}
			if (xnum6=='1') {
				set2=set2+inputnum;
			}
			if (xnum5=='1') {
				set3=set3+inputnum;
			}
			if (xnum4=='1') {
				set4=set4+inputnum;
			}
			if (xnum3=='1') {
				set5=set5+inputnum;
			}
			
			System.out.println("set1 is "+set1);
			System.out.println("set2 is "+set2);
			System.out.println("set3 is "+set3);
			System.out.println("set4 is "+set4);
			System.out.println("set5 is "+set5);
			}
			
		// finds the binary numbers
		System.out.println("\n\n\nIs your birthday in set 1 (1 for yes, 0 for no)?");
		String q1 = input.nextLine();

		System.out.println("Is your birthday in set 2 (1 for yes, 0 for no)?");
		String q2 = input.nextLine();

		System.out.println("Is your birthday in set 3 (1 for yes, 0 for no)?");
		String q3 = input.nextLine();

		System.out.println("Is your birthday in set 4 (1 for yes, 0 for no)?");
		String q4 = input.nextLine();

		System.out.println("Is your birthday in set 5 (1 for yes, 0 for no)?");
		String q5 = input.nextLine();


		int number = 0;

		if (q1.equals("1")) {
		number = number + 1;
		}
		if (q2.equals("1")) {
		number = number + 2;
		}
		if (q3.equals("1")) {
		number = number + 4;
		}
		if (q4.equals("1")) {
		number = number + 8;
		}
		if (q5.equals("1")) {
		number = number + 16;
		}

		System.out.println("\n\nYour birthday is: " + number + ".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
