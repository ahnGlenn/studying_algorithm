import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        Set<String> set = new HashSet<>();

        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                set.clear(); // Enter가나오면 리셋해줘야함.
            }else{
                if(set.contains(str)){
                    continue;
                }else{
                    set.add(str);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}