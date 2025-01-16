import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        // 셀프 넘버를 판별하기 위해 생성된 숫자를 저장할 HashSet
        HashSet<Integer> generatedNumbers = new HashSet<>();

        // 첫번째, 1 ~ 10000까지 d(n)인 생성자를 체크 후 HashSet에 추가
        for(int i=1; i<=10000; i++ ){
            int dn = d(String.valueOf(i));
            if(dn <= 10000){
                generatedNumbers.add(dn);
            }
        }

        // 마지막, set에 1 ~ 10000까지 담겨있지 않은 숫자라면,  출력
        for(int i=1; i<=10000; i++){
            if(!generatedNumbers.contains(i)){
                System.out.println(i);
            }
        }
    }

    // 두번째, 생성자 숫자 구하기
    public static int d(String n){
        int val = Integer.parseInt(n);
        for(int i=0; i<n.length(); i++){
            val += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return val;
    }
}