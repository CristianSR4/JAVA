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
		System.out.println("4. Entrada de un autobús");
		System.out.println("5. Salida de un vehículo");
		System.out.println("6. Ver recaudación");
		System.out.println("7. Salir del programa");
		System.out.println("Introduzca opción: ");
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
			
			System.out.println("Introduce fila válida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna válida: ");
			columna = teclado.nextInt();
		}
		
	}

	private static void EntrarAutobus(char[][] parking, int filas, int columnas, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		
		
	}

	private static void EntrarMoto(char[][] parking, int filas, int columnas, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		
		
	}

	private static void EntrarCoche(char[][] parking, int filas, int columnas, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		
		
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
				if((f == 0) || (f == 4) || (c == 9) || (c == 0)) {
					parking [f][c] = 'P';
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
