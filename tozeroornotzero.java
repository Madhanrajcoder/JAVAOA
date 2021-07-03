package mypack;

import java.util.Scanner;

public class tozeroornotzero {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<b;i++)
		{
			if(b>=100)
			{
				System.out.printf("%03d ",i);
			}
			else if(b>10)
			{
				System.out.printf("%02d ",i);
			}
			else
			{
				System.out.printf("%d ",i);
			}
		}
	}
}
