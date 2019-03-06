package Mypck;

public class Ques9 {
    // Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.

    public static void main(String[] args) {
        Wooden w1=new Wooden("chair",true,true);
        Wooden w2=new Wooden("table",true,true);
        Metal m1=new Metal("chair",true,true);
        Metal m2=new Metal("table",true,true);
        m1.do_firetest();
        m2.do_stresstest();
        w1.do_firetest();
        w2.do_stresstest();
    }
}
 class Wooden{
    String type;
    boolean stress_test,fire_test;

    Wooden(String type,boolean stress_test,boolean fire_test){
        this.type=type;
        this.stress_test=stress_test;
        this.fire_test=fire_test;

    }
     void do_stresstest(){
        if(stress_test){
            System.out.println("stress checked");
        }else{
            System.out.println("stress Not checked");
        }
     }
     void do_firetest(){
         if(fire_test){
             System.out.println(" fire checked");
         }else{
             System.out.println(" fire Not checked");
         }

}}

     class Metal {
         String type;
         boolean stress_test, fire_test;

         Metal(String type, boolean stress_test, boolean fire_test) {
             this.type = type;
             this.stress_test = stress_test;
             this.fire_test = fire_test;

         }

         void do_stresstest() {
             if (stress_test) {
                 System.out.println("stress checked");
             } else {
                 System.out.println("stress Not checked");
             }
         }

         void do_firetest() {
             if (fire_test) {
                 System.out.println(" fire checked");
             } else {
                 System.out.println(" fire Not checked");
             }

         }
     }