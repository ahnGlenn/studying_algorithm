import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 인접리스트 변수 선언
    static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    static boolean[] visited;
    static int cnt=0;

    public static void main(String[] args) throws IOException {
        // 1. 입력값 받기
        Scanner sc = new Scanner(System.in);
        int Node = sc.nextInt(); // 컴퓨터 수
        int Edge = sc.nextInt(); // 연결쌍 수

        // 2. 방문기록 객체 선언
        visited = new boolean[Node + 1];

        // 3. 인접리스트 초기화
        for(int i=0; i<=Node; i++){
            list.add(new ArrayList<Integer>());
        }

        // 4. 인접리스트에 연결정보 입력
        for(int i=0; i<Edge; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 양방향이므로
            list.get(a).add(b);
            list.get(b).add(a);
        }

        // 5. DFS(바이러스는 1번 컴퓨터에서 시작하므로 DFS를 1번 노드부터 시작)
        DFS(1);

        // 6. 결과출력
        System.out.println(cnt-1); // 자기자신(1번노드)는 빼야되니 -1
    }

    private static void DFS(int node) {
        visited[node] = true; // 방문처리
        cnt++; // 감염된 컴터 수 1 증가

        for(int next : list.get(node)){
            if(!visited[next]){
                DFS(next);
            }
        }
    }
}