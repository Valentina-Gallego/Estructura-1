public class ObjVehiculo {

    private String Marca;
    private String Tipo;
    private int Cilindraje;
    private int numeroCelda;
    private double pagoAnterior;
    private double pagoActual;

    // source action
    public ObjVehiculo(String marca, String tipo, int cilindraje, int numeroCelda, double pagoAnterior,
            double pagoActual) {
        Marca = marca;// mayusculas y minusculas
        Tipo = tipo;
        Cilindraje = cilindraje;
        this.numeroCelda = numeroCelda;
        this.pagoAnterior = pagoAnterior;
        this.pagoActual = pagoActual;
    }

    public ObjVehiculo() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

    public double getPagoAnterior() {
        return pagoAnterior;
    }

    public void setPagoAnterior(double pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }

    public double getPagoActual() {
        return pagoActual;
    }

    public void setPagoActual(double pagoActual) {
        this.pagoActual = pagoActual;
    }

}