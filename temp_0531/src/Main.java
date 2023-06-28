import java.util.Scanner;

public class Main {
    private static int A;
    private static int B;

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        while (a.hasNext()) {
            A = a.nextInt();
            B = a.nextInt();
            int sum = A + B;
            System.out.println(sum);
        }
    }

}