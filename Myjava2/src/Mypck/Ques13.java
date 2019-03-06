package Mypck;

import java.util.Scanner;

public class Ques13 {
    //Create a custom exception that do not have any stack trace.
    static void validate(int age)throws MyException{
        if(age<18)
            throw new MyException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter age no:");
        int n=s.nextInt();
        try{
            validate(n);
        }catch(Exception m){System.out.println("Exception occured: "+m);}

        System.out.println("rest of the code...");
    }

}
