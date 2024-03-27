package Java_;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int max = 0, count = 0;
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = cin.nextInt();
        }
        max = array[0];
        for (int i = 0; i < 9; i++) {
            if (max < array[i]) {
                max = array[i];
                count = i;
            }
        }
        System.out.printf("%d", max);
        System.out.printf("\n%d", count+1);
    }
}
