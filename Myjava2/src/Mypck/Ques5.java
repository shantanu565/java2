package Mypck;

public class Ques5 implements Cloneable{
    //WAP to show object cloning in java using cloneable and copy constructor both.
        int id;
        String name;

        Ques5(int id,String name){
            this.id=id;
            this.name=name;
        }

        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }

        public static void main(String args[]){
            try{
                Ques5 q1=new Ques5(1,"runi");
                Ques5 q2=(Ques5)q1.clone();

                System.out.println(q1.id+" "+q1.name);
                System.out.println(q2.id+" "+q2.name);

            }catch(CloneNotSupportedException c){}

        }

}
