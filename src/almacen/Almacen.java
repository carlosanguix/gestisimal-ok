package almacen;

import java.util.ArrayList;
import java.util.Scanner;

import productos.Producto;

public class Almacen {

	//		ATRIBUTOS
	private ArrayList<Producto> listaDeProductos;




	//		CONSTRUCTORES
	public Almacen () {

		this.listaDeProductos = new ArrayList<Producto>();
	}



	//		PROPIEDADES
	public ArrayList<Producto> getListaDeProductos() {

		return listaDeProductos;

	}




	//		METODOS
	// Dar de baja un producto
	public void eliminarProductoDeLaLista (String codigoAEliminar) {
		
		// Buscamos el producto en el almacén
		int posicionProducto = this.buscarProductoPorCodigo(codigoAEliminar);
		// Eliminamos el producto en cuestión (por índice)
		this.listaDeProductos.remove(posicionProducto);
	
	}

	// Dar de alta un producto
	public void añadirProductoALaLista (Producto nuevoProducto) {

		this.listaDeProductos.add(nuevoProducto);
	}

	// Listar productos
	public void listarProductos () {

		System.out.println("    ** Listado de productos **");
		System.out.println("       --------------------\n");

		// Si la lista esta vacía
		if (this.listaDeProductos.size() == 0) {

			System.out.println("No hay productos que listar.");

			// Si la lista tiene productos
		} else {

			for (int i = 0; i < this.listaDeProductos.size(); i++) {
				
				System.out.println(this.listaDeProductos.get(i));
			}
		}


	}

	// Modificar un producto
	public void modificarProducto (String codigoProducto) {
		
		Scanner sc = new Scanner(System.in);
		
		int posicionProducto = this.buscarProductoPorCodigo(codigoProducto);
		
		menuModificar();
		int opcion = sc.nextInt();
		sc.nextLine();
		
		switch (opcion) {
		case 1:
			
			// Modificar código
			System.out.print("\nNuevo código");
			String nuevoCodigo = sc.nextLine();
			this.listaDeProductos.get(posicionProducto).modificarCodigoProducto(nuevoCodigo);
			
			break;
		case 2:
			
			// Modificar nombre
			System.out.print("\nNuevo nombre: ");
			String nuevoNombre = sc.nextLine();
			this.listaDeProductos.get(posicionProducto).modificarNombreProducto(nuevoNombre);
			
			break;
		case 3:
			
			// Modificar precio de compra
			System.out.print("\nNuevo precio de compra: ");
			double nuevoPrecioCompra = sc.nextDouble();
			this.listaDeProductos.get(posicionProducto).modificarPrecioCompra(nuevoPrecioCompra);
			
			break;
		case 4:
			
			// Modificar precio de venta
			System.out.println("\nNuevo precio de venta");
			double nuevoPrecioVenta = sc.nextDouble();
			this.listaDeProductos.get(posicionProducto).modificarPrecioVenta(nuevoPrecioVenta);
			
			break;

		default:
			break;
		}
		
	}
	
	// Buscar producto en la lista
	private int buscarProductoPorCodigo (String codigo) {
		
		int posicionProducto = -1;
		
		for (int i = 0; i < this.listaDeProductos.size(); i++) {
			
			if (this.listaDeProductos.get(i).getCodigo().equals(codigo)) {
				
				posicionProducto = i;
				break;
			}
		}
		
		return posicionProducto;
		
	}
	
	private static void menuModificar () {

		System.out.println("\nQué desea modificar del producto?");
		System.out.println(" 1- Código.");
		System.out.println(" 2- Nombre.");
		System.out.println(" 3- Precio de compra.");
		System.out.println(" 4- Precio de venta.");
		System.out.print("\nOpción: ");

	}
	
	@Override
	public String toString() {
		return listaDeProductos + "\n";
	}





}
