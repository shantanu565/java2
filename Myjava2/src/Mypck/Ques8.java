package Mypck;

import java.util.Scanner;

public class Ques8 {
    //WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
    //a)while statement
    //b)do-while statement
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Solving que a\n");
        System.out.println("enter your string:");
        String string=s.next();
        while (!string.equals("done")){

            string=s.nextLine();
        }
        System.out.println("Solving b");
        System.out.println("Enter your string second time");
        do{
            string=s.next();
        }while (!s.equals("done"));

    }
}
