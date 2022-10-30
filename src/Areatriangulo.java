import java.util.Scanner;

public class Areatriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CALCULAR EL AREA DE UN TRIANGULO");
        System.out.println("Ingrese el valor de la base: ");
        double base = teclado.nextDouble();//se lee el valor dado por el teclado
        System.out.println("Ingrese el valor de la altura: ");
        double altura = teclado.nextDouble();//se lee el valor dado por el teclado
        double area = (base*altura)/2;
        double resultado = Math.round(area);
        System.out.println("El area del triangulo es: " + area);
    }
}
