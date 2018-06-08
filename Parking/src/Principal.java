import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		int fila = 0;
		int filas = 5;
		int columna = 0;
		int columnas = 10;
		int precio = 0;
		char[][] parking = new char [filas][columnas];
		InicializarParking(parking, filas, columnas);

		// Crear objeto de la clase Scanner
		
		Scanner teclado = new Scanner(System.in);
		
	do {
		
		//Menu para elegir 7 opciones
		System.out.println("MENU PARKING: ");
		System.out.println("--------------------------");
		System.out.println("1. Ver el parking");
		System.out.println("2. Entrada de un coche");
		System.out.println("3. Entrada de una moto");
		System.out.println("4. Entrada de un autobus");
		System.out.println("5. Salida de un vehiculo");
		System.out.println("6. Ver recaudacion");
		System.out.println("7. Salir del programa");
		System.out.println("Introduzca opcion: ");
		opcion = teclado.nextInt();
		System.out.println();
		
		// Estudiamos la opcion
		
		switch (opcion) {
		
		case 1: 
				ImprimirParking(parking, filas, columnas);
				break;
		case 2: 
				EntrarCoche(parking, filas, columnas, precio, teclado);
				break;
		case 3:
				EntrarMoto(parking, filas, columnas, precio, teclado);
				break;
		case 4:
				EntrarAutobus(parking, filas, columnas, precio, teclado);
				break;
		case 5:
				SalirVehiculo(parking, filas, columnas, teclado);
				break;
		case 6:
				MostrarDineroTotal(precio);
				break;
		case 7:
				System.out.println("Vuelva cuando quieras sapo");
				break;
		default:
				System.out.println("Opcion no valida, intente de nuevo");
				break;
		}
		System.out.println();
	}while(opcion!=7);
	
	}

	private static void MostrarDineroTotal(int precio) {
		// TODO Auto-generated method stub
		
		System.out.println(precio);
	}

	private static void SalirVehiculo(char[][] parking, int fila, int columna, Scanner teclado) {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println("Introduce fila valida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna valida: ");
			columna = teclado.nextInt();
			
			if(parking[fila -1][columna -1] == 'P' || parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'S' || parking[fila -1][columna -1] == 'E') {
				
				if(parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
				}
				
				if(parking[fila -1][columna -1] == 'E' || parking[fila -1][columna -1] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
				}
				else parking[fila -1][columna -1] = ' ';
			}
		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
		}
		
	}

	private static void EntrarAutobus(char[][] parking, int fila, int columna, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println("Introduce fila valida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna valida: ");
			columna = teclado.nextInt();
			
			if(parking[fila -1][columna -1] == 'P' || parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'S' || parking[fila -1][columna -1] == 'E') {
				
				if(parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
				}
				
				if(parking[fila -1][columna -1] == 'E' || parking[fila -1][columna -1] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
				}
				
				if(parking[fila -1] [columna -1] == 'A' || parking[fila -1] [columna -1] == 'C' || parking[fila -1] [columna -1] == 'M') {
					System.out.println("Plaza ocupada.");
				}
				
				else parking[fila -1][columna -1] = 'M';
			}
		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
		}
		
		
	}

	private static void EntrarMoto(char[][] parking, int fila, int columna, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println("Introduce fila valida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna valida: ");
			columna = teclado.nextInt();
			
			if(parking[fila -1][columna -1] == 'P' || parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'S' || parking[fila -1][columna -1] == 'E') {
				
				if(parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
				}
				
				if(parking[fila -1][columna -1] == 'E' || parking[fila -1][columna -1] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
				}
				
				if(parking[fila -1] [columna -1] == 'A' || parking[fila -1] [columna -1] == 'C' || parking[fila -1] [columna -1] == 'M') {
					System.out.println("Plaza ocupada.");
				}
				
				else parking[fila -1][columna -1] = 'M';
			}
		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
		}
		
		
	}

	private static void EntrarCoche(char[][] parking, int fila, int columna, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		try {
			
			System.out.println("Introduce fila valida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna valida: ");
			columna = teclado.nextInt();
			
			if(parking[fila -1][columna -1] == 'P' || parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'S' || parking[fila -1][columna -1] == 'E') {
				
				if(parking[fila -1][columna -1] == 'X' || parking[fila -1][columna -1] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
				}
				
				if(parking[fila -1][columna -1] == 'E' || parking[fila -1][columna -1] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
				}
				
				if(parking[fila -1] [columna -1] == 'A' || parking[fila -1] [columna -1] == 'C' || parking[fila -1] [columna -1] == 'M') {
					System.out.println("Plaza ocupada.");
				}
				
				else parking[fila -1][columna -1] = 'C';
			}
		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
		}
		
	}
		
	

	private static void ImprimirParking(char[][] parking, int filas, int columnas) {
		// TODO Auto-generated method stub
		
		for(int f = 0; f<filas ; f++) {
			for(int c = 0; c<columnas ; c++) {
				System.out.print(parking[f][c]+"\t");
				}
			
				System.out.println();
				
		}
		
			
	}

	private static void InicializarParking(char[][] parking, int filas, int columnas) {
		// TODO Auto-generated method stub
		
		for (int f = 0; f<filas; f++) {
			for(int c = 0; c<columnas; c++) {
				if((f == 0) || (f == 4) || (c == 1) && (c == 9) || (f == 2) && (c == 9) || (f == 3) && (c == 9)) {
					parking [f][c] = 'P';
					}
				if((c >= 1 && c <= 8) && (f >= 1 && f <= 3)) {
					parking [f][c] = ' ';
				}
				if((c == 0) && (f == 0) || (c == 9) && (f == 0)  ||  (c == 9) && (f == 4) || (c == 0) && (f == 4) || (c == 0) && (f == 2)) {
					parking [f][c] = 'X';
				    }
				if((f == 1) && (c == 0)) {
					parking[f][c] = 'E';
					}
				if((f == 3) && (c == 0)) {
					parking[f][c] = 'S';
				}
			}
		}
	}
	

	
}
