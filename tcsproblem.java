package mypack;

import java.util.Scanner;

public class tcsproblem {
	public static void main(String[]args)
	{
		 Scanner sc=new Scanner(System.in);		
		 String input=sc.nextLine();
		 long evensum=0,oddsum=0;
		 for(int i=0;i<input.length();i++)
		 {
			 if(i%2==0)
			 {
				 evensum+=input.charAt(i)-'0';
			 }
			 else
			 {
				 oddsum+=input.charAt(i)-'0';
			 }
		 }
		 System.out.println(Math.abs(evensum-oddsum));
	}
}