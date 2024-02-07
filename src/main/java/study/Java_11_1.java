package study;

interface School{
    public static final int MAX_CLASS = 20;//인터페이스 별다른 선언이 없어도 public static final 가 디폴트로 따라온다
    int MAX_PERSON_PER_CLASS = 40;
    void  printSchool();

}

class Student3 implements School{
    @Override
    public void printSchool() {
        System.out.println("00 University");
    }
}

class Person2{
    public String name;
    public void printName(){
        System.out.println("name = " + name);
    }
}

class Student4 extends Person2 implements School{

    public Student4(String name) {
        this.name=name;
    }

    @Override
    public void printSchool() {
        System.out.println("11 University");
    }
}

public class Java_11_1 {
    public static void main(String[] args) {
        //1. 인터페이스 기본 사용
        System.out.println("== 기본 인터페이스 사용 ==");
        Student3 s1 = new Student3();
        s1.printSchool();
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS);

        System.out.println("==Link 다중 상속 ==");
        Student4 s2 = new Student4("호호");
        s2.printSchool();
        s2.printName();
        System.out.println(s2.MAX_CLASS);
        System.out.println(s2.MAX_PERSON_PER_CLASS);

    }
}
