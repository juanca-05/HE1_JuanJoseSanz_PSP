import runnable.TestRunnable;
import secuencial.TestSecuencial;
import thread.TestThread;
import utilidades.CreadorDeNotas;
import pool.TestPool;

public class Main {

    private static final int NUM_ALUMNOS = 10;
    private static final int NUM_MODULOS = 5;

    public static void main(String[] args) {
        int[][] cursoAnterior = CreadorDeNotas.crear(NUM_ALUMNOS, NUM_MODULOS);
        int[][] cursoActual = CreadorDeNotas.crear(NUM_ALUMNOS, NUM_MODULOS);

        int sumaCorrecta = TestSecuencial.test(cursoAnterior, cursoActual);

        int sumaThread = TestThread.test(cursoAnterior, cursoActual);
        comprobar(sumaThread, sumaCorrecta);

        int sumaRunnable = TestRunnable.test(cursoAnterior, cursoActual);
        comprobar(sumaRunnable, sumaCorrecta);

        int sumaPool = TestPool.test(cursoAnterior, cursoActual);
        comprobar(sumaPool, sumaCorrecta);
    }

    private static void comprobar(int suma, int sumaCorrecta) {
        if (suma == sumaCorrecta) {
            System.out.println("   [OK] Correcto");
        } else {
            System.out.println("   [ERROR] No coincide con la versión secuencial");
        }
    }
}