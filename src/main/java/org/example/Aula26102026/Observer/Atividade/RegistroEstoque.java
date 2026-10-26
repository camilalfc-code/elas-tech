package org.example.Aula26102026.Observer.Atividade;

public class RegistroEstoque implements ObservadorEstoque {

    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}
