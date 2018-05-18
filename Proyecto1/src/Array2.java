import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lista de elementos del mismo tipo sin necesidad de darle capacidad. No necesario limite, se adapta al contenido establecido.
		
		ArrayList<String> lista = new ArrayList<String>();
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.println("Introduzca un contacto en la posicion:" +i);
			lista.add(teclado.next());
		}
		
		System.out.println();
		
		for(int i=0; i<6; i++) {
			System.out.println(lista.get(i));
		}
	}

}
