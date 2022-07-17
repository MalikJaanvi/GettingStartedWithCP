import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rotation = sc.nextInt();

        int count =0;
        int temp = num;
        while(temp!=0){
            temp/=10;
            count++;
        }

        rotation %= count;

        if (rotation<0){
            rotation = count + rotation;
        }

        int div = 1;
        int mul =1;
        for (int i=1;i<=count;i++){
            if (i<=rotation) {
                div *= 10;
            }else{
                mul *=10;
            }
        }
        int rem = num%div;
        int que =num/div;
        int rot = rem *mul+que;
        System.out.println(rot);
        /*
        while (rotation !=0){
            if (rotation>0) {
                int rem = num % 10;
                num /= 10;
                num += rem * (int) Math.pow(10, count - 1);
                rotation--;
            }else{
                int rem = num/(int) Math.pow(10,count-1);
                num %= (int) Math.pow(10,count-1);
                num*=10;
                num +=rem;
                rotation++;
            }
        }
        System.out.println(num);
         */
    }
}
