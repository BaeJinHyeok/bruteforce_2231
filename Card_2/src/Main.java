import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int N;

    private static BufferedReader br;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        LinkedList<Integer> deque = new LinkedList<Integer>();

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());

        int temp = 0;
        for(int i = 1; i<=N; i++) {
            deque.offer(i);
        }
        while(deque.size() != 1) {
            deque.pollFirst();
            temp = deque.pollFirst();
            deque.offerLast(temp);
        }
        System.out.println(deque.poll());
    }
}
