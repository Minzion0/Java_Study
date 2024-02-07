package study;

/**
 * Q1 아래의 클래스와 상속 관계에서 다형성을 이용하여
 * Car객체를 통해 아래와 같이 출력될수 있도록 Test Code 를 구현하시오
 * 빵빵!
 * 위이잉!
 * 삐뽀삐뽀!
 */
class Car1{
    public void horn(){
        System.out.println("빵빵!");
    }
}
class FireTruck extends Car1{
    public void horn(){
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car1{
    public void horn(){
        System.out.println("삐뽀삐뽀!");
    }
}

public class Java_9_2 {
    public static void main(String[] args) {
        //Test code
//        Car1 car1 = new Car1();
//        car1.horn();
//        car1= new FireTruck();
//        car1.horn();
//        car1= new Ambulance();
//        car1.horn();

        Car1[] car2={new Car1(),new FireTruck(), new Ambulance()};

        for (Car1 car11 : car2) {
            car11.horn();
        }
    }
}
