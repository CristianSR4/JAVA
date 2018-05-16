import java.util.Scanner;
public class Tercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tipos de variables más conocidas
		// La opcion es para la eleccion del usuario
		int opcion = 0;
		//Los numeros son para los valores con los que operan
		double num1=0;
		double num2=0;
		int resultado;
		
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
			//Estudiamos la opcion
			switch(opcion) {
				case 1: 
					System.out.print("Introduzca numero 1: ");
					num1=teclado.nextInt();
					System.out.print("Introduzca numero 2: ");
					num2=teclado.nextInt();
					resultado = num1+num2;
					System.out.println();
					System.out.println("El resultado de la suma es: "+resultado);
				break;
				case 2: 
					System.out.print("Introduzca numero 1: ");
					num1=teclado.nextInt();
					System.out.print("Introduzca numero 2: ");
					num2=teclado.nextInt();
					resultado = num1-num2;
					System.out.println();
					System.out.println("El resultado de la resta es: "+resultado);
				break;
				case 3: 
					System.out.print("Introduzca numero 1: ");
					num1=teclado.nextInt();
					System.out.print("Introduzca numero 2: ");
					num2=teclado.nextInt();
					resultado = num1*num2;
					System.out.println();
					System.out.println("El resultado de la multiplicacion es: "+resultado);
				break;
				case 4: 
					System.out.print("Introduzca numero 1: ");
					num1=teclado.nextInt();
					System.out.print("Introduzca numero 2: ");
					num2=teclado.nextInt();
					resultado = num1/num2;
					System.out.println();
					System.out.println("El resultado de la division es: "+resultado);
				break;
				case 5: 
					System.out.print("Introduzca la base: ");
					num1=teclado.nextInt();
					System.out.print("Introduzca el exponente: ");
					num2=teclado.nextInt();
					resultado = Math.pow(num1, num2);
					System.out.println();
					System.out.println("El resultado de la division es: "+resultado);
				break;
				case 6: System.out.println("La raiz de 1 es 1");
				break;
				case 7: System.out.println("El maximo de 1 y 2 es 2");
				break;
				case 8: System.out.println("El minimo de 1 y 2 es 1");
				break;
				case 9: System.out.println("HASTA LUEGO!");
				break;
				default: System.out.println("Opcion no valida, intente de nuevo");
				break;
			}
			System.out.println();
		}while(opcion !=9 );

	}

}
