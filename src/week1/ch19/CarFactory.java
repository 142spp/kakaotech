package week1.ch19;

public class CarFactory {
    private static CarFactory instance;

    public static CarFactory getInstance(){
        if(instance == null) instance = new CarFactory();
        return instance;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
