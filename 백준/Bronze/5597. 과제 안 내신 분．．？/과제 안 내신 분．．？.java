import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();  //중복x, 순서 중요

        int[] arrs = new int[30]; // 30명 배정
        int[] submits = new int[28]; // 28명 제출

        // 인원 수 만큼 set에 값 저장
        for(int i=1; i<=arrs.length; i++){
            set.add(i);
        }

        // 제출하는 사람을 입력받아,  위 30명에서 제거
        for(int i=1; i<=submits.length; i++){
            int num = sc.nextInt();
            set.remove(num);
        }

        // set의 기본형인 []가 아닌 인트형으로 출력
        for(int num : set){
            System.out.println(num);
        }
    }
}