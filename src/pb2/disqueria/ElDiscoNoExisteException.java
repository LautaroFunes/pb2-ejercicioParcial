package pb2.disqueria;

public class ElDiscoNoExisteException extends Exception {
	
	public ElDiscoNoExisteException() {
		super("El disco que intenta eliminar no existe.");
	}
	
}
