import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());

        // 2. 배열 생성 후 정렬
        token = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }
        Arrays.sort(arr);

        // 3. M값, 찾을 수 입력받기
        token = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(token.nextToken());
        token = new StringTokenizer(br.readLine());

        // 4. 이분탐색 로직
        for(int i=0 ; i<M; i++){
            // M개의 숫자중, 찾아야하는 정수 하나씩 초기화
            int target = Integer.parseInt(token.nextToken());
            int left = 0;
            int right = N-1;
            boolean found = false;

            // left가 right보다 커질 수 없기에..
            while(left <= right){
                int mid = (right+left)/2;

                // 1) target이 mid값보다 작으면 왼쪽에서 찾아야함 : right는 mid-1의 값으로 왼쪽으로 범위 좁힘
                if(target < arr[mid]){
                    right = mid-1;
                }else if (target == arr[mid]){
                    System.out.println(1);
                    found = true;
                    break;
                }else{
                    left = mid+1;
                }
            }
            // 2) 못찾은경우
            if(!found){
                System.out.println(0);
            }
        }
    }
}