import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public int area() {
        return width * height;
    }
}


public class step23 {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();// 사각형 객체 생성
        Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
        System.out.print(">>");
        rect.width = scanner.nextInt(); // 사각형의 너비 입력받기
        rect.height = scanner.nextInt(); // 사각형의 높이 입력받기
        System.out.println("사각형의 면적은 " + rect.area()); // 사각형의 면적 출력하기
        scanner.close(); // 스캐너 객체 닫기
    }

}
