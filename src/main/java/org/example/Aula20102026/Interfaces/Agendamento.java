package org.example.Aula20102026.Interfaces;

import lombok.Builder;

@Builder
public class Agendamento {

    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    @Builder.Default
    private String observacao = "";
    private double desconto;

    public void mostrar() {
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println();
    }

}
//new Agendamento
// ("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 10.0);
//não dá pra saber, os valores ficam “sem rótulo”.

//Pergunta 2: se você trocar a ordem do perfume e do laço sem querer
// no construtor gigante, o código compila? E alguém perceberia o
// erro?
//acho que compila mas nao sei se alguem perceberia acho que nao

//Pergunta 3: no agendamento da Luna, usando o construtor gigante,
// quantos valores você digitou só pra dizer “não quero isso”?
//5
