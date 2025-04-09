import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken()); // 배열의 길이

        // 2. 배열 생성
        int[] arr = new int[N];
        token = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }

        // 3. 양쪽에서 할땐 오름차순 필수
        Arrays.sort(arr);

        // 4. 구해야하는 값 X 변수로 받기
        token = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(token.nextToken());

        // 5. 임의의 쌍의 값을(a + b) 를 찾는것이니,  양쪽 끝에서 시작
        int cnt = 0;
        int left = 0;
        int right = N-1; // 배열 index는 0부터 시작이니.
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum == X) {
                cnt++;
                left++;  // 값찾았으면 다음값으로
                right--; // 값찾았으면 다음값으로
            }else if(sum > X){
                right--;
            }else{
                left++;
            }
        }

        // 6. 출력
        System.out.println(cnt);
    }
}