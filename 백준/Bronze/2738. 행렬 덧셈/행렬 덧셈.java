import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        int[][] arr3 = new int[N][M];
        // arr1
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<M;j++){
                arr3[i][j] += sc.nextInt();
            }
        }

        // arr2
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<M;j++){
                arr3[i][j] += sc.nextInt();
            }
        }

        // arr3
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}