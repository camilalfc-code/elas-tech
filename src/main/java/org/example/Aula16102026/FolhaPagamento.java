package org.example.Aula16102026;

public class FolhaPagamento {
    //Etapa 5. Crie uma classe FolhaPagamento

    private Notificador notificador;
    //que recebe um Notificador pelo construtor

    public FolhaPagamento(Notificador notificador) {
        this.notificador = notificador;
    }
    //Repara que ela recebe a interface Notificador,
    // e não o NotificadorEmail ou o NotificadorSms direto.
    // Lembra do Notificador amarrado ao EmailService no D do SOLID,
    // e da correção em que a classe passou a receber o contrato de fora?
    // É exatamente isso.

    public void pagar(Funcionario f) {
        double salario = f.calcularSalario();
        notificador.notificar("Olá, " + f.getNome() + "! Seu salário de R$ " + salario + " foi pago.");
    }
    // e tem um metodo pagar(Funcionario f),
    // que calcula o salário e usa o notificador para avisar o funcionário.
    //O parâmetro é do tipo Funcionario, a classe abstrata. Então o pagar()
    //aceita tanto um Desenvolvedor quanto um Gerente,
    // e o f.calcularSalario() roda o cálculo certo de cada um,
    // sem você precisar de nenhum if.
    //O pagar() não sabe se a notificação vai por e-mail ou SMS,
    // ele só pede pro notificador avisar.
}
