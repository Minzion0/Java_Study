package study;

//추상클래스 Person

abstract class Person1{
    abstract void printInfo();
}

class Student2 extends Person1{
    @Override
    void printInfo() {
        System.out.println("Student2.printInfo");
    }
}

public class Java_10_1 {
    public static void main(String[] args) {

        //추상 클래스 사용
        //   Person1 p1 = new Person1();
        Student2 s1= new Student2();
        s1.printInfo();



        //익명 클래스
        Person1 p2 = new Person1() {
            @Override
            void printInfo() {
                System.out.println("Java_10_1.printInfo");
            }
        };

        p2.printInfo();
    }


}