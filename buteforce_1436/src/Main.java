import java.util.Scanner;

public class Main {

    private static int N;

    public static void main(String[] args)  {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int count = 1;
        int num = 666;

        while(count != N) {

            num++;

            if(String.valueOf(num).contains("666")) {
                count++;
            }


        }
        System.out.println(num);
    }
}
