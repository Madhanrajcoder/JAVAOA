package mypack;

import java.util.Scanner;

class Input{
	int a;
	void input()
	{
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	}
}
class Square extends Input
{
	void square()
	{
		System.out.println(a*a);
	}
}
public class Cube extends Input{
	void cube()
	{
		System.out.println(a*a*a);
	}
}
public class hierarichal {
	public static void main(String[]args)
	{
		Square obj=new Square();
		Cube obj1=new Cube(); 
		obj.input();
		obj1.input();
		obj.square();
		obj1.cube();
	}

}
