import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i));  // 또는 toUpperCase() 사용
            String key = String.valueOf(currentChar);
            // 중복이 있으면 값을 1 더함
            if (map.containsKey(key)) {
                // 현재 key의 value에 1을 더해서 다시 map에 저장
                map.put(key, map.get(key) + 1);
            } else {
                // 처음 등장하는 문자는 1로 설정
                map.put(key, 1);
            }
        }

        // 모든 키, 값을 찾되 여기서는 키값만 뽑고 대문자로 치환
        String max = "";
        int temp=0;
        for(String key : map.keySet()){
            if(temp < map.get(key)){ // temp 값보다 value 값이 크면 저장
                temp = map.get(key);
                max = key;
            }else if(temp == map.get(key)){ // 같으면 물음표
                max = "?";
            }
        }
        System.out.println(max.toUpperCase());
    }
    
}