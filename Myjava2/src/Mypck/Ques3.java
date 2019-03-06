package Mypck;

public class Ques3 {
    //WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
    public static void main(String args[]) {
        try
        {
            Class.forName("Musicfiles");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        //
    }
}
