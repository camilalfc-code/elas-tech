package org.example.Aula16102026;

public class NotificadorSms implements Notificador{
    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}
