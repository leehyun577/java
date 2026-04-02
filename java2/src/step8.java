

/*
    예제2-11: step8.java
    step8.java는 나이를 입력받아 20대인지 검사하는 예제.
*/



import java.util.Scanner;

public class step8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하시요");
        int age = sc.nextInt();
        if ((age>=20) && (age<30)) {
            System.out.println("20대입니다");
            System.out.println("20대라서 행복합니다.");
        }
        else {
            System.out.println("20대가 아닙니다.");

            sc.close();
        }
    }
}
