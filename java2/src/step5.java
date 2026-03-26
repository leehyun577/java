/* 
    예제2-5 : step5.java
    step5.java는 Scanner 틀래스를 사용하여 입력받는 예제
*/




import java.util.Scanner;

public class step5 {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하시오");


        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // 이름 입력
        System.out.println("당신의 이름은 " + name + "입니다."); // 이름 출력
        String city = scanner.next(); // 도시 입력
        System.out.println("당신의 도시는 " + city + "입니다."); // 도시 출력
        int age = scanner.nextInt(); // 나이 입력
        System.out.println("당신의 나이는 " + age + "입니다."); // 나이 출력
        double weight = scanner.nextDouble(); // 체중 입력
        System.out.println("당신의 체중은 " + weight + " Kg 입니다."); // 체중 출력
        boolean single = scanner.nextBoolean(); // 독신여부 입력
        System.out.println("당신은 독신 여부는 " + single + "입니다."); // 독신여부 출력
    }
}
