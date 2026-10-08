package org.example.Aula07102026;

public class SMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}