import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i =1;
        int sum =0;
        while (num!=0){
            int rem = num %10;
            int div = (int) Math.pow(10,rem-1);
            sum += i*div;
            i++;
            num /=10;
        }
        System.out.println(sum);
    }
}
