package thread;

import utilidades.*;

public class HiloSuma extends Thread {
    private int[][] notas;
    private int resultadoSuma;

    public HiloSuma(int[][] notas) {
        this.notas = notas;
    }

    @Override
    public void run() {
        resultadoSuma = SumadorDeNotas.sumar(notas);
    }

    public int getResultadoSuma() {
        return resultadoSuma;
    }
}
