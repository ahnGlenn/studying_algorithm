import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 첫번째 줄(몇번 수행?)
        int N = Integer.parseInt(br.readLine());

        // 2. 자료구조를 배열에 넣고 파악(0 1 1 0)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrs = new int[N];
        for(int i=0; i<N; i++){
            arrs[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 자료구조를 파악하고, 초기값을 대입
        //    0(큐)일경우 값을 넣어주지만, 1(스택)의 경우 값이 항상같으므로 무시
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(arrs[i] == 0){
                deque.addLast(num);
            }
        }

        // 4. 삽입할 원소 개수 M
        int M = Integer.parseInt(br.readLine());

        // 5. M개수 만큼 데이터 삽입하기.
        //    큐에 데이터 넣고,  기존 데이터 빼기
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            deque.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(deque.removeLast()).append(" ");
        }

        System.out.println(sb.toString());
    }
}