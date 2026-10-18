package org.example.Aula16102026;

public class ContadorVisitas {

    private static ContadorVisitas instancia;
    private int total = 0;

    private ContadorVisitas(){

    }

    public static ContadorVisitas getInstancia(){
        if (instancia == null){
            instancia = new ContadorVisitas();
        }
        return instancia;
    }


    public void registrarVisita() {
        total++;
    }

    public int getTotal() {
        return total;
    }

}
