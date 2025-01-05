import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = String.valueOf(sc.nextInt());
        int length = str.length();
        String[] arr = new String[length];

        for(int i=0; i<length; i++){
            arr[i] = String.valueOf(str.charAt(i));
        }

        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        for(String answer : arr){
            System.out.print(answer);
        }
    }
}