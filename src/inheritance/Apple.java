package inheritance;

public class Apple extends Fruit {


    public Apple()
    {
        System.out.println("Subclass constructor invoked");
        System.out.println("Sub class object hashcode :" +
                this.hashCode());
        System.out.println(this.hashCode() + "   " +
                super.hashCode());

        System.out.println(this.getClass().getName() + "  " +
                super.getClass().getName());
    }

        public static void main(String[] args)
        {
            Apple myApple = new Apple();
            System.out.println(myApple);
        }


}
