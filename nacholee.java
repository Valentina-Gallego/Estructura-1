import java.util.Scanner;

public class nacholee {

    public static void main(String[] args) {
        System.out.println("Vamos a sumar 2 numeros");
        int n1=0, n2=0, suma=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el numero 2: ");
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println("La suma de los 2 numeros es: " + suma);
    }
}