package pb2.disqueria;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Disqueria {
	// private String nombre;
	Set<Disco> listaDiscos = new HashSet<Disco>();
	List<Ventas> listaVentas = new LinkedList<Ventas>();

	public Disqueria(/* String nombre */) {
		// this.nombre = nombre;
	}

	public void agregarDisco(Disco nuevo) { // sin excepciones. No retorna nada
		listaDiscos.add(nuevo);
	}

	public Boolean eliminarDisco(String codigo) throws ElDiscoNoExisteException {
		Iterator<Disco> it = listaDiscos.iterator();
		while (it.hasNext()) {
			Disco aux = it.next();
			if (aux.getCodigo().equals(codigo)) {
				it.remove();
			}
		}
		throw new ElDiscoNoExisteException();
	}

	public void agregarVenta(Ventas vent) {
		Iterator<Disco> it = listaDiscos.iterator();
		while (it.hasNext()) {
			Disco aux = it.next();
			if (aux.getCodigo().equals(vent.getDiscoAVender().getCodigo())) {
				listaVentas.add(vent);
				it.remove();
			}
		}
	}

	public Boolean eliminarVenta(Integer id) throws LaVentaNoExisteException {
		Iterator<Ventas> it = listaVentas.iterator();
		while (it.hasNext()) {
			Ventas aux = it.next();
			if (aux.getIdVenta().equals(id)) {
				it.remove();
			}
		}
		throw new LaVentaNoExisteException();
	}

	public void listaDeCdsOrdenadosPorAnioDePublicacion() { // no es void
		Set<Cds> listaOrdenada = new TreeSet<Cds>();
		for (Disco disc : listaDiscos) {
			if (disc instanceof Cds) {
				listaOrdenada.add((Cds) disc);
			}
		}
	}

	public Ventas cantidadDeVinilosVendidosDeColorNegro() { // no es void
		for (Ventas lista : listaVentas) {
			if (lista.getDiscoAVender() instanceof Vinilo) {
				if (((Vinilo) lista.getDiscoAVender()).getColor().equals("Negro")) {
					return lista;
				}
			}
		}
		return null;
	}

	public Integer ventaTotalDeCdsSimples() { // no es void
		for (Ventas lista : listaVentas) {
			if (lista.getDiscoAVender() instanceof Cds) {
				Integer valorAdevolver = 0;
				valorAdevolver += lista.getCantidad();
				return valorAdevolver;
			}
		}
		return 0;
	}

	public Boolean modificarPrecio(String codigo, Double precio) throws ElPrecioEsInvalidoException {
		if (precio > 0.0) {
			for (Disco n : listaDiscos) {
				if (n.getCodigo().equals(codigo)) {
					n.setPrecio(precio);
					return true;
				}
			}
		}
		throw new ElPrecioEsInvalidoException();
	}

	public Set<Disco> getListaDiscos() {
		return listaDiscos;
	}

	public void setListaDiscos(Set<Disco> listaDiscos) {
		this.listaDiscos = listaDiscos;
	}

	public List<Ventas> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(List<Ventas> listaVentas) {
		this.listaVentas = listaVentas;
	}

}
