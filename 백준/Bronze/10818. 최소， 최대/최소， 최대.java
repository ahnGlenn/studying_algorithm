import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 단
        int[] nums = new int[A];

        for(int i = 0; i < A; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[A-1];

        System.out.println(min +" "+max);
    }
}