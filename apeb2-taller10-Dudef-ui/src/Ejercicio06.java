import java.util.Scanner;
/**
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3.
 * Permita a dos jugadores marcar sus movimientos alternativamente. El juego
 * debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 *
 * @author David González/Dudef-ui
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definicion de la matriz 3x3
        boolean continuar = true;
        int x = 0, y = 0, movimientos = 0;
        char[][] juego = new char[3][3];
        System.out.print("""
                         BIENVENIDO A MI PRIMER JUEGO EN JAVA
                                     Tres en raya 
                         """);
        //Existen 8 formas de ganar en el tres en raya
        //Pienso utilizar ciclos y condicionales que verifiquen si el jugador ha ganado
        while (continuar == true) {
            for (int i = 0; i < juego.length; i++) {
                for (int j = 0; j < juego.length; j++) {
                    System.out.print("\t[ " + juego[i][j] + " ]");
                }
                System.out.println("");
            }
            //Declaracion de ubicaciones de jugadores
            //Condicional en caso de que las casillas ya esten ocupadas
            System.out.print("El jugador 'x' inicia el juego: \nDime las coordenadas de tu movimiento: (x,y)");
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (juego[x][y] == 'o') {
                System.out.println("Casilla ocupada, movimiento no valido");
            } else {
                juego[x][y] = 'x';
                movimientos++;
            }
            System.out.print("Es turno del jugador 'o'\nDime las coordenadas de tu movimiento: (x,y)");
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (juego[x][y] == 'x') {
                System.out.println("Casilla ocupada, movimiento no valido");
            } else {
                juego[x][y] = 'o';
                movimientos++;
            }
            //Verificacion de victoria 
            for (int i = 0; i < juego.length; i++) {
                if(movimientos != 9) {
                    //En caso gane el jugador 'x'
                    if (juego[i][0] == 'x' && juego[i][1] == 'x' && juego[i][2] == 'x'
                            || juego[0][i] == 'x' && juego[1][i] == 'x' && juego[2][i] == 'x') {
                        System.out.print("Gana el jugador x\n");
                        continuar = false;
                    } else if (juego[0][2] == 'x' && juego[1][1] == 'x' && juego[2][0] == 'x'
                            || juego[0][0] == 'x' && juego[1][1] == 'x' && juego[2][2] == 'x') {
                        System.out.print("Gana el jugador x\n");
                        continuar = false;
                    }
                    //En caso gane el jugador 'o'
                    if (juego[i][0] == 'o' && juego[i][1] == 'o' && juego[i][2] == 'o'
                            || juego[0][i] == 'o' && juego[1][i] == 'o' && juego[2][i] == 'o') {
                        System.out.print("Gana el jugador o\n");
                        continuar = false;
                    } else if (juego[0][2] == 'o' && juego[1][1] == 'o' && juego[2][0] == 'o'
                            || juego[0][0] == 'o' && juego[1][1] == 'o' && juego[2][2] == 'o') {
                        System.out.print("Gana el jugador o\n");
                        continuar = false;
                    }
                }else{
                    System.out.println("Empate");
                    continuar = false;
                    break;
                }
                
            }
            System.out.println("");
        }
    }
}
/***
 * BIENVENIDO A MI PRIMER JUEGO EN JAVA
            Tres en raya
	[   ]	[   ]	[   ]
	[   ]	[   ]	[   ]
	[   ]	[   ]	[   ]
* El jugador 'x' inicia el juego: 
* Dime las coordenadas de tu movimiento: (x,y)0 0
* Es turno del jugador 'o'
* Dime las coordenadas de tu movimiento: (x,y)0 1
	[ x ]	[ o ]	[   ]
	[   ]	[   ]	[   ]
	[   ]	[   ]	[   ]
* El jugador 'x' inicia el juego: 
* Dime las coordenadas de tu movimiento: (x,y)0 2
* Es turno del jugador 'o'
* Dime las coordenadas de tu movimiento: (x,y)1 0
	[ x ]	[ o ]	[ x ]
	[ o ]	[   ]	[   ]
	[   ]	[   ]	[   ]
* El jugador 'x' inicia el juego: 
* Dime las coordenadas de tu movimiento: (x,y)1 1
* Es turno del jugador 'o'
* Dime las coordenadas de tu movimiento: (x,y)1 2
	[ x ]	[ o ]	[ x ]
	[ o ]	[ x ]	[ o ]
	[   ]	[   ]	[   ]
* El jugador 'x' inicia el juego: 
* Dime las coordenadas de tu movimiento: (x,y)2 1
* Es turno del jugador 'o'
* Dime las coordenadas de tu movimiento: (x,y)2 2
	[ x ]	[ o ]	[ x ]
	[ o ]	[ x ]	[ o ]
	[   ]	[ x ]	[ o ]
* El jugador 'x' inicia el juego: 
* Dime las coordenadas de tu movimiento: (x,y)2 0
* Es turno del jugador 'o'
* Dime las coordenadas de tu movimiento: (x,y)1 1
* Casilla ocupada, movimiento no valido
* Empate
* BUILD SUCCESSFUL (total time: 38 seconds)
 */