
import java.util.Scanner;

/**
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros
 * aleatorios, desarrollar su procesamiento para calcular y presentar: La suma
 * de las dos matrices (considerar las restricciones matemáticas para ello). La
 * multiplicación de las dos matrices (considerar las reglas matemáticas para
 * ello).
 *
 * @author David González/Dudef-ui
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas, opcion = 0;
        //Se solicita al usuario el tamaño de las matrices
        System.out.print("Dime cuantas filas tienen las matrices: ");
        filas = teclado.nextInt();
        System.out.print("Dime cuantas columnas tienen las matrices: ");
        columnas = teclado.nextInt();
        //Se declara las matrices:
        int matriz1[][] = new int[filas][columnas];
        int matriz2[][] = new int[filas][columnas];
        int matriz3[][] = new int[filas][columnas];
        //Se utiliza un Math.random para llenar las matrices con valores de manera automatica
        System.out.println("Primera matriz: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Segunda matriz: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("\n");
        }
        //Suma de las matrices
        System.out.println("¿Que quieres hacer con las matrices? (1 = sumar, 2 = multiplicar)");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            System.out.println("Suma de matrices: ");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                    System.out.print(matriz3[i][j] + "\t");
                }
                System.out.println("");
            }
            //En caso de multiplicacion de matrices
        } else if (opcion == 2) {
            System.out.println("Multiplicacion de matrices: ");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        //Signo += ya que se va a sumar la multiplicacion de ambas matrices.
                        // matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                        matriz3[i][j] = matriz3[i][j] + (matriz1[i][k] * matriz2[k][j]);
                    }
                    System.out.print(matriz3[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }
}
/***
 * run:
 * Dime cuantas filas tienen las matrices: 2
 * Dime cuantas columnas tienen las matrices: 2
 * Primera matriz: 
 * 6	4	
 * 9	5	
 * Segunda matriz: 
 * 3	9	
 * 1	6	
 * ¿Que quieres hacer con las matrices? (1 = sumar, 2 = multiplicar)
 * 2
 * Multiplicacion de matrices: 
 * 22	78	
 * 32	111	
 * BUILD SUCCESSFUL (total time: 11 seconds)
 */
