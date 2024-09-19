import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 수
        int M = sc.nextInt(); // 역순 수행 횟수
        int[] basket = new int[N+1];

        // 바구니값 초기화
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }
        
        for(int i=0; i<M; i++){
            int a = sc.nextInt(); // arrs[a]부터
            int b = sc.nextInt(); // arrs[b]까지 역순으로 변경할거임

            // a = 1, b= 4
            //a[0] a[1] a[2] a[3] a[4] a[5]
            // 0    1    2    3    4   5
            //          t:
            
            // 앞뒤로 바꿔줌
            while(a < b){
                int tmp = basket[a];
                basket[a++] = basket[b];
                basket[b--] = tmp;
            }
        }
        for(int i=1; i<=N; i++){
            System.out.print(basket[i] + " " );
        }
    }
}