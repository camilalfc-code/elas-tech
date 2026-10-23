package org.example.Aula22102026.decorator;

public class CafeSimples implements Cafe{

    @Override
    public String getDescricao() {

        return "Café Simples";
    }


    @Override
    public double getPreco() {

        return 5.0;
    }


}
