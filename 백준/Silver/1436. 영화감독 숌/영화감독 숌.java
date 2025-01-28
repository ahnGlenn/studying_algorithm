import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        // 입력받은 값과, 카운트가 같으면 멈춤.
        while(N != count){
            num ++;
            if(String.valueOf(num).contains("666")){
                count ++;
            }
        }

        System.out.println(num);
    }
}