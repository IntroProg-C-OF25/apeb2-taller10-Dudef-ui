
import java.util.Scanner;

/**
 * Crea un programa que gestione el inventario de una tienda, así como la
 * emisión de facturas. Utiliza una matriz bidimensional para almacenar los
 * productos disponibles en la tienda, con información como nombre, precio y
 * cantidad. El programa debe permitir facturar un producto dado su código, y
 * unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y
 * si la compra superar los $100, se debe aplicar un descuento. Nota: Considere
 * la alternativa de inexistencias en Stop, para el caso, muestre la alerta
 * respectiva.
 *
 * @author David Gonzalez/Dudef-ui
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0, cantidad = 0;
        double costo = 0, descuento = 0;
        String producto = " ";
        System.out.print("Dime cuantos productos quieres ingresar: ");
        cont = teclado.nextInt();
        teclado.nextLine();
        String[] productos = new String[cont];
        double[][] precio_cant = new double[cont][2];
        for (int i = 0; i < productos.length; i++) {
            teclado.nextLine();
            System.out.print("Dime el nombre del producto: ");
            productos[i] = teclado.nextLine();
            //Guardado del precio y la cantidad ingresada en el sistema
            //Decidi usar dos arreglos uno para las variables del tipo string y otro para los valores numericos
            System.out.print("Dime el precio del producto: ");
            precio_cant[i][0] = teclado.nextDouble();
            System.out.print("Dime la cantidad del producto: ");
            precio_cant[i][1] = teclado.nextDouble();
            //System.out.println(productos[i]);
            //System.out.println(precio_cant[i][0]);
            //System.out.println(precio_cant[i][1]);
        }
        teclado.nextLine();
        //Empieza el sistema de facturacion
        //Identificacion por el nombre del producto:      
        System.out.print("Dime que producto quieres llevar: ");
        producto = teclado.nextLine();
        for (int i = 0; i < productos.length; i++) {
            if (producto.equalsIgnoreCase(productos[i])) {
                System.out.print("PRODUCTO DISPONIBLE");
                System.out.print("\n¿Cuantas unidades quieres del producto?\n");
                cantidad = teclado.nextInt();
                if (cantidad > precio_cant[i][1]) {
                    System.out.print("Cantidades disponibles insuficientes\nCantidades disponibles: " + precio_cant[i][1]);
                    break;
                } else {
                    System.out.print("Cantidad disponibles\nSe procedera con la facturacion\n");
                    costo = (cantidad * precio_cant[i][0]);
                }
                // Se dara un descuento del 5% si el costo de la factura supera los 100$
                if (costo > 100) {
                    descuento = costo * 0.05;
                    costo = costo - descuento;
                }
                System.out.printf("%s  %s\t%s\t%s\t\n", "Producto", "Cantidad", "Costo", "Descuento");
                System.out.printf("%s\t  %d\t\t%.2f\t%.2f\n", productos[i], cantidad, costo, descuento);
            } else {
                System.out.println("Producto no disponible");
                break;
            }
        }
        System.out.println("");
    }
}
/***
 * Dime cuantos productos quieres ingresar: 1
 * Dime el nombre del producto: soda
 * Dime el precio del producto: 5
 * Dime la cantidad del producto: 5
 * Dime que producto quieres llevar: SODA
 * PRODUCTO DISPONIBLE
 * ¿Cuantas unidades quieres del producto?
 * 4
 * Cantidades disponibles
 * Se procedera con la facturacion
 * Producto  Cantidad	Costo	Descuento	
 * soda	  4		20.00	0.00
 * BUILD SUCCESSFUL (total time: 15 seconds)
 */
