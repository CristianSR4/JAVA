import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int filas = 10;
		int columnas = 10;
		
		int [][] matriz = new int[filas][columnas];
		
		int fila=0, columna=0;
		Scanner teclado = new Scanner(System.in);
		
		//inicializar matriz con todo a 0
		inicializarMatriz(matriz, filas, columnas);
		
		//Imprimir la sala del cine (matriz)
		imprimirMatriz(matriz, filas, columnas);
		System.out.println();
		
		//comprar una entrada, es necesario decir fila/columna de la butaca
		comprarEntrada(matriz, fila, columna, teclado);
		
		//imprimir la sala del cine (matriz)
		imprimirMatriz(matriz, filas, columnas);
		
	}

	private static void comprarEntrada(int[][] matriz, int fila, int columna, Scanner teclado) {
		//Pedir fila/columna al usuario
		try {
		System.out.println("Introduzca fila: ");
		fila = teclado.nextInt();
		System.out.println("Introduzca columna: ");
		columna = teclado.nextInt();
		
		//Si la j NO es 8 NI 1
		if((matriz[fila][columna]==8) || (matriz[fila][columna]==1)) {
			if (matriz[fila][columna]==8) {
				System.out.println("No hay butaca, es pasillo");
			}
			else {
				System.out.println("Esa butaca ya está ocupada");
			}
			System.out.println("Esta butaca no existe, es pasillo");
		}
		else {
		matriz[fila][columna] = 1;
		}
		}catch (InputMismatchException error) {
			System.out.println("No introduzca palabras raras");
		}catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("El valor introducido no es correcto");
		}
	}

	private static void imprimirMatriz(int[][] matriz, int filas, int columnas) {
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}

	private static void inicializarMatriz(int[][] matriz, int filas, int columnas) {
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				if ((j==4) || (j==5)) matriz[i][j]= 8;
				else matriz[i][j] = 0;
			}
		}
	}
	
	
		
	

}
