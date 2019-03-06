package Mypck;

public class Ques6 {
    //WAP showing try, multi-catch and finally blocks.
    public static void main(String args[]) {
        int arr[] = new int[2];
        try {
            System.out.println("Access element three :" + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception:" + e);
        }finally {
            arr[0] = 6;
            System.out.println("First element value: " + arr[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
