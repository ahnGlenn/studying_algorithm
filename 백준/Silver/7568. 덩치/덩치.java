import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            String[] inputs = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(inputs[0]);
            arr[i][1] = Integer.parseInt(inputs[1]);
        }
        // System.out.println(Arrays.deepToString(arr));

        for(int i=0; i<arr.length; i++){
            int rank = 1;
            for(int j=0; j<arr.length; j++){
                if(i == j) continue;	// 같은 사람은 비교할 필요가 없음
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            // i 의 랭크값을 출력
            System.out.println(rank);
        }
    }
}