import java.util.Scanner;

public class step19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.print("나뉨수를 입력하세요: ");
        dividend = sc.nextInt();
        System.out.print("나눗수를 입력하세요: ");
        divisor = sc.nextInt();
        try{
            System.out.println(dividend + "를 " + divisor + "로 나눈 몫은 " + (dividend / divisor) + "입니다.");
        }
        catch (ArithmeticException e) {
            System.out.println("오류: 0으로 나눌 수 없습니다.");
        }
        finally{
            sc.close();
        }
    }
}
