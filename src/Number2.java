import java.io.*;
import java.util.StringTokenizer;

public class Number2 {
    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final String TRUE = "1";

    private static int T, N, M;
    private static boolean[][] target;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringBuilder sb = new StringBuilder();

            T = Integer.parseInt(br.readLine());

            for (int t = 0; t < T; t++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                N = Integer.parseInt(st.nextToken());
                M = Integer.parseInt(st.nextToken());
                target = new boolean[N][M];

                for (int n = 0; n < N; n++) {
                    st = new StringTokenizer(br.readLine());

                    for (int m = 0; m < M; m++) {
                        target[n][m] = st.nextToken().equals(TRUE);
                    }
                }

                boolean check = true;

                for (int n = 0; n < N; n++) {
                    for (int m = 0; m < M; m++) {
                        if (target[n][m] && !checkNeighbor(m, n)) {
                            check = false;
                            break;
                        }
                    }
                    if (!check) {
                        break;
                    }
                }

                sb.append(check ? YES : NO).append('\n');
            }

            bw.write(sb.toString());
            bw.flush();
        }
    }

    private static boolean checkNeighbor(int i, int j) {
        boolean temp = target[j][i];

        if (i == 0) {
            if (!target[j][i + 1]) {
                return false;
            }
        } else if (i == M - 1) {
            if (!target[j][i - 1]) {
                return false;
            }
        } else {
            if (!(target[j][i + 1] || target[j][i - 1])) {
                return false;
            }
        }

        if (j == 0) {
            if (!target[j + 1][i]) {
                return false;
            }
        } else if (j == N - 1) {
            if (!target[j - 1][i]) {
                return false;
            }
        } else {
            if (!(target[j + 1][i] || target[j - 1][i])) {
                return false;
            }
        }

        return true;
    }
}