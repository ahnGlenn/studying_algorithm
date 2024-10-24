import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        // 큐에 값 삽입
        for(int i=1; i<=N; i++){
            q.add(i);
        }
        while(q.size() > 1){ // 1과 같아지면 멈추는거니까.  1까지만 본다는 말.
            q.remove();
            int temp = q.remove();
            q.offer(temp);
        }
        System.out.println(q.poll());
    }
}