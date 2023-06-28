import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int M;

    private static BufferedReader br;
    private static StringTokenizer st;

    private static int[] arr;
    private static int temp = 0;
    private static int result = 0;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for ( int i =0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    temp = arr[i]+arr[j]+arr[k];
                    if(temp < M && result < temp){
                        result = temp;
                    }

                }
            }
        }
        System.out.println(result);
    }
}
