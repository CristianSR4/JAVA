import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Un array es una lista de elementos del mismo tipo, para crearlo, dos opciones:
		
		// 1. Lo creamos vacio añadiendo la capacidad:
		
		Scanner teclado = new Scanner(System.in);
		
		String [] contactos = new String[6];
		
		for(int i=0; i<contactos.length; i++) {
			System.out.println("Introduzca un contacto en la posicion:" +i);
			contactos[i]=teclado.next();
		}
		
		System.out.println();
		
		for(int i=0; i<contactos.length; i++) {
			System.out.println(contactos[i]);
		}
		
		// 2. Lo creamos con elementos incluidos:
		
			//int [] edades = {19, 20, 16, 12, 22, 51};
			//for (int i=0; i<edades.length; i++)
			//System.out.println("La edad selecionada es:" +edades[i]);
	}

}
