package estructura_for;

import java.util.Scanner;

public class DivisorNumeroFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = sc.nextInt();
        for (int contador = 1; contador <= num; contador++){
            if (num%contador==0)
                System.out.println("Los divisores del numero son = " + contador);
        }

    }
}
