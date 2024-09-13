import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrs = new int[10];

        // set 자료형에 담고(중복x), 카운트
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arrs.length; i++){
            set.add(sc.nextInt() % 42);
        }
        System.out.println(set.size());

    }
}