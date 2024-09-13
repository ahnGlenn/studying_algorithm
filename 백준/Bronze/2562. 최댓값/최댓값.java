import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // 자릿수와,  번호를 입력
        for (int i = 1; i <= 9; i++) {
            map.put(i, sc.nextInt());
        }

        int num = 0;
        int max = 0;
        for (int i = 1; i <= map.size(); i++) {
            if (i == 1) {
                num = i;
                max = map.get(i);
            } else if (max < map.get(i)) {
                num = i;
                max = map.get(i);
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}