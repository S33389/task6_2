
public class Main {
    public static void main(String[] args) {
        System.out.println("task 1 and 2: ");
        Car auto1 = new Car();
        auto1.start();
        auto1.stop();
        System.out.println("--------------------------------------");
        System.out.println("task 3 and 4 : ");
        Lion lew = new Lion();
        lew.roam();
        lew.makeNoise();
        lew.sleep();
        System.out.println("-");
        Cat kot = new Cat();
        kot.roam();
        kot.makeNoise();
        kot.sleep();
        System.out.println("-");
        Wolf wilk = new Wolf();
        wilk.roam();
        wilk.makeNoise();
        wilk.sleep();
        System.out.println("-");
        Dog pies = new Dog();
        pies.roam();
        pies.makeNoise();
        pies.sleep();
        System.out.println("--------------------------------------");
    }
}