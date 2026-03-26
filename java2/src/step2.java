//예제 2-2: step2.java
//step2.java는 var 키워드를 사용하여 변수를 선언하는 예제.    


public class step2 {
    public static void main(String[] args) {
        var price = 200;    //price는 int 타입으로 결정
        var name = "이 현"; //name은 String 타입으로 결정
        var pi = 0.14;  //pi는 double 타입으로 결정

        System.out.println("price =  " + (price + 1000)); // 가격 출력
        System.out.println("name =  " + name); // 이름 출력
        System.out.println("pi =  " + pi * 10); // 원주율 출력

    }
}