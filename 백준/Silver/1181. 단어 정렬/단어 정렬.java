import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] strArr = new String[n];
        for(int i=0; i<n; i++){
            strArr[i] = br.readLine();
        }
        // 정렬(양수 : 순서변경, 음수 : 그대로, 같음 : 사전정렬)
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length() - o2.length();
                }
            }
        });

        // 중복제거 : 다음 문자와 현재 문자가 같지 않다면 출력
        for(int i=0; i<n; i++){
            if(i == 0){
                bw.write(strArr[i] + "\n");
            }else if(i != 0 && !strArr[i].equals(strArr[i-1])){
                bw.write(strArr[i] + "\n");
            }
        }
        bw.close();
    }
}