import java.util.Scanner;

public class Area_circunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para obtener el área de una circunferencia");
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        double area = (Math.PI) * (radio*radio);
        System.out.println("El area de la circunferencia es: "+ area);
    }
}
