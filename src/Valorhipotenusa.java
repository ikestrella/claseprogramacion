import java.util.Scanner;

public class Valorhipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular el valor de la hipotenusa");
        System.out.println("Ingrese el valor del cateto adyacente: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor del cateto opuesto: ");
        double b = teclado.nextDouble();
        double hipotenusa = Math.sqrt((a*a)+(b*b));
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
}
