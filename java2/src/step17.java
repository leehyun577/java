


// for-each문: 배열의 요소를 순서대로 참조하는 반복문



public class step17 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int K : n) {
            System.out.println(K + "");
            sum += K;
        }
        System.out.println("합은 " + sum);

        String f[] = {"사과", "바나나", "포도", "딸기", "수박", "참외"};
        for (String s : f) {
            System.out.println(s + "");
        }
    }
}
