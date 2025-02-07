import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=N-1; i>=0; i--){
            // k보다 작거나 같은 수, 몫 카운트
            if(K >= arr[i]){
                cnt += K / arr[i];
                K = K % arr[i];
            }
        }
        System.out.println(cnt);
    }
}