import java.sql.SQLOutput;
import java.util.Scanner;

public class P1258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("수를 입력 하시요 : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("1부터" + n + "까지 합은  : ");
        System.out.println(sum);
    }
}
