package AlgoritmosOrdenamiento;


public class ShellSort {
    public static void main(String[] args) throws InterruptedException {
        int arreglo[]=new int[100000];
        int indiceelem=0;
        for (int indice = 100000; indice > 0; indice--) {
            arreglo[indiceelem]=indice;
            indiceelem++;
        }
        long inicio= System.currentTimeMillis();
        Thread.sleep(2000);
        for (int salto = arreglo.length / 2; salto != 0; salto /= 2) {
            boolean cambios = true;
            while (cambios) {
                cambios = false;
                for (int indice = salto; indice < arreglo.length; indice++)
                {
                    if (arreglo[indice - salto] > arreglo[indice]) {
                        int aux = arreglo[indice];
                        arreglo[indice] = arreglo[indice - salto];
                        arreglo[indice - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin = System.currentTimeMillis();
        double tiempo= (double) ((fin-inicio));
        System.out.println(tiempo+" segundos");
    }
}
