import java.util.Scanner;

public class Main {
    private static int N;
    private static int result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 0; i<N; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
                System.out.println(num +" "+  sum);
            }
            if( sum + i == N){
                result = i;
                break;
            }

        }


        System.out.println(result);

    }
}
