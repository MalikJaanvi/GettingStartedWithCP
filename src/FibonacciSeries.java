import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int n = 0;n<num;n++){
            System.out.println(first);
            int next = first+second;
            first = second;
            second = next;
        }
    }
}
