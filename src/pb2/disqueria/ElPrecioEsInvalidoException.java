package pb2.disqueria;

public class ElPrecioEsInvalidoException extends Exception {

	public ElPrecioEsInvalidoException() {
		super("El precio es menor a cero.");
	}
	
}
