import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int num = sc.nextInt();
            int count = 0;

            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prme");
            }
        }
    }
}
