import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car mercedes = new Car("Mercedes", "E-Class", 2020, 50000, "Premium", "Astana", "Black", 20000);
        Suv landCruiser = new Suv("Toyota", "Land Cruiser", 2018, 75000, "Luxury", "Almaty", "White", 25000);

        mercedes.printInfo();
        landCruiser.printInfo();


        System.out.println("\nАренда Mercedes:");
        mercedes.rent();

        System.out.println("Проверка статуса аренды Mercedes:");
        mercedes.printInfo();


    }
}
