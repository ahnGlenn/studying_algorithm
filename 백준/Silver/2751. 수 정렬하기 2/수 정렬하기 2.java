import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        // 내장 정렬 함수
        Collections.sort(list);

        for(int value : list){
            bw.write(value + "\n");
        }
        bw.close();
    }
}