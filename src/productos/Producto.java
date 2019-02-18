package productos;


// TODO Probar en clase a cambiar el encapsulamiento (private, protected, package)
public class Producto {

	//		ATRIBUTOS
	private String codigo;
	private String nombre;
	private int cantidad;
	private double precioCompra;
	private double precioVenta;




	//		CONSTRUCTORES
	// Producto sin cantidad
	public Producto (String codigo, String nombre, double precioCompra, double precioVenta) {

		this(codigo, nombre, 0, precioCompra, precioVenta);

	}

	// Producto con cantidad
	public Producto (String codigo, String nombre, int cantidad, double precioCompra, double precioVenta) {

		this.codigo       = codigo;
		this.nombre       = nombre;
		this.cantidad     = cantidad;
		this.precioCompra = precioCompra;
		this.precioVenta  = precioVenta;

	}




	//		PROPIEDADES
	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}




	//		METODOS
	// Entrada de mercancía (++cantidad)
	// Salida de mercancía (--cantidad)
	// Modificar codigo
	public void modificarCodigoProducto (String nuevoCodigo) {
		
		this.codigo = nuevoCodigo;
	}
	
	// Modificar nombre
	public void modificarNombreProducto (String nuevoNombre) {
		
		this.nombre = nuevoNombre;
	}
	
	// Modificar precio de compra
	public void modificarPrecioCompra (double nuevoPrecioCompra) {
		
		this.precioCompra = nuevoPrecioCompra;
	}
	
	// Modificar precio de venta
	public void modificarPrecioVenta (double nuevoPrecioVenta) {
		
		this.precioVenta = nuevoPrecioVenta;
	}
	

	@Override
	public String toString() {
		return "codigo:       " + codigo + 
				"\nnombre:       " + nombre + 
				"\ncantidad:     " + cantidad + 
				"\nprecioCompra: " + precioCompra + "€" + 
				"\nprecioVenta:  " + precioVenta + "€\n";
	}

}
