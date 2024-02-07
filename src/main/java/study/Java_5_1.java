package study;

public class Java_5_1 {
    public static void main(String[] args) {
        //1 반복문 -for
        System.out.println("== for==");

        //1-1 기본 사용 방법
        for (int e=0; e<5; e++){
            System.out.println(e);
        }


        //1-2 for each
        System.out.println("==for each==");
        int[] nums= {1,2,3,4,5};
        for (int num : nums) {
            System.out.println(num);
        }

        //2.반복문 - while
        //2-1while
        System.out.println("==while==");
        int r=0;
        while (r<5){
            System.out.println(r++);
        }
        r=0;
        while (r<5){
            if (r==2){
                r++;
                continue;
            }
            System.out.println(r++);
        }

        r=0;
        while (r<5){
            if (r==2){
                r++;
                break;
            }
            System.out.println(r++);
        }



        //2-2 do-while
        System.out.println("==do - while==");
        boolean knock = false;
        do {
            System.out.println("knock");
        }while (knock);

        /**
         * Q1 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해 보세요
         *  *
         *  ***
         *  ****
         *  *****
         */
        System.out.println("==Q1==");
        for (int i = 0; i < 8; i++) {
            if (i%2==0){
                continue;
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * Q2 반복문을 실행 할때마다 물온도를 1도씩 올리고 100도가 되면 종료한다.
         * 추가로 10도,20도,....10도 간격으로 물온도를 출력하시오.
         */
        System.out.println("==Q2==");
        int waterTemperature = 0;
        do {
            waterTemperature++;
            if (waterTemperature%10==0){
                System.out.println("현재 몰온도는 : "+waterTemperature);
            }
        }while (waterTemperature<=100);
    }
}
