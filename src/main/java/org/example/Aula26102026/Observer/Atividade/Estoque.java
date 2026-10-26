package org.example.Aula26102026.Observer.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque o) {
        observadores.add(o);
    }

    public void setQuantidade(int quantidade) {
        for (ObservadorEstoque o : observadores) {
            o.atualizar(quantidade);
        }
    }
}
