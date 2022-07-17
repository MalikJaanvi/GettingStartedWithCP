import java.util.Scanner;

public class ALLPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int num =low;num<=high;num++){
            int count =0;

            for (int div=2;div*div<=num;div++){
                if (num%div==0){
                    count++;
                    break;
                }
            }

            if (count ==0 ){
                System.out.println(num);
            }

        }
    }
}
