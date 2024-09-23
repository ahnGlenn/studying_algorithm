import java.util.*;

public class Main {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // 'a' + 'b'는 97 + 98로 해석되지만, System.out.print(i);는
        // 그런 덧셈 연산을 하지 않고 문자 자체를 출력하기 때문에 a부터 z까지의 문자가 그대로 출력
        for(char i='a'; i<='z'; i++){
            if(word.indexOf(i) > -1){
                System.out.print(word.indexOf(i) + " ");
            }else {
                System.out.print("-1 ");
            }
        }

    }
}