package pb2.disqueria;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Disqueria {
	List<Disco> listaDiscos = new LinkedList<Disco>();
	Set<Ventas> listaVentas = new TreeSet<Ventas>();

	public Disqueria() {
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
		List<Cds> listaOrdenada = new LinkedList<Cds>();
		for (Disco disc : listaDiscos) {
			if (disc instanceof Cds) {
				listaOrdenada.add((Cds) disc);
				listaOrdenada.sort(new OrdenAnioDePublicacion());
				System.out.println(listaOrdenada);
			}
		}
	}

	public Integer cantidadDeVinilosVendidosDeColorNegro() { // no es void
		for (Ventas lista : listaVentas) {
			if (lista.getDiscoAVender() instanceof Vinilo) {
				if (((Vinilo) lista.getDiscoAVender()).getColor().equals("negro")) {
					Integer devolver = 0;
					devolver += lista.getCantidad();
					return devolver;
				}
			}
		}
		return 0;
	}

	public Double ventaTotalDeCdsSimples() { // no es void
		for (Ventas lista : listaVentas) {
			if (lista.getDiscoAVender() instanceof Cds) {
				Double valorAdevolver = 0.0;
				valorAdevolver += lista.getDiscoAVender().getPrecio();
				return valorAdevolver;
			}
		}
		return 0.0;
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

	public List<Disco> getListaDiscos() {
		return listaDiscos;
	}

	public void setListaDiscos(List<Disco> listaDiscos) {
		this.listaDiscos = listaDiscos;
	}

	public Set<Ventas> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(Set<Ventas> listaVentas) {
		this.listaVentas = listaVentas;
	}

}
