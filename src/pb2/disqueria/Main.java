package pb2.disqueria;

public class Main {

	public static void main(String[] args) {

		Disqueria d = new Disqueria();
		Disco nuevo1 = new Cds("B0030901-02", "TheBeatles", "Abbey Road (2019)", 2019, 1000.0, 20); // es un cd simple
		Disco nuevo2 = new Vinilo("B0030975-01", "Beatles", "Abbey Road (2019)", 2019, 2000.0, 20, "negro"); // es un
																												// vinilo
		Disco nuevo3 = new Cds("B0030901-03", "LosBeatles", "Abbey Rod (2019)", 2018, 1040.0, 20); // es un cd simple
		Disco nuevo4 = new Cds("B0030901-04", "ElzBeatle", "Abbey Roa (2019)", 2019, 1050.0, 20); // es un cd simple
		Disco nuevo5 = new Cds("B0030901-05", "EllosBeatles", "Abbey Rad (2019)", 2019, 1060.0, 20); // es un cd simple

		Ventas vent = new Ventas(nuevo2, 0, 15, 50.0);

		d.agregarDisco(nuevo1);
		d.agregarDisco(nuevo2);
		d.agregarDisco(nuevo3);
		d.agregarDisco(nuevo4);
		d.agregarDisco(nuevo5);

		System.out.println(d.getListaDiscos());
		
		d.agregarVenta(vent);
		System.out.println(d.getListaDiscos());
		System.out.println("-");
		System.out.println(d.cantidadDeVinilosVendidosDeColorNegro());
		System.out.println("-");
		System.out.println(d.getListaDiscos());
		System.out.println("-");
		d.listaDeCdsOrdenadosPorAnioDePublicacion();
		
	}

}
