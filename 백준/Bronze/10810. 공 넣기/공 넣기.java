import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 예시
        // 5 4
        //  1 - 1 2 3 4 5 (1~2 3번)
        //      3 3 0 0 0
        //  2 - 1 2 3 4 5 (3~4 4번)
        //      3 3 4 4 0
        //  3 - 1 2 3 4 5 (1~4 1번)
        //      1 1 1 1 0
        //  4 - 1 2 3 4 5 (2~2 2번)
        //      1 2 1 1 0

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 수
        int M = sc.nextInt(); // 공을 넣을 횟수

        int[] arrs = new int[N];
        for (int num = 1; num <= M; num++) {
             int i = i = sc.nextInt();
             int j = j = sc.nextInt();
             int k = k = sc.nextInt();

            for(int a = i; a <= j; a++){
                arrs[a-1] = k;
            }

        }

        // 배열을 숫자로 출력
        for(int answer : arrs){
            System.out.print(answer+" ");
        };
    }
}