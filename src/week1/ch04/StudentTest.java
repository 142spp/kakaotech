package week1.ch04;

public class StudentTest {
    public static void main(String[] args){
        Student studentLee = new Student();
        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "Busan Geumjeong-gu";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "Busan, Geumjeong-gu";

        studentKim.showStudentInfo();
    }
}
