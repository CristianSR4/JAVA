import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean retorno = false;
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
				retorno = EntrarCoche(parking, filas, columnas, precio, teclado);
				if (retorno == true) {
					precio += 5;
				}
				break;
		case 3:
				retorno = EntrarMoto(parking, filas, columnas, precio, teclado);
				if (retorno == true) {
					precio +=3;
				}
				break;
		case 4:
				retorno = EntrarAutobus(parking, filas, columnas, precio, teclado);
				if (retorno == true) {
					precio +=10;
				}
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
				
				if(parking[fila][columna] == 'X' || parking[fila][columna] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
				}
				
				if(parking[fila][columna] == 'E' || parking[fila][columna] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
				}
				else {
					parking[fila][columna] = ' ';
					System.out.println("Hasta pronto");
				}
	
		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
		}
		
	}

	private static boolean EntrarAutobus(char[][] parking, int fila, int columna, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		String matricula = null;
		String modelo = null;
		String marca = null;
		int plazas = 0;
		String compañia = null;
		
		try {
			
			System.out.println("Introduce fila valida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna valida: ");
			columna = teclado.nextInt();
			
				if(parking[fila][columna] == 'X' || parking[fila][columna] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
					return false;
				}
				
				if(parking[fila][columna] == 'E' || parking[fila][columna] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
					return false;
				}
				
				if(parking[fila] [columna] == 'A' || parking[fila] [columna] == 'C' || parking[fila] [columna] == 'M') {
					System.out.println("Plaza ocupada.");
					return false;
				}
				
				else {
					
					System.out.println("Introduce matricula: ");
					matricula = teclado.next();
					
					System.out.println("Introduce marca: ");
					marca = teclado.next();
					
					System.out.println("Introduce modelo: ");
					modelo = teclado.next();
					
					System.out.println("Introduce plazas: ");
					plazas = teclado.nextInt();
					
					System.out.println("Introduce compañia: ");
					compañia = teclado.next();
					
					Autobus auto = new Autobus(matricula, marca, modelo, plazas, compañia);
					parking[fila][columna] = 'A';
					return true;
				}
				
			
		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			return false;
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
			return false;
		}
		
		
	}

	private static boolean EntrarMoto(char[][] parking, int fila, int columna, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		String cilindrada = null;
		String matricula = null;
		String modelo = null;
		String marca = null;
		
		try {
			
			System.out.println("Introduce fila valida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna valida: ");
			columna = teclado.nextInt();
			
				if(parking[fila][columna] == 'X' || parking[fila][columna] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
					return false;
				}
				
				if(parking[fila][columna] == 'E' || parking[fila][columna] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
					return false;
				}
				
				if(parking[fila] [columna] == 'A' || parking[fila] [columna] == 'C' || parking[fila] [columna] == 'M') {
					System.out.println("Plaza ocupada.");
					return false;
				}
				
				else {
					
					System.out.println("Introduce matricula: ");
					matricula = teclado.next();
					
					System.out.println("Introduce marca: ");
					marca = teclado.next();
					
					System.out.println("Introduce modelo: ");
					modelo = teclado.next();
					
					System.out.println("Introduce cilindrada: ");
					cilindrada = teclado.next();
					
					
					Moto mo = new Moto(matricula, marca, modelo, cilindrada);
					parking[fila][columna] = 'M';
					return true;
				}
			
		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			return false;
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
			return false;
		}
		
		
	}

	private static boolean EntrarCoche(char[][] parking, int fila, int columna, int precio, Scanner teclado) {
		// TODO Auto-generated method stub
		
		String si_o_no;
		String matricula = null;
		String modelo = null;
		String marca = null;
		String dni = null;
		boolean electrico = false;
		
		try {
			
			System.out.println("Introduce fila valida: ");
			fila = teclado.nextInt();
			
			System.out.println("Introduce columna valida: ");
			columna = teclado.nextInt();
							
				if(parking[fila][columna] == 'X' || parking[fila][columna] == 'P') {	
					System.out.println("Cuidado, es columna o pared.");
					return false;
				}
				
				if(parking[fila ][columna] == 'E' || parking[fila][columna] == 'S') {
					System.out.println("Atención, esta en la entrada o la salida.");
					return false;
				}
				
				if(parking[fila] [columna] == 'A' || parking[fila] [columna] == 'C' || parking[fila] [columna] == 'M') {
					System.out.println("Plaza ocupada.");
					return false;
				}
				
				else {
					
					System.out.println("Introduce matricula: ");
					matricula = teclado.next();
					
					System.out.println("Introduce marca: ");
					marca = teclado.next();
					
					System.out.println("Introduce modelo: ");
					modelo = teclado.next();
					
					System.out.println("Introduce dni: ");
					dni = teclado.next();
					
					System.out.println("Electrico o no: ");
					si_o_no = teclado.next();
					if (si_o_no == "Si") {
						electrico = true;
					}
					else {
						electrico = false;
					}
					
					Coche co = new Coche(matricula, marca, modelo, dni, electrico);
					parking[fila][columna] = 'C';
					return true;
				}

		
		}catch(InputMismatchException error) {
			System.out.println("Palabra no valida, elige otra opción.");
			return false;
			
		}catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("Valor no valido, elige otra opción");
			return false;
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
				if((f == 0) || (f == 4) || (f == 1) && (c == 9) || (f == 2) && (c == 9) || (f == 3) && (c == 9)) {
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
