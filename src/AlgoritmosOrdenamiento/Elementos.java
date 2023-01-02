package AlgoritmosOrdenamiento;

public class Elementos {
    public static void main(String[] args) throws InterruptedException{
        int arreglo[]=new int[100000];
        int indiceelem=0;
        for (int indice = 100000; indice > 0; indice--) {
            arreglo[indiceelem]=indice;
            indiceelem++;
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
    }
}
