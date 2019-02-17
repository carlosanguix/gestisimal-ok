package almacen;

import java.util.ArrayList;

import productos.Producto;

public class Almacen {

	//		ATRIBUTOS
	private ArrayList<Producto> listaDeProductos;
	
	
	
	
	//		CONSTRUCTORES
	
	
	
	
	//		PROPIEDADES
	public ArrayList<Producto> getListaDeProductos() {
		
		return listaDeProductos;
		
	}
	
	
	
	
	//		METODOS
	// Dar de baja un producto
	
	// Dar de alta un producto
	public void crearProducto () {
		
		
	}
	
	// Listar productos
	public void listarProductos () {
		
		for (int i = 0; i < this.listaDeProductos.size(); i++) {
			
			System.out.println(this.listaDeProductos.get(i));
		}
	}

	@Override
	public String toString() {
		return listaDeProductos + "\n";
	}
	
	
	
	
	
}
