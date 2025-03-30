import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;
        int cnt = 1;

        while(end_idx != N){ // end_idx가 15랑 같지 않을 경우
            if(sum == N){ // 1. 조건만족
                cnt++;
                end_idx++;
                sum = sum + end_idx;
            }else if(sum < N){ // 2. end포인트를 오른쪽으로 증가 해야함.
                end_idx++;
                sum = sum + end_idx;
            }else{ // 3. N보다 커서 숫자를 맨 왼쪽의 수를 제외시키며 진행해야함.
                sum = sum - start_idx;
                start_idx++;
            }
        }

        System.out.print(cnt);
    }
}