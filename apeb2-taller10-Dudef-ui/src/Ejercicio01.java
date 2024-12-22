
import java.util.Scanner;

/**
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar
 * su procesamiento para presentar los elementos: De la diagonal principal. De
 * la diagonal segundaria. Ubicados bajo la diagonal principal. Ubicados sobre
 * la diagonal principal. Ubicados bajo la diagonal secundaria. Ubicados sobre
 * la diagonal secundaria.
 *
 * @author David González/Dudef-ui
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int extension_Matriz = 0;
        System.out.print("Dime la extension de la matriz: ");
        extension_Matriz = teclado.nextInt();
        int matriz[][] = new int[extension_Matriz][extension_Matriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Solucion obvia");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        //ES EFICIENTE PORQUE REDUCE CODIGO Y REDUCE LA CANTIDAD DE CICLOS
        System.out.println("Solucion eficiente: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("");
        System.out.println("Solucion secundaria obvia: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("Solucion secundaria eficiente: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + "\t");
        }
        System.out.println("");
        System.out.print("Solucion bajo la diagonal principal:\n");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.print("Solucion sobre la diagonal principal:\n");
        for (int i = 0; i <= matriz.length; i++) {
            for (int j = 1 + i; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.print("Solucion bajo la diagonal secundaria:\n");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                if (i + j > matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.print("Solucion sobre la diagonal secundaria:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j < matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
    }
}
/***
 * run:
 * 2	9	8	
 * 5	8	9	
 * 4	4	4	
 * Solucion obvia
 * 2	8	4	
 * Solucion eficiente: 
 * 2	8	4	
 * Solucion secundaria obvia: 
 * 8	8	4	
 * Solucion secundaria eficiente: 
 * 8	8	4	
 * Solucion bajo la diagonal principal:
 * 5	4	4	
 * Solucion sobre la diagonal principal:
 * 9	8	9	
 * Solucion bajo la diagonal secundaria:
 * 9	4	4	
 * Solucion sobre la diagonal secundaria:
 * 2	9	5	
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
