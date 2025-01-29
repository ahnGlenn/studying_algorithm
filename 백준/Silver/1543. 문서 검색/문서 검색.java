import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); // 주어진 문장
        String search = br.readLine(); // 찾을 단어

        line = line.replaceAll(search, "1");

        int cnt = 0;
        for(int i=0; i<line.length(); i++){
            if(line.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}