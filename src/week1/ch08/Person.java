package week1.ch08;

public class Person {
    float height;
    float weight;
    String name;
    String gender;
    int age;

    public Person(float height, float weight, String name, String gender, int age) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "키가 "+height+ "이고 몸무게가 "+weight+ "킬로인 "+ gender+"이 있습니다. 이름은 "+name +"이고 나이는 "+age+"입니다.";
    }
}
