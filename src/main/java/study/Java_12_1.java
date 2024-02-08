package study;


//내부 클래스 구조
class Outer {
    public void print(){
        System.out.println("Outer.print");
    }
    class Inner{
        public void innerPrint(){
            Outer.this.print();
        }
    }
   static class InnerStaticClass{
        void innerPrint(){
          //  Outer.this.print();static 클래스 스태틱 클래스끼리의 활용이 가능하
        }
    }


}
abstract class Person5{
    public abstract void printInfo();
}

class Student7 extends Person5{
    @Override
    public void printInfo() {
        System.out.println("Student7.printInfo");
    }
}
public class Java_12_1 {

    public static void main(String[] args) {
        //외부클래스
        Outer o1 = new Outer();

        //내부클래스 인스턴스
        Outer.Inner i1= new Outer().new Inner();
    //내부 클래스 정적
        Outer.InnerStaticClass is1= new Outer.InnerStaticClass();

        //익명 클래스
        Person5 p1= new Person5() {
            @Override
            public void printInfo() {
                System.out.println("Java_12_1.printInfo");
            }
        };



    }

}
