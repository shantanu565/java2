package Mypck;

public class Ques4 {
    //WAP to create singleton class.
    private static final Ques4 SINGLE_INSTANCE = new Ques4();

    private Ques4() {}

    public static Ques4 getInstance() {

        return SINGLE_INSTANCE;

    }
}
