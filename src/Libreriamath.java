import java.util.Scanner;

public class Libreriamath {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = 9;
        //funcion para calcular la raiz cuadrada de un numero
        System.out.println("Calculo de la raiz cuadrada: ");
        double raiz = Math.sqrt(numero);
        System.out.println("El resultado de la raiz es: " + raiz);
        //funcion para calcular la potencia de un numero
        System.out.println("Calculo de la potencia de un numero : ");
        double exp = 2;
        double potencia = Math.pow(numero, exp);
        System.out.println("Resultado del numero elevado al cuadrado es: " + potencia);

        int a=1;
        int b=1;
        double c=1;
        c = Math.sqrt(Math.pow(a,2)+ Math.pow (b,2));
        System.out.println("El valor de la hipotenusa es: "+ c);
    }
}
