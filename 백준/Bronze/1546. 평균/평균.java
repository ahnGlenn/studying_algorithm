import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        * 정수형(int)로 선언시 소수점 뒤가 잘려,  결과값이 다를 수 있음.
        * 따라서, 소수점이 표현되는 문제에서는 double형으로 선언하는게 편함.
        */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //과목 수
        int[] scores = new int[N]; // 현재 성적들

        // 과목 수 만큼 성적 기입
        for(int i=0; i<scores.length; i++){
            scores[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(scores);

        // 최대값
        double max = scores[scores.length-1];

        // 계산
        double avg=0;
        for(int i=0; i<scores.length; i++){
            avg += ( scores[i]/ max) * 100;
        }

        System.out.println(avg/N);
    }
}