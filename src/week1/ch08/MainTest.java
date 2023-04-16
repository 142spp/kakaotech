package week1.ch08;

public class MainTest {
    public static void main(String[] args){
        Person tomas = new Person(180,78,"Tomas","남성",37);
        Order order = new Order("202011020003","01023450001","서울시 강남구 역삼동 111-333","20201102","130258",35000,0003);

        System.out.println(tomas);
        System.out.println(order);
    }
}
