package pb2.disqueria;

import java.util.Comparator;

public class OrdenAnioDePublicacion implements Comparator<Cds> {

	@Override
	public int compare(Cds arg0, Cds arg1) {
		if ((arg0.getAnioDePublicacion().compareTo(arg1.getAnioDePublicacion())) == 0) {
			return arg0.getArtista().compareTo(arg1.getArtista()) ;
		} else
			return arg0.getAnioDePublicacion().compareTo(arg1.getAnioDePublicacion());
	}

}
