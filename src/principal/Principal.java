package principal;

import java.util.Scanner;

import almacen.Almacen;
import productos.Producto;

public class Principal {

	public static void menu () {

		System.out.println("\n\n   | MENU |\n");
		System.out.println(" 1- Listado de productos");
		System.out.println(" 2- Alta.");
		System.out.println(" 3- Baja.");
		System.out.println(" 4- Modificación.");
		System.out.println(" 5- Entrada de mercancía.");
		System.out.println(" 6- Salida de mercancía.");
		System.out.println(" 0- Salir.");
		System.out.print("\nOpción: ");

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Almacen productosAlmacen = new Almacen();

		String codigoProducto;
		String nombreProducto;
		int cantidadProducto;
		double precioCompraProducto;
		double precioVentaProducto;

		int opcion;

		System.out.println("******************************");
		System.out.println("   BIENVENIDO A GESTISIMAL");
		System.out.println("******************************");

		while (true) {

			menu();
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (opcion) {
			case 1:

				// Listar productos
				productosAlmacen.listarProductos();

				break;
			case 2:

				// Dar de alta un producto
				System.out.print("Codigo del producto: ");
				codigoProducto = sc.nextLine();
				System.out.print("Nombre del producto: ");
				nombreProducto = sc.nextLine();
				System.out.print("Precio de compra: ");
				precioCompraProducto = sc.nextDouble();
				System.out.print("Precio de venta: ");
				precioVentaProducto = sc.nextDouble();
				// Creamos el producto nuevo
				Producto nuevoProducto = new Producto(codigoProducto, nombreProducto, precioCompraProducto, precioVentaProducto);
				// Lo añadimos a la lista de productos del almacén
				productosAlmacen.añadirProductoALaLista(nuevoProducto);

				break;
			case 3:

				// Dar de baja un producto
				System.out.println("Indique el código del producto a eliminar.");
				System.out.print("Código: ");
				codigoProducto = sc.nextLine();
				productosAlmacen.eliminarProductoDeLaLista(codigoProducto);

				break;
			case 4:

				// Modificar un producto
				System.out.println("Indique el código del producto a modificar.");
				System.out.print("Código: ");
				codigoProducto = sc.nextLine();
				
				productosAlmacen.modificarProducto(codigoProducto);

				break;
			case 5:

				// Entrada de mercancía de un producto

				break;
			case 6:

				// Salida de mercancía de un producto

				break;
			case 0:

				// Salir del programa
				System.exit(0);

				break;

			default:
				break;
			}

		}



	}

}
