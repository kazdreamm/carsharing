public class Transport {

    private double speed;
    private int weight;
    private String color;
    private String location;

    public Transport(double speed, int weight, String color, String location) {

        System.out.println("Object created:");
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.location = location;

        System.out.println(getValues());
    }

    public Transport(int weight, String location) {

        System.out.println("Object created:");
        this.weight = weight;
        this.location = location;
        System.out.println(getValues());

    }

    public void setValues(double speed, int weight, String color, String location) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.location = location;

    }

    public String getValues() {
        String info = "Object speed: " + this.speed + ", weight: " + this.weight + ", color: " + this.color+ ", location: " + this.location;
        return info;

    }




}
