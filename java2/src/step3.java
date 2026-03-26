
    //예제 2-3: bar.java
    //상수를 사용하여 원의 면적을 계산하는 예제.





public class step3 {
    public static void main(String[] args) {
        final double PI = 3.14; // 상수 PI 선언
        double radius = 5.0; // 반지름 선언
        double circlearea = PI * radius * radius; // 원의 넓이 계산
        //원의 면적을 화면에 출력한다.

        System.out.println("반지름: " + radius + ","); // 반지름 출력
        System.out.println("원의 면적: " + circlearea); // 원의 넓이 출력
    }
}
