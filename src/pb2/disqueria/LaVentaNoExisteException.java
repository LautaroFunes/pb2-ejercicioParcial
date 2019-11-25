package pb2.disqueria;

public class LaVentaNoExisteException extends Exception {
	
	public LaVentaNoExisteException() {
		super("La venta que intenta eliminar nunca fue efectuada.");
	}
	
}
