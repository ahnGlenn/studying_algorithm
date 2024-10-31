import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> hmap = new HashMap<>();
        // 1. 첫번째 줄(몇번 수행?)
        int cnt = 0;
        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            String str = br.readLine();
            // M 보다 커야 함
            if(str.length() >= M){
                // 중복되면 카운트 +1
                if(hmap.containsKey(str)){
                    hmap.put(str, hmap.get(str) + 1);
                }else{
                    hmap.put(str, cnt+1);
                }
            }
        }
        // 엔트리 세트를 List로 변환
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hmap.entrySet());
        // List 정렬 (값 기준 내림차순, 단어 길이 내림차순, 알파벳 오름차순)
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int valueCompare = e2.getValue().compareTo(e1.getValue()); // 값 기준 내림차순
                if (valueCompare == 0) {
                    int lengthCompare = Integer.compare(e2.getKey().length(), e1.getKey().length()); // 길이 기준 내림차순
                    if (lengthCompare == 0) {
                        return e1.getKey().compareTo(e2.getKey()); // 알파벳 오름차순
                    }
                    return lengthCompare;
                }
                return valueCompare;
            }
        });

        // 결과 출력
        for (Map.Entry<String, Integer> entry : entryList) {
            sb.append(entry.getKey()).append("\n");
        }
        System.out.println(sb);
    }
}