package pb2.disqueria;

public class Ventas {

	private Disco discoAVender;
	private Integer idVenta;
	private Integer cantidad;
	private Double total;

	public Ventas(Disco discoAVender, Integer idVenta, Integer cantidad, Double total) {
		super();
		this.discoAVender = discoAVender;
		this.idVenta = idVenta;
		this.cantidad = cantidad;
		this.total = total;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Disco getDiscoAVender() {
		return discoAVender;
	}

	public void setDiscoAVender(Disco discoAVender) {
		this.discoAVender = discoAVender;
	}

}
