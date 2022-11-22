package estructura_for;

import java.util.Scanner;

public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int fila = sc.nextInt();
        //System.out.println("Ingrese el numero de columnas");
        //int columna= sc.nextInt();
        for(int filas = 1; filas <= fila; filas++){
            String fila_asteriscos= "";
            for (int cont = 1; cont<=filas; cont++){
                fila_asteriscos= fila_asteriscos + "*";
            }
        }
    }
}
