package study;


class Car{
    String name;
    String type;

    public void printCarInfo() {
        System.out.println("==Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move(){
        System.out.println("이동");
    }
    public void brake(){
        System.out.println("정지");
    }
}

class Car2{
    String name;
    String type;

    Car2 (String name,String type){
        this.name=name;
        this.type=type;
        System.out.println("생성자 출력");
    }
    public void printCarInfo() {
        System.out.println("==Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void load(){
        System.out.println("짐을 주세요");
    }
    public void horn(){
        System.out.println("빵빵");
    }
}

/**
 * Q1 다음클래스를 직접 만든 후 객체 생성
 * 클래스명 : Animal
 * 특성 : 이름, 무게 , 분류
 * 기능 : 먹기, 잠자기,걷기, 뛰기
 */

class Animal{
    String name;
    double weight;
    String type;

    public Animal(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public void printInfo(){
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("type = " + type);
    }

    public void eat(){
        this.weight+=1;
        System.out.println("먹는다");
    }
    public void sleep(){
        System.out.println("잠자기");
    }
    public void walk(){
        System.out.println("걷기");
    }
    public void run(){
        System.out.println("뛴다");
    }
}


public class Java_7_1 {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.name="tata";
        car1.type="suv";

        car1.printCarInfo();
        car1.move();
        car1.brake();

        Car2 car2= new Car2("momo","suv");
        car2.printCarInfo();
        car2.load();
        car2.horn();

        System.out.println("==Q1==");

        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal2.printInfo();
    }

}
