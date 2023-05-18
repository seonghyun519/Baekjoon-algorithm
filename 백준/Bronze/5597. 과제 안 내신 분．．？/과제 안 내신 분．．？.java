import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())] = true;
        }

        int a=-1, b=-1;
        for (int i = 1; i <= 30; i++) {
            if(arr[i] == false) {
                if(a==-1)
                    a=i;
                else
                    b=i;
            }
        }
        System.out.println(a>b ? b : a);
        System.out.println(a<b ? b : a);
        br.close();
    }

}