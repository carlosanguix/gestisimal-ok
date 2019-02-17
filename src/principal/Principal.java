package principal;

import java.util.Scanner;

public class Principal {

	public static void menu () {
		
		System.out.println("\n*******************************");
		System.out.println("   BIENVENIDO A GESTISIMAL");
		System.out.println("*******************************\n");
		System.out.println(" 1- Listado de productos");
		System.out.println(" 2- Alta.");
		System.out.println(" 3- Baja.");
		System.out.println(" 4- Modificación.");
		System.out.println(" 5- Entrada de mercancía.");
		System.out.println(" 6- Salida de mercancía.");
		System.out.println(" 0- Salir.");
		System.out.print("\nOpción: ");
		
//		1. Listado
//		2. Alta
//		3. Baja
//		4. Modificación
//		5. Entrada de mercancía
//		6. Salida de mercancía
//		7. Salir
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		while (true) {
			
			menu();
			opcion = sc.nextInt();
			
			
			
		}
		
		
		
	}

}
