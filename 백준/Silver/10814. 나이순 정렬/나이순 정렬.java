import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] strArr = new String[n][2];

        for(int i=0; i<n; i++){
            strArr[i][0] = sc.next();
            strArr[i][1] = sc.next();
        }

        // 정렬 수행
        Arrays.sort(strArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i=0; i<n; i++){
            System.out.println(strArr[i][0] + " " + strArr[i][1]);
        }
    }
}