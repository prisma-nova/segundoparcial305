package exaomega;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OmegaPXR { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        if (!in.hasNextLong()) return;
        long n = in.nextLong();
        
       
        ArrayList<Long> serie = new ArrayList<>();
        serie.add(n);
        
        
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            serie.add(n);
        }
        
        
        Collections.sort(serie);
        
        int size = serie.size();
        for (int i = 0; i < size; i++) {
            System.out.print(serie.get(i));
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        
        
        System.out.println(); 
        in.close();
    }
}
