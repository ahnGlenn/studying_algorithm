import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] paper = new int[100][100];
        int count = sc.nextInt();

        for(int i=0; i<count; i++){
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 

            for(int j=a; j<a+10; j++){
                for (int k=b; k<b+10; k++) {
                    paper[k][j] = 1;
                }
            }
        }

        // 2차원 배열 출력. 1인 숫자만 더하기.
        // 겹치는부분을 뺄 필요 없이 그냥 덮어씌우니까.. 더하기만 하면됨.
        int res = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    res += paper[i][j];
                }
            }
        }
        System.out.println(res);
    }
}