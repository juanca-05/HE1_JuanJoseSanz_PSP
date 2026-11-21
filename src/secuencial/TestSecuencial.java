package secuencial;

import utilidades.*;

public class TestSecuencial {
    public static int test(int[][] cursoAnterior, int[][] cursoActual) {
        long inicio = System.nanoTime();

        int sumaAnterior = SumadorDeNotas.sumar(cursoAnterior);
        int sumaActual = SumadorDeNotas.sumar(cursoActual);
        int sumaTotal = sumaAnterior + sumaActual;

        long fin = System.nanoTime();

        System.out.println("Secuencial -> suma = " + sumaTotal + " | tiempo = " + (fin - inicio) + " ns");
        return sumaTotal;
    }
}

