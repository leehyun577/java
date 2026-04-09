import java.util.Scanner;

public class step16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("5개의 정수를 입력하세요.");
        int[] arr = new int[5];

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.print("평균은" + sum / arr.length );
        sc.close();
    }
}
