package Mypck;

import java.util.ArrayList;

public class Ques10 {
    // Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below
    //
    //* Customer
    //  - Pays the cash to the cashier and places his order, get a token number back
    //  - Waits for the intimation that order for his token is ready
    //  - Upon intimation/notification he collects the coffee and enjoys his drink
    //  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)
    //
    //* Cashier
    //  - Takes an order and payment from the customer
    //  - Upon payment, creates an order and places it into the order queue
    //  - Intimates the customer that he has to wait for his token and gives him his token
    //  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)
    //
    //* Barista
    // - Gets the next order from the queue
    // - Prepares the coffee
    // - Places the coffee in the completed order queue
    // - Places a notification that order for token is ready
    public static void main(String[] args) {
        Barista b1=new Barista(1,"kuman chetan");
        Cashier c1=new Cashier(1,"ramesh");

    }

}
class Customer{

    int cus_id; String cusname;
    int cash;int order;int token_no;
    Customer(int cus_id,String cusname){
        this.cus_id=cus_id;
        this.cusname=cusname;
    }
    boolean wait_order(){
        System.out.println("Wait till order arrives");
    }
    boolean get_order(){
        System.out.println("Received order");
    }
}
class Cashier{
    int cid;String name;
    int order_id;
    int payment;
    int token;
    ArrayList<Integer> a1=new ArrayList<Integer>();
    Cashier(int cid,,String name){
        this.cid=cid;
        this.name=name;
    }
    int place_order(int cusid){
        order_id=cusid;
        return payment;
    }



}
class Barista{
    int bid;
    String name;
    Barista(int bid,String name){
        this.bid=bid;
        this.name=name;
    }
    void receive_order(){
        System.out.println("Next order");
    }
    void prepare_coffee(){
        System.out.println("Next order");
    }
    void putinqueue(){
        System.out.println("Next order");
    }
    void notifyt(){
        System.out.println("Notify");
    }
}


