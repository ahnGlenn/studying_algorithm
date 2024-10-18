import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double majorAvg; // 전공평점
        double grade_subject= 0; // 전공과목별 합
        double gradeSum = 0; // 학점 총합

        for(int i=0; i<20; i++){
            String str = sc.nextLine();
            String[] arr = str.split(" ");

            if(!arr[2].equals("P")){
                grade_subject += ( Double.parseDouble(arr[1]) * Double.parseDouble(gradeCheck(arr[2])) );
                gradeSum += Double.parseDouble(arr[1]);
            }
        }
        // 전공평점
        majorAvg = grade_subject / gradeSum;
        System.out.printf("%.6f", majorAvg);
    }

    public static String gradeCheck(String str){
        switch (str) {
            case "A+": return "4.5";
            case "A0": return "4.0";
            case "B+": return "3.5";
            case "B0": return "3.0";
            case "C+": return "2.5";
            case "C0": return "2.0";
            case "D+": return "1.5";
            case "D0": return "1.0";
            default: return "0.0";
        }
    }
}