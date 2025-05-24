import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car mercedes = new Car(250,3000,"black", "Astana");

        Suv land_crusier = new Suv(3000, "Astana", false);

        System.out.println("Список автомобилей:");
        System.out.println("1.Mercedes");
        System.out.println("2.land_crusier");
        System.out.println("Информацию о каком автомобиле хотите посмотреть:");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                mercedes.status.info();
                break;

            case 2:
                land_crusier.status.info();
                break;
        }


//        land_crusier.setValues(250,3000,"black", "Astana");
//        System.out.println(land_crusier.getValues());








    }

}
