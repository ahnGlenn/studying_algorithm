import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 1. 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken()); // 배열의 길이
        int M = Integer.parseInt(token.nextToken()); // 만들어야하는 수

        // 2. 배열 입력받기
        int[] arr = new int[N];
        token = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }

        // 3. 투포인터 시작
        int left = 0;
        int right = 0;
        int cnt = 0;
        int sum = 0; // M값과 비교할 대상
        while(true){
            if(sum == M) cnt++; // 값이 같다면

            if(sum >= M){  // 값이 너무 크다면 왼쪽을 줄여줘야함
                sum -= arr[left++];
            }else if(right == N){  // 오른쪽 포인터가 배열 끝까지 도달했으면, 반복을 종료
                break;
            }else if(sum < M){  // 값이 아직 작다면 오른쪽을 늘려줘야함
                sum += arr[right++];
            }
        }

        // 4. 출력
        System.out.println(cnt);
    }
}