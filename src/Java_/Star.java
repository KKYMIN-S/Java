package Java_;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        for (int i = 0; i < n; i++)
        {
            for (int j = n; j >= n - i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
