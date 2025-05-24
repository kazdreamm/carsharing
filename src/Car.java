public class Car extends Transport{

    public Status status = new Status(false);


    public Car(double speed, int weight, String color, String location) {
        super(speed, weight, color, location);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Скорость:" + speed);
    }


}
