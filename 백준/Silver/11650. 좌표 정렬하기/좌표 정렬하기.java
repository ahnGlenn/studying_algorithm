import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] Arr = new int[n][2];

        for(int i=0; i<n; i++){
            Arr[i][0] = sc.nextInt();
            Arr[i][1] = sc.nextInt();
        }

        // 정렬 수행
        Arrays.sort(Arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if( o1[0] == o2[0] ){
                    return Integer.compare(o1[1],o2[1]);
                }
                return Integer.compare(o1[0],o2[0]);

            }
        });

        for(int i=0; i<n; i++){
            System.out.println(Arr[i][0] + " " + Arr[i][1]);
        }
    }
}