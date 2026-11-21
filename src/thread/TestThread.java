package thread;

public class TestThread {
    public static int test(int[][] cursoAnterior, int[][] cursoActual) {
        long inicio = System.nanoTime();

        HiloSuma hiloAnterior = new HiloSuma(cursoAnterior);
        HiloSuma hiloActual = new HiloSuma(cursoActual);

        hiloAnterior.start();
        hiloActual.start();

        try {
            hiloAnterior.join();
            hiloActual.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sumaTotal = hiloAnterior.getResultadoSuma() + hiloActual.getResultadoSuma();

        long fin = System.nanoTime();
        System.out.println("Thread     -> suma = " + sumaTotal + " | tiempo = " + (fin - inicio) + " ns");

        return sumaTotal;

    }
}
