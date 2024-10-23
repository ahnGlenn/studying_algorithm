import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    // '(' 여는괄호가 있을 때는 push,  ')'닫는 괄호가 있으면 여는 괄호를 하나 지우면(pop) 된다.
    // 완전한 수식인 경우 최종적으로 스택에 아무 것도 없어야 한다.
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N번 실행
        for(int i=0; i<N; i++){
            String str = br.readLine();

            Stack<Character> stack = new Stack<>();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '('){
                    stack.push('(');
                }else if(stack.empty()){  // 빈값에서 pop을 하면 에러니까 비정상이라는 뜻
                    stack.push(')');
                    break;
                }else{
                    stack.pop();
                }
            }
            // 스택이 비어있으면 정상
            if(stack.empty()){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}