

import java.util.Scanner;

public class step13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("정수 를 5개 입력하세요.");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if(n <=0) continue; // 0 이하의 정수는 무시하고 다음 반복으로 넘어감
            else sum += n;
        }
    System.out.println("입력된 정수들의 합은 " + sum + "입니다.");

    scanner.close();
    }
}