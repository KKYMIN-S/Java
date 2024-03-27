package Java_;
import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int max = 0, min = 0;
        int[]array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = cin.nextInt();
        }
        min = array[0];
        max = array[0];

        for (int i = 0; i < n; i++)
        {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.printf("%d %d", min, max);
    }
}
