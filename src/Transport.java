public abstract class Transport {

    private double speed;
    private int weight;
    private String color;
    private String location;


    public Transport(double speed, int weight, String color, String location) {

        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.location = location;

    }

    public Transport(int weight, String location) {
        this.weight = weight;
        this.location = location;

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

    public abstract void moveObject(float speed);

    class Status{
        private boolean isReady;

        public Status (boolean isReady) {
            this.isReady = isReady;
        }

        public void info() {
            if(isReady) {
                System.out.println("Свободен");
            }

            else
                System.out.println("Занят");
        }

    }




}
