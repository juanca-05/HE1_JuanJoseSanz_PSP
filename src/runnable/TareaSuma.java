package runnable;

import utilidades.SumadorDeNotas;

public class TareaSuma implements Runnable{
    private int[][] notas;
    private int resultadoSuma;

    public TareaSuma(int[][] notas) {
        this.notas = notas;
    }

    @Override
    public void run(){
        resultadoSuma = SumadorDeNotas.sumar(notas);
    }

    public int getResultadoSuma() {
        return resultadoSuma;
    }
}
