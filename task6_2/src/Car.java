public class Car extends Vehicle {
    private int numberOfSeats;

    public void  getNumberOfSeats(){
        System.out.println(numberOfSeats);
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
