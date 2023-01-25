package Borradores;

public class Borrador31 {
    public static void main(String[] args) {
        int matriz[][]= {{3,2,4},
                {5,-4,6}};
        int m1[][]=new int[2][3];
        int n1;
        int n2;
        n1=matriz[1][0];
        n2=matriz[0][0]*-1;
        for (int indice = 0; indice < matriz.length; indice++) {
            if (indice == 1) {
                n1=n2;
            }
            for (int indice2 = 0; indice2 < matriz[0].length; indice2++) {
                m1[indice][indice2]=matriz[indice][indice2]*n1;
            }
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
            }
        }
    }
}
