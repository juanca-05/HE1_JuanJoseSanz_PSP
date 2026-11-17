package utilidades;

public class SumadorDeNotas {
    public static int sumar(int[][] notas){
        int suma = 0;
        for (int alumno=0;alumno<notas.length;alumno++){
            for (int modulo = 0;modulo<notas[alumno].length;modulo++){
                suma+=notas[alumno][modulo];
            }
        }
        return suma;
    }
}
