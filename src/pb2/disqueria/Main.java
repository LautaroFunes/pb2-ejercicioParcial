package pb2.disqueria;

public class Main {

	public static void main(String[] args) {

		Disqueria d = new Disqueria();
		Disco nuevo1 = new Cds("B0030901-02", "TheBeatles", "Abbey Road (2019)", 2019, 1000.0, 20); // es un cd simple
		Disco nuevo2 = new Vinilo("B0030975-01", "Beatles", "Abbey Road (2019)", 2019, 2000.0, 20, "negro"); // es un
		Disco nuevo6 = new Vinilo("B0030975-07", "Beatles", "Abbey Road (2019)", 2019, 2000.0, 50, "negro"); // es un
																												// vinilo
		Disco nuevo3 = new Cds("B0030901-03", "LosBeatles", "Abbey Rod (2019)", 2018, 1040.0, 20); // es un cd simple
		Disco nuevo4 = new Cds("B0030901-04", "ElzBeatle", "Abbey Roa (2019)", 2019, 1050.0, 20); // es un cd simple
		Disco nuevo5 = new Cds("B0030901-05", "EllosBeatles", "Abbey Rad (2019)", 2019, 1060.0, 20); // es un cd simple

		Ventas vent = new Ventas(nuevo2, 0, 15, 50.0);
		Ventas vent2 = new Ventas(nuevo1, 0, 15, nuevo2.getPrecio());
		Ventas vent3 = new Ventas(nuevo3, 0, 15, nuevo3.getPrecio());
		Ventas vent4 = new Ventas(nuevo4, 0, 15, nuevo4.getPrecio());
		Ventas vent5 = new Ventas(nuevo6, 0, 45, 50.0);

		d.agregarDisco(nuevo1);
		d.agregarDisco(nuevo2);
		d.agregarDisco(nuevo3);
		d.agregarDisco(nuevo4);
		d.agregarDisco(nuevo5);
		d.agregarDisco(nuevo6);
		System.out.println(d.getListaDiscos());
		System.out.println("---");
		System.out.println(d.listaDeCdsOrdenadosPorAnioDePublicacion());
		System.out.println("---");
		d.agregarVenta(vent);
		d.agregarVenta(vent5);
		System.out.println(d.getListaDiscos());
		System.out.println("-");
		System.out.println(d.cantidadDeVinilosVendidosDeColorNegro());
		System.out.println("-");
		System.out.println(d.getListaDiscos());
		d.agregarVenta(vent2);
		d.agregarVenta(vent3);
		d.agregarVenta(vent4);
		System.out.println("-");
		System.out.println(d.getListaDiscos());
		System.out.println("-");
		System.out.println(d.ventaTotalDeCdsSimples());

	}

}
