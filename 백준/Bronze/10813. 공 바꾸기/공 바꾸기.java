import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 예시
        //  5 4
        //  1 - 1 2 3 4 5 (1 swap 2)
        //      2 1 3 4 5
        //  2 - 2 1 3 4 5 (3 swap 4)
        //      2 1 4 3 5
        //  3 - 2 1 4 3 5 (1 swap 4)
        //      3 1 4 2 5
        //  4 - 3 1 4 2 5 (2 swap 2 그대로)
        //      3 1 4 2 5

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 수
        int M = sc.nextInt(); // 공을 바꿀 횟수

        int[] arrs = new int[N];

        // 바구니 번호와, 공 번호 일치 시킴
        for(int i = 1; i <= N; i++){
            arrs[i-1] = i;
        }

        for (int i = 1; i <= M; i++) {

            // 스왑할 번호 2개 입력
            int swap_i = sc.nextInt() - 1;
            int swap_j = sc.nextInt() - 1;

            int temp = arrs[swap_i];
            arrs[swap_i] = arrs[swap_j];
            arrs[swap_j] = temp;
        }

        // 배열을 숫자로 출력
        for(int answer : arrs){
            System.out.print(answer+" ");
        };
    }
}