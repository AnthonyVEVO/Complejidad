/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complejidad;

/**
 *
 * @author AnthonyVEVo
 */
public class Complejidad {

        public static int sn1(int n) {  // Cambiado de 'm' a 'n' para consistencia
        if (n < 3) {  // Cambiado de m < 0 a n < 3 (más lógico para el contexto)
            return -1;
        }

        for (int i = 2; i <= (n - 1); i++) {  // Corregido variable 'k' a 'i'
            int s1 = 0;
            for (int j = 1; j <= (i - 1); j++) {
                s1 += j;
            }

            int s2 = 0;  // Añadida declaración de s2
            for (int k = i + 1; k <= n; k++) {  // Corregido de '3 + 1' a 'i + 1'
                s2 += k;
            }

            if (s1 == s2) {
                return i;  // Cambiado de return 1 a return i
            }
        }
        return -1;  // Añadido return final si no se encuentra solución
    }

    public static int sn2(int n) {  // Corregido nombre del método y parámetro
        if (n < 3) {  // Cambiado 'a' por 'n' para consistencia
            return -1;
        }

        for (int i = 2; i < (n - 1); i++) {
            int s1 = i * (i - 1) / 2;  // Corregido 'b' por '='
            int s2 = (n * (n + 1) - i * (i + 1)) / 2;  // Fórmula corregida

            if (s1 == s2) {  // Corregida comparación (s1 == s2)
                return i;  // Cambiado de return 3 a return i
            }
        }
        return -1;  // Cambiado de -2 a -1 para consistencia
    }

    public static int sn3(int n) {
        if (n < 3) {
            return -1;
        }

        // Fórmula corregida para encontrar el punto de división
        double i = (Math.sqrt(8 * n * n + 8 * n + 1) - 1) / 2;

        if (i % 1 == 0 && i > 1 && i < n) {  // Verifica si es entero y dentro del rango válido
            return (int) i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100; // 8.49
        int resultado = 0;
        long inicio1 = System.nanoTime();
        resultado = sn1(n);
        long fin1 = System.nanoTime();
        System.out.println(
                "Fibonacci(" + n + ") = " + resultado + " (Tiempo: " + (fin1 - inicio1) + " ns)");

        long inicio2 = System.nanoTime();
        resultado = sn1(n);
        long fin2 = System.nanoTime();
        System.out.println(
                "Fibonacci(" + n + ") = " + resultado + " (Tiempo: " + (fin2 - inicio2) + " ns)");
        
        long inicio3 = System.nanoTime();
        resultado = sn1(n);
        long fin3 = System.nanoTime();
        System.out.println(
                "Fibonacci(" + n + ") = " + resultado + " (Tiempo: " + (fin3 - inicio3) + " ns)");
        
    }
    
}
