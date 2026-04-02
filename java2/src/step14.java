
import java.util.Scanner;

public class step14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다");
        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if (text.equals("exit")) {
                break; // while문 종료
            }        
        }
        System.out.println("프로그램이 종료되었습니다.");
        scanner.close();
    }
}
