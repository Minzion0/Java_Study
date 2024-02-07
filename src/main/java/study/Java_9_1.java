package study;

class Person{
    public void printInfo(){
        System.out.println("Person.printInfo");
    }
}

class Student extends Person {
    public void printInfo(){
        System.out.println("Student.printInfo");
    }
    public void printInfo2(){
        System.out.println("Student.printInfo2");
    }

}

class CollegeStudent extends Person {
    public void printInfo(){
        System.out.println("CollegeStudent.printInfo");
    }
}

public class Java_9_1 {

    public static void main(String[] args) {
        //1 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student();// 다형성
        //Student s2 = new Person();
        p1.printInfo();
        s1.printInfo();
        s1.printInfo2();
        p2.printInfo();
        p2.printInfo();

        Person p3 = new CollegeStudent();
        p3.printInfo();

        //2. 타입 변환
        System.out.println("==타입 변환 ==");
        Person pp1= null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student();//업 케스팅

        pp1 = pp2;
        pp1 =ss1;
        ss1=ss2;
        //ss1=pp2;
        ss1=(Student)pp3;// 다운 케스팅

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
        //ss1=(Student) cc2;


        //instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1= new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(pe1 instanceof Student);

        System.out.println(st1 instanceof Student);
        System.out.println(st1 instanceof Person);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Person);
        System.out.println(pe3 instanceof CollegeStudent);


        if (pe1 instanceof Student){
            Student stu1 = (Student) pe1;
        }
    }

}
