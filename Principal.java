import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        metodos n = new metodos();
        int cant = 0;
        System.out.println("Ingrese la dimension del patio ");
        cant = teclado.nextInt();
        ObjVehiculo[] r = new ObjVehiculo[cant];
        r = n.LlenarRegistros(r);
        r = n.calcularNuevoPago(r);
        n.mostrarRegistros(r);
    }
}
