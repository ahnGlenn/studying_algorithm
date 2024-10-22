import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg = 0;
        int[] arr = new int[5];

        // 배열에 값 추가
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 평균값 구하기
        for(int i=0; i< arr.length; i++){
            avg += arr[i];
        }
        System.out.println(avg/arr.length);

        // 중앙값 구하기
        Arrays.sort(arr);
        System.out.print(arr[arr.length / 2]);
    }
}