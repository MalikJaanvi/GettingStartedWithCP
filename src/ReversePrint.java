import java.util.Scanner;

public class ReversePrint {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int count =0;
            int temp = num;
            while (temp !=0){
                temp /=10;
                count++;
            }
            int div =10;
            while(num !=0){
                System.out.println(num%div);
                num /=div;
            }
        }
}
