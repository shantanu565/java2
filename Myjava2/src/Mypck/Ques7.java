package Mypck;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ques7 {
    //WAP to convert seconds into days, hours, minutes and seconds.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter seconds:");
        long n=s.nextInt();
        int day = (int) TimeUnit.SECONDS.toDays(n);
        long hours = TimeUnit.SECONDS.toHours(n)-(day *24);
        long minute = TimeUnit.SECONDS.toMinutes(n)-(TimeUnit.SECONDS.toHours(n)*60);
        long second = TimeUnit.SECONDS.toSeconds(n)-(TimeUnit.SECONDS.toMinutes(n)*60);
        System.out.println("Day " + day + " Hour " + hours + " Minute " + minute + " Seconds " + second);
    }

}
