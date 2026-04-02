import java.util.Scanner;


public class step15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intarray[];
        intarray = new int[5]; // 정수 5개를 저장할 수 있는 배열 생성

        int max = 0;
        System.out.println("양수 5개를 입력하세요.");

        for(int i = 0; i < 5; i++){
            intarray[i] = scanner.nextInt();
            if(intarray[i] > max) 
                max = intarray[i]; // 입력된 수가 max보다 크면 max에 저장
         }
        System.out.println("입력된 수 중 가장 큰 수는 " + max + "입니다.");

        scanner.close();
        
        }
    }
