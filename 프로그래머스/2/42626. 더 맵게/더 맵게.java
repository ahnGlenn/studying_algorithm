import java.util.*; 

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 배열을 우선순위 큐에 삽입
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙.
        for(int num : scoville){
            pq.offer(num);
        }
        
        // 횟수 
        while(!pq.isEmpty()){  // 큐안에 내용이 있으면 계속 돌아감. poll() 사용시 큐가 빈값됨.
            
            int current = pq.poll();
            
            if(current < K){ // k보다 작으면 공식 사용
                
                if(pq.size() == 0){
                    return -1;
                }
                
                int next = pq.poll(); // 위에서 이미 최소값빼서, 다음 최소값을 찾음.
                int sum = current + (next * 2);
            
                pq.offer(sum);
                answer++;
            }
        }
        
        return answer;
    }
}