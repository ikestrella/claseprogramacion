package EjerciciosBimestrales;

import java.util.Scanner;

public class EjercicioFinal2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int serie= sc.nextInt();
        int num1 = 0, num2 = 1, suma = 1;
        String a="", b="*", c="*";
        for (int contador = 1; contador <= serie; contador++) {
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
        }
        for (int i = 1; i < serie; i++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}

