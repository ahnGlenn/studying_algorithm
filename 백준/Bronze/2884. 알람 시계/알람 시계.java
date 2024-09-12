import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 상근이가 원하는 시간 지정
        String firstLine = br.readLine();
        String[] strs = firstLine.split(" ");
        int hour = Integer.parseInt(strs[0]); // 시간
        int min = Integer.parseInt(strs[1]); // 분
        int total = (hour * 60) + min; // 시간을 분으로 변경 후 '전체 분'

        // 창영이의 조언 계산
        int advise_total = total - 45; // 45분 빼기

        // 음수 처리: 음수의 결과를 처리하기 위해 하루(24시간) 분량을 더함.
        // 하루는 1440분이기 때문에, 음수인 결과에 1440분을 더하면 올바른 시간을 얻을 수 있다.
        if (advise_total < 0) {
            advise_total += 1440; // 24시간(1440분) 추가
        }

        int advise_hour = advise_total / 60; // 시간
        int advise_min = advise_total % 60; // 분

        // 결과 출력
        System.out.println(advise_hour + " " + advise_min);
    }
}