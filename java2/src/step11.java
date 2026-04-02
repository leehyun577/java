

//


import java.util.Scanner;

public class step11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int count = 0, n = 0;
    double sum = 0;
    System.out.println("정수를 입력하고 마지막에 0 을 입력하세요");
    while ((n = sc.nextInt()) !=0) {
        sum += n;
        count++;
    }
    System.out.println("수의 개수는 " + count + "개이며");
    System.out.println("평균은 " + sum / count + "입니다.");

    sc.close();



}

}