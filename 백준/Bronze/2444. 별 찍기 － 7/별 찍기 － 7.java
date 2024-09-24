import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            // 왼쪽 상단 공백용
            for(int j=0; j<N-i; j++){
                System.out.print(" ");
            }
            // 왼쪽 상단 별
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            // 오른쪽 상단 별
            for(int j=0; j<i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<N; i++){
            // 오른쪽 하단 공백용
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            // 왼쪽 하단 별
            for(int j=0; j<N-i; j++){
                System.out.print("*");
            }
            // 오른쪽 하단 별
            for(int j=0; j<N-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}