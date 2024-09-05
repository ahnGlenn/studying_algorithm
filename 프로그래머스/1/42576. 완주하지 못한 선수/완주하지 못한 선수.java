import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hmap = new HashMap();
        
        for(int i=0;i<participant.length; i++){
            if(hmap.containsKey(participant[i])){
                 hmap.put(participant[i], hmap.get(participant[i])+1);
            }else{
                hmap.put(participant[i], 1);
            }
        }
        
        for(int i=0; i<completion.length; i++){
            if(hmap.containsKey(completion[i])){
               hmap.put(completion[i], hmap.get(completion[i])-1);
            }
        }
        
        for(Map.Entry<String, Integer> entry : hmap.entrySet()){
            if( entry.getValue() != 0 ){
                answer =  entry.getKey();
            }
        }
        
        return answer;
    }
}