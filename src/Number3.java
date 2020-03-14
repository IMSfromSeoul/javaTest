package swmaestro;

import java.io.*;

public class Number3 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            StringBuilder result = new StringBuilder();

            if (N % 2 == 1) {
                result.append('7');
                N -= 1;
            }

            while (N != 0) {
                if (N > 1) {
                    result.append(1);
                    N -= 2;
                }
            }

            bw.write(String.valueOf(result));
            bw.flush();
        }
    }
}
