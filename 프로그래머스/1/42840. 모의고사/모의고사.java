import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] person_1 = {1, 2, 3, 4, 5}; // 5
        int[] person_2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] person_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        int[] rank = new int[3]; // 세명의 순위를 매김
        
        for(int i=0; i<answers.length; i++){
            if(person_1[i%5] == answers[i]){ rank[0] ++; } 
            if(person_2[i%8] == answers[i]){ rank[1] ++; } 
            if(person_3[i%10] == answers[i]){ rank[2] ++; }
        }
        
        // 배열 내에서 가장 큰수 찾기
        int max = Arrays.stream(rank).max().getAsInt();
        
        // 최대 점수를 가진 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<rank.length; i++){
            if(max == rank[i]){
               answ.add(i+1);   
            }
        } 
        
        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }
}