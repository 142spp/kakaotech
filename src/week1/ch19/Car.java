package week1.ch19;

public class Car {
    private static int baseNum = 10001;
    private int carNum;
    public Car(){
        this.carNum = baseNum++;
    }
    public int getCarNum(){
        return carNum;
    }
}
