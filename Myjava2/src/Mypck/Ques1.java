package Mypck;

import java.lang.reflect.Array;

public class Ques1 extends Liberarian implements liberary{
    // Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.

    public static void main(String[] args) {

        Ques1 q1=new Ques1();
        q1.checkList_ofbooks();
        q1.book_issued();
        q1.book_return();

    }

    @Override
    public int book_issued() {
        System.out.println("These book are not available");
        return 0;
    }

    @Override
    public int book_return() {
        System.out.println("Available");
        return 0;
    }

    @Override
    int checkList_ofbooks() {
        return 0;
    }
}
interface liberary{
    int book_issued();
    int book_return();

}
abstract class Liberarian{
    abstract int checkList_ofbooks();
     void check_readerid(){

     }
}
