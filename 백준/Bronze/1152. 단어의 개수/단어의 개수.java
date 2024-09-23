import java.util.*;

public class Main {
    public static void main(String[] args) {

        // sc.next(), nextLine()의 차이
        // 1. 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다
        // 2. 문자 또는 엔터를 치기 전까지의 문장 전체를 입력받는다.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.startsWith(" ") && str.length() == 1 ){ // (" ") 공백만
            System.out.print(0);
        }else if(str.startsWith(" ")){ // (" blank ")앞뒤공백 존재
            String[] arr = str.split(" ");
            System.out.print(arr.length -1);
        }else{ // 일반 문장
            String[] arr = str.split(" ");
            System.out.print(arr.length);
        }
    }
}