package utilidades;

import java.util.Random;

public class CreadorDeNotas {
    public static int[][] crear(int numAlumnos, int numModulos) {
        int[][] notas = new int[numAlumnos][numModulos];
        Random random = new Random();

        for (int alumno = 0; alumno < numAlumnos; alumno++) {
            for (int modulo = 0; modulo < numModulos; modulo++) {
                notas[alumno][modulo] = random.nextInt(11);
            }
        }

        return notas;
    }
}
