public class Suv extends Transport{

    private boolean isLoaded;

    public Suv(int weight, String location) {
        super(weight, location);

    }

    public Status status = new Status(true);



    public void setValues(double speed, int weight, String color, String location, boolean isLoaded){
        super.setValues(speed, weight, color, location);
        this.isLoaded = isLoaded;
    }


    public Suv(int weight, String location, boolean isLoaded) {
        super(weight, location);
        this.isLoaded = isLoaded;

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Скорость:" + speed);

    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void getLoaded() {
        if(isLoaded)
            System.out.println("Suv loaded");
        else
            System.out.println("Suv not loaded");

    }

}
