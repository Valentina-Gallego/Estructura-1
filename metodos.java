import java.util.Scanner;

public class metodos {
    Scanner teclado = new Scanner(System.in);

    public ObjVehiculo[] LlenarRegistros(ObjVehiculo[] r) {
        for (int i = 0; i < r.length; i++) {
            ObjVehiculo o = new ObjVehiculo();// objeto
            System.out.println("Ingrese la marca");
            o.setMarca(teclado.next());
            System.out.println("Ingrese tipo vehiculo");
            o.setTipo(teclado.next());
            System.out.println("Ingrese el cilindraje");
            o.setCilindraje(teclado.nextInt());
            if (o.getCilindraje() > 900 && o.getCilindraje() < 1700) {
                o.setPagoAnterior(150000);// por defecto
            } else if (o.getCilindraje() >= 1700 && o.getCilindraje() < 2000) {
                o.setPagoAnterior(20000);

            } else {
                o.setPagoAnterior(250000);
            }

            o.setNumeroCelda(i + 1);
            r[i] = o;

        }

        return r;
    }

    public ObjVehiculo[] calcularNuevoPago(ObjVehiculo[] r) {
        for (int i = 0; i < r.length; i++) {
            r[i].setPagoActual(r[i].getPagoAnterior() * 1.23);
        }

        return r;
    }

    public void mostrarRegistros(ObjVehiculo[] r) {
        for (int i = 0; i < r.length; i++) {
            System.out.println("Marca: " + r[i].getMarca());
            System.out.println("Tipo vehiculo : " + r[i].getTipo());
            System.out.println("Cilindraje : " + r[i].getCilindraje());
            System.out.println("Pago Anterior : " + r[i].getPagoAnterior());
            System.out.println("Pago actual:  " + r[i].getPagoActual());
            System.out.println("Numero de celda:  " + r[i].getNumeroCelda());

        }
    }

}
