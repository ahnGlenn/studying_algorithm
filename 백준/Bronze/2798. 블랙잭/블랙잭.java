import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];

        for(int i=0; i<cards.length; i++){
            cards[i] = sc.nextInt();
        }

        int closest = 0; // M에 가장 가까운 합

        for (int i = 0; i < n - 2; i++) { // 0~8
            for (int j = i + 1; j < n - 1; j++) { // 0~9
                for (int k = j + 1; k < n; k++) { // 0~10
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum == m) {
                        closest = sum;
                    }
                    if(sum > closest && sum < m){
                        closest = sum;
                    }
                }
            }
        }
        System.out.println(closest);
    }
}