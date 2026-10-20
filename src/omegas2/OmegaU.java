package omegas2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OmegaU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);
        
        int n = nextInt(br);
        if (n <= 0) return;

        int[] colSums = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                colSums[j] += nextInt(br);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sb.append(colSums[j]);
            if (j < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    private static int nextInt(BufferedReader br) throws IOException {
        int c;
        while ((c = br.read()) != -1 && (c < '0' || c > '9'));
        
        if (c == -1) return 0;
        
        int res = 0;
        do {
            res = res * 10 + (c - '0');
        } while ((c = br.read()) != -1 && c >= '0' && c <= '9');
        
        return res;
    }
}
