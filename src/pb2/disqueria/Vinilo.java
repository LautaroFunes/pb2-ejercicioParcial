package pb2.disqueria;

public class Vinilo extends Disco {

	private Integer cantidadDeDiscos;
	private String color;

	public Vinilo(String codigo, String artista, String titulo, Integer anioDePublicacion, Double precio,
			Integer cantidadDeDiscos, String color) {
		super(codigo, artista, titulo, anioDePublicacion, precio);
		this.cantidadDeDiscos = cantidadDeDiscos;
		this.color = color;
	}

	public Integer getCantidadDeDiscos() {
		return cantidadDeDiscos;
	}

	public void setCantidadDeDiscos(Integer cantidadDeDiscos) {
		this.cantidadDeDiscos = cantidadDeDiscos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
