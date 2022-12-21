package Borradores;

public class Borrador2 {
    public static void main(String[] args) {
        int vec[]={20,1,23,4,11};
        int n = vec.length;
        boolean cambio;
        for (int indice = 0; indice < n-1; indice++) {
            cambio=false;
            for (int indice2 = 0; indice2 < n-indice-1; indice2++) {
                if (vec[indice2]>vec[indice2+1]) {
                    int aux=vec[indice2];
                    vec[indice2]=vec[indice2+1];
                    vec[indice2+1]=aux;
                    cambio=true;
                }
            }
            if (!cambio) {
                break;
            }
        }
        for (int indice = 0; indice < n; indice++) {
            System.out.println(vec[indice]);
        }
    }
}
