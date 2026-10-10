package org.example.Aula08102026;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    public void aprovarFerias(String quem) {
        System.out.println(nome + " aprovou as férias de " + quem + ".");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(
                nome + " enviou a notificação: " + mensagem
        );
    }

    @Override
    public void exportar() {
        System.out.println(
                "Dados do gerente " + nome + " foram exportados."
        );
    }
}

//Gerente recebe:
//o atributo nome;
//o método baterPonto().
//Além disso, possui seu próprio método aprovarFerias().