package mypack;

import java.util.Scanner;

public class Student {
	  int regno,m1,m2,m3,m4,m5,total;
	    String name,result;
	    float avg;
	     void getData(){
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the regno");
	        regno=s.nextInt();
	        
	        System.out.println("Enter the name");
	        name=s.next();
	        
	        System.out.println("Enter the Marks");
	        m1=s.nextInt();
	        m2=s.nextInt();
	        m3=s.nextInt();
	        m4=s.nextInt();
	        m5=s.nextInt();
	        
	        System.out.println("********************************************************");
	    }
	      void calculate(){
	        total=m1+m2+m3+m4+m5;
	        avg=(float) (total/5.0);
            if(m1>=35&&m2>=35&&m3>=35&&m4>=35&&m5>=35)
            {
                result="PASS";
                
            }  
            else
            {
                result="FAIL";
            }

	    }
	       void display(){
	       
	        System.out.println(regno+"\t"+name+"\t"+ m1+"\t"+ m2+"\t"+ m3+"\t"+ m4+"\t"+ m5+"\t"+"\t"+total+"\t"+avg+"\t"+result);
	    }
	       public static void main(String[] args) {
	        Student obj[]=new Student[5];
	        Scanner s=new Scanner(System.in);
	        int count1=0,count2=0;
	        System.out.println("Enter the size");
	        int size=s.nextInt();
	        for (int i = 0; i < size; i++) {
	            obj[i]=new Student();
	            obj[i].getData();
	            obj[i].calculate();
	        }
	         System.out.println("Regno\tName\tm1\tm2\tm3\tm4\tm5\t\tTotal\tAvg\tResult\t");
	         System.out.println("************************************************************************************************");
	         for (int i = 0; i < size; i++) {
	             obj[i].display();
	             if(obj[i].m1>=35 &&obj[i].m2>=35&&obj[i].m3>=35&&obj[i].m4>=35&&obj[i].m5>=35)
	             {
	                 count1++;
	                 
	             }  
	             else
	             {
	                 count2++;
	             }
	         }
	         System.out.println("************************************************************************************************");
	         System.out.println("PASS COUNT IS ="+count1);
	         System.out.println("FAIL COUNT IS ="+count2);      
	} 
}
