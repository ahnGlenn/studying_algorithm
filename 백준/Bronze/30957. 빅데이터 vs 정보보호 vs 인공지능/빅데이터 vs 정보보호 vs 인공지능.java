import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int students = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int b = 0, s = 0, a = 0;  // B, S, A 카운트 초기화

        // 학생 수만큼만 체크를 하기에 str의 문장길이가 길어도 상관없음
        for (int i = 0; i < students; i++) {
            if (str[i] == 'B') {
                b++;
            } else if (str[i] == 'S') {
                s++;
            } else if (str[i] == 'A') {
                a++;
            }
        }

        // System.out.println("카운트 :  " + b + "/" + s + "/" + a);

        int max = Math.max(b, Math.max(s, a));  // 세 값 중 가장 큰 값 찾기

        // 출력 조건에 맞는 결과 출력
        if (b == s && s == a) {
            System.out.println("SCU");  // 세 값이 동일
        } else if (max == b && max == s) {
            System.out.println("BS");  // B와 S가 동일하게 가장 큼
        } else if (max == s && max == a) {
            System.out.println("SA");  // S와 A가 동일하게 가장 큼
        } else if (max == b && max == a) {
            System.out.println("BA");  // B와 A가 동일하게 가장 큼
        } else {
            if (max == b) {
                System.out.println("B");  // B가 가장 큼
            } else if (max == s) {
                System.out.println("S");  // S가 가장 큼
            } else if (max == a) {
                System.out.println("A");  // A가 가장 큼
            }
        }
    }
}