package week1.ch16;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이동근");

        System.out.println(employeeLee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김태희");

        System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+employeeLee.getEmployeeId()+"입니다.");
        System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId()+"입니다.");
    }
}
