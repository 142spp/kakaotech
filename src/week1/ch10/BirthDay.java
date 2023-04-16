package week1.ch10;

public class BirthDay {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public BirthDay(){
        isValid=true;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        if(day <1 || day > 31) isValid = false;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month >12) isValid = false;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showData(){
        if(isValid){
            System.out.println(year + "년 " + month + "월 "+day+"일");
        }
        else{
            System.out.println("Invalid date");
        }
    }
}
