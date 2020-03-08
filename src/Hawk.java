public class Hawk extends Bird implements Flyable {


    public Hawk(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Hawk is Flying.....");
    }

}
