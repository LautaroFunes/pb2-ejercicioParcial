package pb2.disqueria;

import org.junit.Assert;
import org.junit.Test;

public class testDisqueria {
//
	Disqueria d = new Disqueria();
	Disco nuevo1 = new Cds("B0030901-02", "Beatles", "Abbey Road (2019)", 2019, 1000.0, 20); // es un cd simple
	Disco nuevo2 = new Vinilo("B0030975-01", "Beatles", "Abbey Road (2019)", 2019, 2000.0, 20, "Negro"); // es un vinilo
																											// doble de
																											// color
																											// negro
	Disco nuevo3 = new Vinilo("B0030975-01", "Beatles", "Abbey Road (2019)", 2019, 2000.0, 20, "Negro"); // es un cd
																											// simple

	@Test
	public void testQueVerifiqueQueSeAgregaronDosDiscos() {
		d.agregarDisco(nuevo1);
		d.agregarDisco(nuevo2);
		d.agregarDisco(nuevo3);
		Integer valorEsperado = 2;
		Integer valorActual = d.getListaDiscos().size();
		Assert.assertEquals(valorEsperado, valorActual);
	}

	@Test
	public void testQueEliminaUnDiscoCorrectamente() {
		d.agregarDisco(nuevo1);
		try {
			d.eliminarDisco("B0030901-02");
		} catch (ElDiscoNoExisteException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testQueAgregaUnaVenta() {
		d.agregarDisco(nuevo1);
		Ventas vent = new Ventas(nuevo1, 0, 5, 500.0);
		d.agregarVenta(vent);
	}

	@Test
	public void testQueEliminaUnaVenta() {
		d.agregarDisco(nuevo1);
		Ventas vent = new Ventas(nuevo1, 0, 5, 500.0);
		d.agregarVenta(vent);
		try {
			d.eliminarVenta(0);
		} catch (LaVentaNoExisteException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = LaVentaNoExisteException.class)
	public void testQueEliminaUnaVentaInexistente() throws LaVentaNoExisteException {
		d.agregarDisco(nuevo1);
		Ventas vent = new Ventas(nuevo1, 0, 5, 500.0);
		d.agregarVenta(vent);
		d.eliminarVenta(1);
	}

	@Test(expected = ElDiscoNoExisteException.class)
	public void testQueEliminaUnDiscoInexistente() throws ElDiscoNoExisteException {
		d.agregarDisco(nuevo1);
		d.eliminarDisco("asd");
	}

	@Test
	public void testQueModificaPrecio() {
		d.agregarDisco(nuevo1);
		try {
			d.modificarPrecio("B0030901-02", 500.0);
		} catch (ElPrecioEsInvalidoException e) {
			e.printStackTrace();
		}
	}

	@Test(expected = ElPrecioEsInvalidoException.class)
	public void testQueModificaMalUnPrecio() throws ElPrecioEsInvalidoException {
		d.agregarDisco(nuevo1);
		Double precioNuevo = -1230.0;
		d.modificarPrecio("B0030901-02", precioNuevo);
	}

}
