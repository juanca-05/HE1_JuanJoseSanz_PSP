import secuencial.*;
import utilidades.*;
public class Main {
    private static final int NUM_ALUMNOS = 10;
    private static final int NUM_MODULOS = 5;

    public static void main(String[] args) {
        int[][] cursoAnterior = CreadorDeNotas.crear(NUM_ALUMNOS,NUM_MODULOS);
        int[][] cursoActual = CreadorDeNotas.crear(NUM_ALUMNOS,NUM_MODULOS);

        int sumaCorrecta = TestSecuencial.test(cursoAnterior,cursoActual);
    }
}