import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = 0;
        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i < count + 1; i++) {
            total += i;
        }
        sb.append(total);
        System.out.println(sb);
        br.close();
    }
}