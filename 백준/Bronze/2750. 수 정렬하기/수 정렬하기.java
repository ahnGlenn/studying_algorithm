import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // 수 출력
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}