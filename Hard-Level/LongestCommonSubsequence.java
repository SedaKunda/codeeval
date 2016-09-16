import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
        	File file = new File(args[0]);			
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                if (line.trim().equals(""))
                    continue;
                String[] lineArray = line.split(";");
                if (lineArray.length > 0) {
                    Process(lineArray);
                }
            }
            in.close();
        } catch (IOException e) {
        }
    }
    private static void Process(String[] lineArray) {
        String S1 = lineArray[0];
        String S2 = lineArray[1];
        String c = dyn(S1, S2);
        System.out.println(c);
    }

    public static String dyn(String X, String Y) {
        int M = X.length();
        int N = Y.length();
        int[][] c = new int[M + 1][N + 1];
        String[][] b = new String[M + 1][N + 1];
        for (int i = 0; i <= M; i++) {
            c[i][0] = 0;
            b[i][0] = "";
        }
        for (int j = 0; j <= N; j++) {
            c[0][j] = 0;
            b[0][j] = "";
        }
        for (int i = 1; i <= M; i++)
            for (int j = 1; j <= N; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = b[i - 1][j - 1]
                            + String.valueOf(X.charAt(i - 1));
                } else {
                    c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                    if (c[i - 1][j] > c[i][j - 1])
                        b[i][j] = b[i - 1][j];
                    else
                        b[i][j] = b[i][j - 1];
                }
            }
        return b[M][N];
    }

}
			
