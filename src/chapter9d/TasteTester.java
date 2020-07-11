package chapter9d;

public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake("Almond");
        System.out.println(cake.getFlavor());

        BirthdayCake bdayCake = new BirthdayCake();
        bdayCake.setFlavor("Orange");
        System.out.println("Birthday Cake: " + bdayCake.getFlavor());

        WeddingCake wedCake = new WeddingCake();
//       wedCake.setFlavor("Mint");
       System.out.println("Wedding Cake: " + wedCake.getFlavor());

    }
}
