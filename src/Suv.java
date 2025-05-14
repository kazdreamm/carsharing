public class Suv extends Transport{

    private boolean isLoaded;

    public Suv(int weight, String location) {
        super(weight, location);

    }

    public Suv(int weight, String location, boolean isLoaded) {
        super(weight, location);
        this.isLoaded = isLoaded;

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
