package exaomega;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OmegaDXR {
    public static void main(String[] args) throws IOException {
        // Inicialización de la entrada y salida rápida nativa
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String linea = br.readLine();
        if (linea == null) return;
        
        // Conversión ultra rápida a entero sin dependencias extras
        int n = Integer.parseInt(linea.trim());
        
        int numeroActual = 1;
        
        // Bucles anidados de alta velocidad
        for (int fila = 1; fila <= n; fila++) {
            for (int j = 0; j < fila; j++) {
                // Escribir el número como texto de forma directa
                bw.write(Integer.toString(numeroActual));
                
                if (j < fila - 1) {
                    bw.write(" "); // Espacio sin saltos intermedios
                }
                numeroActual++;
            }
            bw.write("\n"); // Salto de línea óptimo
        }
        
        // Forzar la descarga completa del buffer al sistema antes de salir
        bw.flush();
    }
}
