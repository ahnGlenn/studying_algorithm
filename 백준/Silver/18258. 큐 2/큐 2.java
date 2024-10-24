import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        // 큐 생성.... 마지막 값을 불러오는 함수가없기에 덱을 사용
        // Queue<Integer> q = new LinkedList<>();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            switch (str[0]){
                case "push" : dq.add(Integer.parseInt(str[1])); break;
                case "pop" :
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(dq.remove()).append("\n");
                    }
                    break;
                case "size" : sb.append(dq.size()).append("\n"); break;
                case "empty" :
                    if(dq.isEmpty()){
                        sb.append("1").append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front" :
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(dq.getFirst()).append("\n");
                    }
                    break;
                case "back" :
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(dq.getLast()).append("\n");
                    }
                break;
            }
        }
        System.out.println(sb);
    }
}