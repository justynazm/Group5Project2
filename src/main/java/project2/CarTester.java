package project2;

public class CarTester {
    public static void main(String[] args) {
        Truck truck = new Truck(80000, "White", 25000);
        Sedan sedan = new Sedan(55000, "Red", 15);

        System.out.println("Truck sale price: $" + truck.calculateSalePrice());
        System.out.println("Sedan sale price: $" + sedan.calculateSalePrice());
    }
}

