package exaomega;

import java.util.Scanner;

public class OmegaIXR {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        if (!usuario.hasNextInt()) return;

        int elementos = usuario.nextInt();
        int[] conteo = new int[1000001];
        int maximoValor = 0;

        for (int i = 0; i < elementos; i++) {
            int valorEntrada = usuario.nextInt();
            conteo[valorEntrada]++;
            if (valorEntrada > maximoValor) {
                maximoValor = valorEntrada;
            }
        }

        int num1 = 0;
        int num2 = 0;

        for (int d = maximoValor; d >= 1; d--) {
            int primerMultiplo = 0;
            int segundoMultiplo = 0;

            for (int m = (maximoValor / d) * d; m >= d; m -= d) {
                if (conteo[m] > 0) {
                    if (primerMultiplo == 0) {
                        primerMultiplo = m;
                        if (conteo[m] >= 2) {
                            segundoMultiplo = m;
                            break;
                        }
                    } else {
                        segundoMultiplo = m;
                        break;
                    }
                }
            }

            if (segundoMultiplo > 0) {
                num1 = primerMultiplo;
                num2 = segundoMultiplo;
                break;
            }
        }

        int A = num1;
        int B = num2;
        while (B != 0) {
            int residuo = A % B;
            A = B;
            B = residuo;
        }
        int divisorComun = A;

        long resultado = ((long) num1 / divisorComun) * num2;

        System.out.println(resultado);
    }
}