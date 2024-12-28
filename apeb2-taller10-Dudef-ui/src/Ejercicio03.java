/**
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 * @author David González/Dudef-ui
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        //Declaracion de los nombres y el arreglo bidimensional que va a contener las notas aleatorias y el promedio de cada estudiante
        double notas[][] = new double[28][3];
        double promedios[] = new double[28];
        String[] estudiantes = {"Juan", "Ana", "Pedro", "María", "Luis", "Sofía", "Carlos", "Lucía", "José", "Valeria", "Miguel", "Elena", "David", "Camila", "Andrés", "Paula", "Javier", "Carol", "Fernan", "Laura", "Ricardo", "Diana", "Hugo", "Isabel", "Manuel", "Adriana", "Diego", "Veró"};
        double promgeneral = 0, mayor = 0, menor = 10;
        int aprobados = 0, reprobados = 0;
        //Filas de notas 0 = ACD, 1 = APE, 2 = AA
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                //Generacion de notas de forma aleatoria
                notas[i][j] = (int) (Math.random() * 10);
                //Ponderacion de las notas a 3.5 y 3.0
                notas[i][j] = ((notas[i][j] * 3.5) / 10);
                notas[i][2] = ((notas[i][2] * 3) / 10);
                promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2]);
            }
            promgeneral = promgeneral + promedios[i];
            //Recorrido de los ciclos para presentar los datos y calcular 
            if (promedios[i] > 7) {
                aprobados++;
            } else {
                reprobados++;
            }if (promedios[i] > mayor) {
                mayor = promedios[i];
            }if (promedios[i] < menor) {
                menor = promedios[i];
            }
        }
        promgeneral = promgeneral / promedios.length;
        //Recorrido para presentar los datos obtenidos
        System.out.printf("|%s\t|%s\t|%s\t|%s\t|%s\t|", "NOMBRES", "APE", "ACD", "AA", "PROMEDIO");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\n%s\t\t %.2f\t %.2f\t %.2f\t %.2f\t", estudiantes[i], notas[i][0], notas[i][1], notas[i][2], promedios[i]);
        }
        System.out.println("");
        System.out.println("\nCantidad de aprobados: " + aprobados + "\nCantidad de reprobados: " + reprobados);
        System.out.println("\nPromedio mas alto: " + mayor + "\nPromedio mas bajo: " + menor);
    }
}
/***
 * run:
 * |NOMBRES	|APE	|ACD	|AA	|PROMEDIO	|
 * Juan		 0.00	 2.45	 0.42	 2.87	
 * Ana		 1.75	 2.80	 0.32	 4.87	
 * Pedro	 2.10	 3.15	 0.10	 5.36	
 * María	 1.40	 0.35	 0.42	 2.17	
 * Luis		 2.10	 0.70	 0.84	 3.64	
 * Sofía	 0.35	 0.00	 0.00	 0.35	
 * Carlos	 1.75	 0.70	 0.21	 2.66	
 * Lucía	 1.40	 1.75	 0.95	 4.10	
 * José		 0.00	 1.75	 0.53	 2.28	
 * Valeria	 0.70	 1.05	 0.21	 1.96	
 * Miguel	 2.45	 3.15	 0.63	 6.23	
 * Elena	 2.10	 2.10	 0.42	 4.62	
 * David	 1.75	 1.40	 0.74	 3.89
 * Camila	 1.75	 2.80	 0.53	 5.08	
 * Andrés	 1.40	 1.40	 0.74	 3.54	
 * Paula	 2.10	 2.80	 0.42	 5.32	
 * Javier	 0.35	 2.80	 0.84	 3.99	
 * Carol	 1.75	 3.15	 0.00	 4.90	
 * Fernan	 1.05	 0.35	 0.63	 2.03	
 * Laura	 3.15	 2.80	 0.53	 6.48	
 * Ricardo	 1.75	 2.80	 0.53	 5.08	
 * Diana	 0.70	 2.80	 0.42	 3.92	
 * Hugo		 3.15	 2.10	 0.42	 5.67	
 * Isabel	 2.80	 3.15	 0.74	 6.69	
 * Manuel	 1.05	 3.15	 0.63	 4.83	
 * Adriana	 2.45	 2.10	 0.21	 4.76	
 * Diego	 2.10	 3.15	 0.95	 6.20	
 * Veró		 2.45	 2.45	 0.21	 5.11	
 * 
 * Cantidad de aprobados: 0
 * Cantidad de reprobados: 28
 * 
 * Promedio mas alto: 6.685
 * Promedio mas bajo: 0.35
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */