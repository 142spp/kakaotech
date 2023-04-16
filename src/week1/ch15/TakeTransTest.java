package week1.ch15;

public class TakeTransTest {
    public static void main(String[] args){
        Student edward = new Student("Edward",20000);
        Taxi taxi = new Taxi("잘나간다");

        edward.takeTaxi(taxi);

        edward.showInfo();
        taxi.showInfo();
    }
}
