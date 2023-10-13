import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] mat = new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};

        System.out.println(Arrays.toString(kWeakestRows(mat, 3)));

        }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int t = 0;
        int[] result = new int[k];
        boolean[] weak = new boolean[mat.length];

        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                if (!weak[i] && mat[i][j] == 0) {
                    weak[i] = true;
                    result[t++] = i;
                    if (t >= k) return result;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            if(!weak[i]) {
                result[i] = i;
            }

        }
        return result;
    }

}

