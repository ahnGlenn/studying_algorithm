import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];

        // 1. 행렬에 차례대로 값 입력받기
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt(); // 사용자로부터 값 입력받기
            }
        }

        // 2. 행렬의 값을 비교 후  max값 생성
        int max = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(max);
        System.out.print((row+1) + " " + (col+1));
    }
}