
import java.util.Scanner;

/**
 * Ejercicio 4 Crea un programa que gestione el inventario de una tienda.
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en
 * la tienda, con información como nombre, precio y cantidad. El programa debe
 * permitir agregar nuevos productos, actualizar existencias, buscar productos y
 * eliminarlos.
 *
 * @author David González/Dudef-ui
 */
//EN TODO EL PROGRAMA LAS COLUMNAS UTILIZAN VALORES ENTEROS PARA ASEGURAR QUE LOS VALORES SE GUARDEN EN EL LUGAR CORRECTO
//EVITANDO EL USO DE CICLOS EN EXCESO 
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de variables del proyecto
        int extension = 0, proceso = 0;
        boolean continuar = true;
        String actualizar, eliminar;
        String[][] productos = new String[20][3];
        //Condicional del proceso
        System.out.print("BIENVENIDO");
        while (continuar == true) {
            System.out.print("\n¿Qué proceso quieres realizar?\n");
            System.out.print(" 1. Agregar producto\n 2. Actualizar productos existentes\n 3. Buscar producto \n 4. Eliminar productos\n(Presiona 0 si quieres acabar con el proceso)\n");
            proceso = teclado.nextInt();
            teclado.nextLine();
            if (proceso == 0) {
                continuar = false;
            }
            //En caso de querer agregar los productos (use el condicional if y no switch por comodidad)
            if (proceso == 1) {
                System.out.print("¿Cuantos productos quieres agregar?\n(Presiona 0 si quieres cancelar el proceso)\n");
                extension = teclado.nextInt();
                teclado.nextLine();
                if (extension == 0) {
                    continuar = false;
                }
                for (int i = 0; i < extension; i++) {
                    System.out.print("Dime el nombre del producto: ");
                    productos[i][0] = teclado.nextLine();
                    System.out.print("Dime el precio del producto: ");
                    productos[i][1] = teclado.nextLine();
                    System.out.print("Dime la cantidad del producto: ");
                    productos[i][2] = teclado.nextLine();
                }
            }//En caso de querer actualizar productos           
            if (proceso == 2) {
                System.out.println("¿Qué producto quieres actualizar?");
                actualizar = teclado.nextLine();
                teclado.nextLine();
                for (int i = 0; i < extension; i++) {
                    if (productos[i][0].equalsIgnoreCase(actualizar)) {
                        System.out.print("Dime el nuevo producto: ");
                        actualizar = teclado.nextLine();
                        teclado.nextLine();
                        productos[i][0] = actualizar;
                        System.out.print("Dime el precio del nuevo producto: ");
                        productos[i][1] = teclado.nextLine();
                        System.out.print("Dime la cantidad del nuevo producto: ");
                        productos[i][2] = teclado.nextLine();
                        System.out.println(productos[i][0]);
                        System.out.println(productos[i][1]);
                        System.out.println(productos[i][2]);
                        actualizar = "";
                    }
                }
            }
            //En caso de buscar producto
            if (proceso == 3) {
                System.out.print("Dime el nombre del producto que quieres encontrar: ");
                actualizar = teclado.nextLine();
                teclado.nextLine();
                for (int i = 0; i < extension; i++) {
                    if (productos[i][0].equalsIgnoreCase(actualizar)) {
                        System.out.print("El producto se encuentra en las coordenadas: " + i + "\n");
                        System.out.print("Producto: " + productos[i][0] + " Precio: " + productos[i][1] + " Cantidad disponible: " + productos[i][2]);
                        actualizar = "";
                    }
                }
            }
            //En caso e querer eliminar un producto
            if (proceso == 4) {
                System.out.print("Dime el nombre del producto que quieres eliminar: ");
                eliminar = teclado.nextLine();
                teclado.nextLine();
                for (int i = 0; i < extension; i++) {
                    if (productos[i][0].equalsIgnoreCase(eliminar)) {
                        System.out.print("Se va a proceder con la eliminacion del producto: " + productos[i][0] + "\n");
                        //Elimina automaticamente todas las columnas 
                        for (int j = 0; j < productos[0].length; j++) {
                            productos[i][j] = "";
                        }
                        eliminar = "";
                    }
                }
            }
        }
    }
}
/***
 * run:
 * BIENVENIDO
 * ¿Qué proceso quieres realizar?
 * 1. Agregar producto
 * 2. Actualizar productos existentes
 * 3. Buscar producto 
 * 4. Eliminar productos
 * (Presiona 0 si quieres acabar con el proceso)
 * 1
 * ¿Cuantos productos quieres agregar?
 * (Presiona 0 si quieres cancelar el proceso)
 * 2
 * Dime el nombre del producto: Cola
 * Dime el precio del producto: 0.50
 * Dime la cantidad del producto: 15
 * Dime el nombre del producto: Fanta
 * Dime el precio del producto: 0.75
 * Dime la cantidad del producto: 10
 * ¿Qué proceso quieres realizar?
 * 1. Agregar producto
 * 2. Actualizar productos existentes
 * 3. Buscar producto 
 * 4. Eliminar productos
 * (Presiona 0 si quieres acabar con el proceso)
 * 4
 * Dime el nombre del producto que quieres eliminar: Fanta
 * Se va a proceder con la eliminacion del producto: Fanta
 * ¿Qué proceso quieres realizar?
 * 1. Agregar producto
 * 2. Actualizar productos existentes
 * 3. Buscar producto 
 * 4. Eliminar productos
 * (Presiona 0 si quieres acabar con el proceso)
 * 0
 * BUILD SUCCESSFUL (total time: 1 minute 24 seconds)
 */
