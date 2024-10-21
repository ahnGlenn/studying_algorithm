import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[5][15];

        // 1. 행렬에 차례대로 값 입력받기
        String inputStr = "";
        for(int i=0; i<matrix.length; i++){
            inputStr = sc.next();
            for(int j=0; j<inputStr.length(); j++){
                matrix[i][j] = inputStr.charAt(j);
            }
        }

        // 세로로 출력
        StringBuffer sb = new StringBuffer();
        for(int j=0; j<15; j++){ // 1. 열별로 출력하되
            for(int i=0; i<matrix.length; i++){ // 2. 첫행의 첫번째 열부터 출력하려면 안에 선언
                sb.append(matrix[i][j]);
            }
        }

        // 답
        System.out.print(sb.toString().replaceAll("[^a-zA-Z0-9]", ""));
    }
}