package Mypck;

import java.util.Scanner;

public class Ques2 {
    //WAP to sorting string without using string Methods?.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your String:");
        String original=s.nextLine();

        int j = 0;
        char temp = 0;

        char[] chars = original.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (j = 0; j < chars.length; j++) {

                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }

            }

        }

        for (int k = 0; k < chars.length; k++) {
            System.out.println(chars[k]);
        }

    }
}
