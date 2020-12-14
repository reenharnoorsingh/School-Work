
public class Tester_q3 {
    public static void main(String[] args) {
        String message;

        //declare as many objects as needed and call the howToEat() method
        //print the message.
        Chicken c = new Chicken();
        message = c.howToEat();
        System.out.println(message);

        Apple a = new Apple();
        message = a.howToEat();
        System.out.println(message);
    }
}  
