package pb2.disqueria;

public class Cds extends Disco /* implements Comparable */ {
	private Integer cantidadDeCds;

	public Cds(String codigo, String artista, String titulo, Integer anioDePublicacion, Double precio,
			Integer cantidadDeCds) {
		super(codigo, artista, titulo, anioDePublicacion, precio);
		this.cantidadDeCds = cantidadDeCds;
	}

	public Integer getCantidadDeCds() {
		return cantidadDeCds;
	}

	public void setCantidadDeCds(Integer cantidadDeCds) {
		this.cantidadDeCds = cantidadDeCds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidadDeCds == null) ? 0 : cantidadDeCds.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cds other = (Cds) obj;
		if (cantidadDeCds == null) {
			if (other.cantidadDeCds != null)
				return false;
		} else if (!cantidadDeCds.equals(other.cantidadDeCds))
			return false;
		return true;
	}

}
