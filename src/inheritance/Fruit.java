package inheritance;

public class Fruit {

        public Fruit() {
            System.out.println("Super class constructor");
            System.out.println("Super class object hashcode :" +
                    this.hashCode());
            System.out.println(this.getClass().getName());
        }


}
