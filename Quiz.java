/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
class Questions{
    String ques;
    int op1,op2,op3,op4;
    int ans;
    Questions(String ques,int op1,int op2,int op3,int op4,int ans)
    {
        this.ques=ques;
        this.op1=op1;
        this.op2=op2;
        this.op3=op3;
        this.op4=op4;
        this.ans=ans;
    }
}
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Questions q1=new Questions("1+1=?",2,3,4,5,2);
        Questions q2=new Questions("1+2=?",2,3,4,5,3);
        Questions q3=new Questions("1+4=?",2,3,4,5,5);
        
        ArrayList al=new ArrayList();
        al.add(q1);
        al.add(q2);
        al.add(q3);
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(Object object:al)
        {
            Questions q=(Questions)object;
            System.out.print("Question:"+q.ques+"Options"+"1."+q.op1+" "+"2."+q.op2+" "+"3."+q.op3+" "+"4."+q.op4);
            int s=sc.nextInt();
            if(q.ans==s)
            {
                count++;
            }
        }
        System.out.print("Your Score is"+count);
    }
    
}
