import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n의 약수 중
        int k = sc.nextInt(); // k번째로 작은 수
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n % i == 0){ // 나머지가 0이면 약수
                list.add(i);
            }
        }

        for(int i=0; i<list.size(); i++){
            if(k > list.size()){ // k가 리스트 사이즈 넘어가면 0
                System.out.println(0);
                break;
            }else{
                System.out.println(list.get(k-1));
                break;
            }
        }
    }
}