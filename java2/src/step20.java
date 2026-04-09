import java.util.Scanner;
import java.util.InputMismatchException;

public class step20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개를 입력하세요: ");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                sc.next(); // 잘못된 입력을 버퍼에서 제거
                i--; // 인덱스를 감소시켜 다시 입력 받도록 함
                continue; // 다음 반복으로 넘어감
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
        sc.close();
    }
}
