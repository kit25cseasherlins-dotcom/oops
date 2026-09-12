package Observation;

import java.util.Scanner;

class Vehicle{
    protected String brand;
    protected int price;

    Vehicle(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
}

class Car extends Vehicle{
    private int seatingCapacity;

    Car(String brand,int price,int seatingCapacity){
        super(brand,price);
        this.seatingCapacity=seatingCapacity;
    }

    @Override
    void display(){
        System.out.println("Car Details:");
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Seating Capacity: "+seatingCapacity);
    }
}

class Truck extends Vehicle{
    private int loadCapacity;

    Truck(String brand,int price,int loadCapacity){
        super(brand,price);
        this.loadCapacity=loadCapacity;
    }

    @Override
    void display(){
        System.out.println("Truck Details:");
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Load Capacity: "+loadCapacity);
    }
}

public class RuntimePolymorphism{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=0;i<t;i++){

            int type = scanner.nextInt();
            String brand = scanner.next();
            int price = scanner.nextInt();
            int capacity = scanner.nextInt();

            Vehicle vehicle;

            if(type==1)
                vehicle = new Car(brand,price,capacity);
            else
                vehicle = new Truck(brand,price,capacity);

            vehicle.display();
        }

        scanner.close();
    }
}