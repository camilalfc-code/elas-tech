package org.example.Aula26102026.Observer;

public class Main {
    public static void main(String[] args) {
        // Criamos o sujeito (Observable)
        Canal canal = new Canal();

        // Criamos os observadores (Observers)
        Seguidor joao = new Seguidor("João");
        Seguidor maria = new Seguidor("Maria");

        // COLOCANDO OS OBJETOS DENTRO DA LISTA DO CANAL
        canal.inscricao(joao);
        canal.inscricao(maria);

        // Quando o canal faz uma ação, o código roda o 'for' interno e avisa
        canal.postarVideo("Video novo.");
    }
}
