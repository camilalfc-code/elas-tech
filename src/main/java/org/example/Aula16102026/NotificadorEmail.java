package org.example.Aula16102026;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }

    //O implements Notificador é a classe assinando o contrato,
    // e por isso ela é obrigada a escrever o notificar().
    // O jeito dela é imprimir com [EMAIL] na frente.

    // Crie duas implementações: NotificadorEmail e NotificadorSms,
    // cada uma imprimindo a mensagem de um jeito diferente.
}
