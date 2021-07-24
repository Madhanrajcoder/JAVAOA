package mypack;

public class cricket {
	int score;
	String name;
	 void score(String name,int score){
		 this.name=name;
		 this.score=score; 
	 }
	 void display()
	 {
		 System.out.println(name+" - "+score);
	 }
	 public static void main(String[]args)
	 {
		 cricket c1=new cricket();
		 cricket c2=new cricket();
		 c1.score("Virat",100);
		 c1.display();
		 c2.score("Rohit",56);
		 c2.display();
	 }
}
