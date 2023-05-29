import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    private static int N;
    private static int M;
    private static int[] arr;

    private static BufferedReader br;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        int result = search(arr, N, M);
        System.out.println(result);
    }

        static int search(int[] arr, int N, int M){
            int result = 0;

            for (int i = 0; i < N - 2; i++) {
                for (int j = i + 1; j < N - 1; j++) {
                    for (int k = j + 1; k < N; k++) {
                        int temp = arr[i] + arr[j] + arr[k];
                        if( temp == M) return temp;
                        if (temp < M && temp > result) {
                            result = temp;
                        }
                    }
                }
            }
            return result;
        }
    }
