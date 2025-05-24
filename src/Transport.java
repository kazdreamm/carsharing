public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String configuration;
    private String location;
    private String color;
    private boolean isRented;
    private double price;  // цена аренды за сутки

    public Transport(String brand, String model, int year, int mileage,
                     String configuration, String location, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.configuration = configuration;
        this.location = location;
        this.color = color;
        this.price = price;
        this.isRented = false; // по умолчанию свободен
    }

    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println(brand + " " + model + "Свободен");
        } else {
            System.out.println(brand + " " + model + "Занят");
        }
    }

    public void printInfo() {
        System.out.println("Марка: " + brand + "\n"+
                "Модель: " + model + "\n" +
                "Год: " + year+"\n" +
                "Пробег: " + mileage + "\n"+
                "Комплектация: " + configuration +"\n"+
                "Локация: " + location + "\n"+
                "Цвет: " + color + "\n"+
                "Цена аренды: " + price + " тг/сутки" + "\n"+
                "Статус: " + (isRented ? "Занят" : "Свободен"));
    }
}