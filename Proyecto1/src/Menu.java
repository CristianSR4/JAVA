import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tipos de variables más conocidas
		// La opcion es para la eleccion del usuario
		int opcion = 0;
		// Los numeros son para los valores con los que operan
		int num1 = 0;
		int num2 = 0;
		int resultado;
		double resultado2;
		double numero1 = 0;
		double numero2 = 0;

		// Crear objeto de la clase Scanner

		Scanner teclado = new Scanner(System.in);

		do {
			// Menu para elegir 4 opciones
			System.out.println("MENU CALCULADORA:");
			System.out.println("---------------------------------------");
			System.out.println("1. Sumar 2 numeros");
			System.out.println("2. Restar 2 numeros");
			System.out.println("3. Multiplicar 2 numeros");
			System.out.println("4. Dividir 2 numeros");
			System.out.println("5. Potencia de 2 numeros (base y exp)");
			System.out.println("6. Raiz cuadrada de un numero");
			System.out.println("7. Maximo de 2 numeros");
			System.out.println("8. Minimo de 2 numeros");
			System.out.println("9. Salir del programa");
			System.out.print("Introduzca opción: ");
			opcion = teclado.nextInt();
			System.out.println();
			// Estudiamos la opcion
			switch (opcion) {
			case 1:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = sumar(num1,num2);
				System.out.println();
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case 2:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = restar(num1,num2);
				System.out.println();
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case 3:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = multiplicar(num1,num2);
				System.out.println();
				System.out.println("El resultado de la multiplicacion es: " + resultado);
				break;
			case 4:
				numero1 = pedirNumeroD(teclado);
				numero2 = pedirNumeroD(teclado);
				resultado2 = dividir(numero1,numero2);
				System.out.println();
				System.out.println("El resultado de la division es: " + resultado2);
				break;
			case 5:
				numero1 = pedirNumeroD(teclado);
				numero2 = pedirNumeroD(teclado);
				resultado2 = potencia(numero1, numero2);
				System.out.println();
				System.out.println("El resultado de la division es: " + resultado2);
				break;
			case 6:
				numero1 = pedirNumeroD(teclado);
				resultado2 = raiz(numero1);
				System.out.println();
				System.out.println("El resultado de la raiz cuadrada es: " + resultado2);
				break;
			case 7:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = maximo(num1, num2);
				System.out.println();
				System.out.println("El maximo de los dos numeros es: " + resultado);
				break;
			case 8:
				num1 = pedirNumeroI(teclado);
				num2 = pedirNumeroI(teclado);
				resultado = minimo(num1, num2);
				System.out.println();
				System.out.println("El maximo de los dos numeros es: " + resultado);
				break;
			case 9:
				System.out.println("HASTA LUEGO!");
				break;
			default:
				System.out.println("Opcion no valida, intente de nuevo");
				break;
			}
			System.out.println();
		} while (opcion != 9);

	}


	private static double pedirNumeroD(Scanner teclado) {
		System.out.print("Introduzca numero: ");
		double numero = teclado.nextDouble();
		return numero;
	}

	private static int pedirNumeroI(Scanner teclado) {
		System.out.print("Introduzca numero: ");
		int num = teclado.nextInt();
		return num;
	}

	private static int minimo(int num1, int num2) {
		return Math.min(num1, num2);
	}

	private static int maximo(int num1, int num2) {
		return Math.max(num1, num2);
	}

	private static double raiz(double numero1) {
		return Math.sqrt(numero1);
	}

	private static double potencia(double numero1, double numero2) {
		return Math.pow(numero1,numero2);
	}

	private static double dividir(double numero1, double numero2) {
		return numero1/numero2;
	}

	private static int multiplicar(int num1, int num2) {
		return num1*num2;
	}

	private static int restar(int num1, int num2) {
		return num1-num2;
	}

	private static int sumar(int num1, int num2) {
		return num1+num2;
	}

}
