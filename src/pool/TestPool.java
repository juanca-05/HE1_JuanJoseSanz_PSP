package pool;

import runnable.*;

import java.util.concurrent.*;


public class TestPool {
    public static int test(int[][] cursoAnterior, int[][] cursoActual) {
        long inicio = System.nanoTime();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        TareaSuma tareaAnterior = new TareaSuma(cursoAnterior);
        TareaSuma tareaActual = new TareaSuma(cursoActual);

        Future<?> fAnterior = executor.submit(tareaAnterior);
        Future<?> fActual = executor.submit(tareaActual);

        try {
            fAnterior.get();
            fActual.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();

        int sumaTotal = tareaAnterior.getResultadoSuma() + tareaActual.getResultadoSuma();
        long fin = System.nanoTime();

        System.out.println("Pool       -> suma = " + sumaTotal + " | tiempo = " + (fin - inicio) + " ns");
        return sumaTotal;
    }
}
