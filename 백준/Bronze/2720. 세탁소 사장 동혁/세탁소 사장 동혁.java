import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       /*
        Quarter, $0.25
        Dime,    $0.10
        Nickel,  $0.05
        Penny,   $0.01
       */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int coin = Integer.parseInt(br.readLine());

            int Quarter = coin/25;
            coin %= 25;
            int Dime = coin/10;
            coin %= 10;
            int Nickel = coin/5;
            coin %= 5;
            int Penny = coin;

            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }
    }
}