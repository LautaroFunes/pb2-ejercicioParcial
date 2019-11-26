package pb2.disqueria;

public abstract class Disco {

	private String codigo;
	private String artista;
	private String titulo;
	private Integer anioDePublicacion;
	private Double precio;

	public Disco(String codigo, String artista, String titulo, Integer anioDePublicacion, Double precio) {
		this.codigo = codigo;
		this.artista = artista;
		this.titulo = titulo;
		this.anioDePublicacion = anioDePublicacion;
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnioDePublicacion() {
		return anioDePublicacion;
	}

	public void setAnioDePublicacion(Integer anioDePublicacion) {
		this.anioDePublicacion = anioDePublicacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anioDePublicacion == null) ? 0 : anioDePublicacion.hashCode());
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Disco other = (Disco) obj;
		if (anioDePublicacion == null) {
			if (other.anioDePublicacion != null)
				return false;
		} else if (!anioDePublicacion.equals(other.anioDePublicacion))
			return false;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", artista=" + artista + ", titulo=" + titulo + ", anioDePublicacion="
				+ anioDePublicacion + ", precio=" + precio + "\n";
	}
	
	

}
