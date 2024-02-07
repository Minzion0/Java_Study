package study;

class Person{
    String name;
    int age;
    public int a1;
    private int a2;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Person.printInfo");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

class Student extends Person{
    Student(){
        a1=1;
   //     a2=1; a2가 private이라 접근 불가
    }

}

class Student2 extends Person{
    String name;
    int stdId;

    public Student2(String name,int age ,int stdId) {
        this.name = name;
//        super.name=name;
//        super(name, age);
        this.stdId = stdId;
        this.age= age;
    }

    @Override
    public void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("stdId = " + stdId);
    }
}
public class Java_8_1 {
    public static void main(String[] args) {

        System.out.println("==========");
        Student s1= new Student();
        s1.name="a";
        s1.age=25;
        s1.printInfo();

        System.out.println("=========");
        Student2 s2 = new Student2("b",32,1);
        s2.printInfo();

    }
}
