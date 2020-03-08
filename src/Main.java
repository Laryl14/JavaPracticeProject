public class Main {


    public static void main(String[] args) {

        Animal animal1 = new Animal(25, "M", 150);
        animal1.eat();

        Bird bird1 = new Bird(10, "F", 3);
        bird1.eat();
        bird1.sleep();

        Hawk hawk1 = new Hawk(20, "F", 4);
        hawk1.eat();
        hawk1.fly();


    }

}
