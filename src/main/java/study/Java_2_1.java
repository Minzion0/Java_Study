package study;

public class Java_2_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // 1 변수 사용하기
        System.out.println("==변수 사용하기==");
        int age= 10;
        System.out.println("age = " + age);

        String country = "Korea";

        System.out.println("country = " + country);
        //2.변수 이름 규칙
        System.out.println("==변수 이름 규칙");
        //2-1 문자 ,숫자 _(underscore),$ 사용가능
        int apple=2000;
        int apple3=2000;
        int _apple =3000;
        int $apple=2000;

        System.out.println(apple);
        System.out.println("apple3 = " + apple3);
        System.out.println("_apple = " + _apple);
        System.out.println("$apple = " + $apple);

        //2-2 숫자로 시작 x
        //int 3aplle =2; 실행시 에러가 나온다

        //2-3 대소문자 구분
        int Apple1=40;
        int apple1=40;

        //2-4 공백 사용 x
 //       int one apple = 1000; 이러한 공백을 허용하지 않는다 띄움을 원한다면 _로 표현해보자

        //2-5 예약어 사용 x
//      int if=4000;
//      int true= 4000;

        //참고) 변수명으로 한글 사용가능
        int 사과 =400;
        System.out.println("사과 = " + 사과);

        //하지만 대부분 영어로 변수명을 사용한다.

        //3. 표기법
        //3-1 카멜 표기법
        //변수나 함수에서 사용
        int myAge =32;

        /**
         * 3-2 파스칼 표기법
         * 클래스에서 사용
         */

        int MyAge= 32;


        /**
         * 스네이크 표기법
         *
         */

        int my_age=32;
    }


}