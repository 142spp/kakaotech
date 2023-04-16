package week1.ch14;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }
}