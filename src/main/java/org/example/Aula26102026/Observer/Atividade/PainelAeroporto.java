package org.example.Aula26102026.Observer.Atividade;

public class PainelAeroporto implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }
}
