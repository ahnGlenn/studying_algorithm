import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령어 수

        for(int i=0; i<N; i++){
            String str = br.readLine();
            String[] parts = str.split(" "); // 입력을 공백으로 나누기
            int command = Integer.parseInt(parts[0]);

            switch (command){
                case 1 :
                    if (parts.length > 1) { // 두 번째 부분이 존재하는지 확인
                        stack.push(Integer.parseInt(parts[1]));
                    }
                    break;
                case 2 : System.out.println(stack.empty() ? "-1" : stack.pop()); break;
                case 3 : System.out.println(stack.size()); break;
                case 4 : System.out.println(stack.empty() ? "1" : "0"); break;
                case 5 : System.out.println(stack.empty() ? "-1" : stack.peek()); break;
                default: break;
            }
        }
    }
}