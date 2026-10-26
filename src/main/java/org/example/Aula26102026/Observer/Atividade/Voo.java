package org.example.Aula26102026.Observer.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Voo {

    private List<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        observadores.add(o);
    }

    public void mudarStatus(String status) {
        for (ObservadorVoo o : observadores) {
            o.atualizar(status);
        }
    }
}
