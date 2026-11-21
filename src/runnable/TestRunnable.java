package runnable;


public class TestRunnable {
    public static int test(int[][] cursoAnterior, int[][] cursoActual) {
        long inicio = System.nanoTime();

        TareaSuma tareaAnterior = new TareaSuma(cursoAnterior);
        TareaSuma tareaActual = new TareaSuma(cursoActual);

        Thread hiloAnterior = new Thread(tareaAnterior);
        Thread hiloActual = new Thread(tareaActual);

        hiloAnterior.start();
        hiloActual.start();

        try {
            hiloAnterior.join();
            hiloActual.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sumaTotal = tareaAnterior.getResultadoSuma() + tareaActual.getResultadoSuma();

        long fin = System.nanoTime();
        System.out.println("Runnable   -> suma = " + sumaTotal + " | tiempo = " + (fin - inicio) + " ns");
        return sumaTotal;
    }
}
