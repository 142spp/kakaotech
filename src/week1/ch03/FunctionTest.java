package week1.ch03;

public class FunctionTest {
    public static void sayHello(String str){
        System.out.println(str);
    }
    public static int calcSum(){
        int sum = 0;
        int i;
        for(i=0; i<=100; i++){
            sum += i;
        }
        return sum;
    }
    public static int addNum(int a, int b){
        int result;
        result = a + b;
        return result;
    }

    public static void main(String[] args){
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1,n2);
        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum();
        System.out.println(total);
    }
}
