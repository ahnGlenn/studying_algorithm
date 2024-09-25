import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String origin = sc.nextLine();
        StringBuffer reverse = new StringBuffer();
        reverse.append(origin).reverse();

        if(origin.equals(reverse.toString())){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}