package BasicsOverview;
import java.util.Scanner;

public class SumofOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i=1; i <=n; i++){
            int oddNumber = 2 * i -1;
            sum = sum + oddNumber;
            System.out.println(oddNumber);

        }
        System.out.println("Sum: " + sum);




    }
}
