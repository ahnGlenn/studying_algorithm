import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());

        int[] Arr = new int[N];
        for(int i=0 ; i<N; i++){
            Arr[i] = Integer.parseInt(token.nextToken());
        }

        // 1. 배열 오름차순으로 정렬(무정렬 상태로 입력 가능하기에)
        Arrays.sort(Arr);

        // 2. 투포인터 알고리즘 실행
        int cnt = 0; // 조건만족시 증가

        for(int k=0; k<N; k++){
            int target = Arr[k];
            int i = 0;
            int j = N-1; // 배열은 0부터 시작이므로 -1해야 최종값

            while(i<j){
                // 자기 자신을 포함하면 안 됨
                if (i == k) {
                    i++;
                    continue;
                }
                if (j == k) {
                    j--;
                    continue;
                }

                if(Arr[i] + Arr[j] == target){
                    cnt++;
                    break;
                }else if(Arr[i] + Arr[j] > target){
                    j--;
                }else{
                    i++;
                }
            }
        }

        // 3. 결과출력
        System.out.println(cnt);
    }
}