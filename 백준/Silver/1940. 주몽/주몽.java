import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int Arr[] = new int[N];

        StringTokenizer token = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            Arr[i] = Integer.parseInt(token.nextToken());
        }

        // 1. 오름차순으로 정렬
        Arrays.sort(Arr);

        int cnt = 0;
        int S = 0;
        int E = N-1; // 배열은 0부터 시작이므로 끝자리 의미

        // 2. 투포인터 알고리즘 실행
        while(S < E){
            if(Arr[S]+Arr[E] < M){
                S++;
            }else if(Arr[S]+Arr[E] > M){
                E--;
            }else{
                cnt++;
                S++;
                E--;
            }
        }
        // 3. 정답출력
        System.out.print(cnt);
    }
}