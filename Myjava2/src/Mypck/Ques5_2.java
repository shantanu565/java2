package Mypck;

 class Copy_cons {
    int i;

   Copy_cons(int i){
        this.i=i;
    }
    Copy_cons(Copy_cons q){
        i=q.i;
    }


}
public class Ques5_2{
    public static void main(String[] args) {
        Copy_cons c1=new Copy_cons(1);
        Copy_cons c2=new Copy_cons(c1);
        System.out.println(c2);

    }
}
