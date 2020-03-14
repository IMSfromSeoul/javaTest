import java.io.*;

public class number1 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            StringBuilder result = new StringBuilder();

            while (N != 0) {
                if (N > 1) {
                    result.append(1);
                    N -= 2;
                } else {
                    result.setCharAt(0, '7');
                    break;
                }
            }

            bw.write(String.valueOf(result));
            bw.flush();
        }
    }
}