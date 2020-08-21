package polymorphism;

import java.util.Scanner;


public class Final_demo extends Final_parent {
	
	
	final int PAN_CARD;
        Final_demo()
        {
        	PAN_CARD=345;
        	final int PAN_CARD;
        }
	
	
	public static void main(String[] args) {
		//final int PAN_CARD;
		//Scanner sc=new Scanner(System.in);
		//PAN_CARD=sc.nextInt();
		//System.out.println(PAN_CARD);
		Final_demo f=new Final_demo();
		//f.run();
	}
}
