import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 큐 생성
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            q.add(i);
        }

        sb.append("<");
        while(q.size() > 1){
            for(int i=0; i<(K-1); i++){
                q.add(q.remove());
            }
            sb.append(q.remove()).append(", ");
        }
        sb.append(q.remove()).append(">");
        System.out.println(sb);
    }
}