



// 구구단을 가로로 출력하는 프로그램



public class step12 {
    public static void main(String[] args) {
        
        
        for (int i = 2; i < 10; i++) {
            System.out.print("[" + i + "단]\t \t ");
        }
        System.out.println(); // 줄바꿈
        
        for (int j = 1; j < 10; j++) { // 단에 대한 반복. 1단에서 9단
            for (int i = 2; i < 10; i++) { //각 단의 곱셈

                System.out.print(i + " * " + j + " = " + i * j + '\t'); //구구단 출력
                
            }
            System.out.println();// 한단 이 끝나면 다음줄로 커서 이동
        }
    }
}





// 구구단을 세로로 출력하는 프로그램

//public class step12 {
//    public static void main(String[] args) {
//        for (int i = 2; i < 10; i++) { // 단에 대한 반복. 1단에서 9단
//            System.out.println(" [ " + i + "단 ]"); // 단 출력
//            for (int j = 1; j < 10; j++) { //각 단의 곱셈
//
//               System.out.print(i + " * " + j + " = " + i * j + '\t'); //구구단 출력
//                
//           }
//            
//            System.out.println();// 한단 이 끝나면 다음줄로 커서 이동
//        }
//    }
//}
