package org.example.Aula23092026;

public class Concatenacao {
    static void main() {

    String nome = "Camila";
    String cep = "14800-000";
    String cidade = "Araraquara";
    String telefone = "(16) 99999-9999";
    String profissao = "Servidora pública";

    int idade = 38;
    int anoNascimento = 1988;

    double altura = 1.55;
    double peso = 64.0;
    double temperatura = 25.5;
    double nota = 9.0;

    boolean ehfumante = false;
    boolean temCarteiraMotorista = true;

    System.out.println("Seus dados são:");
    System.out.println(nome);
    System.out.println(cidade);
    System.out.println(profissao);
    System.out.println(cep);
    System.out.println(idade);
    System.out.println(anoNascimento);
    System.out.println(altura);
    System.out.println(peso);
    System.out.println(nota);
    System.out.println(temperatura);
    System.out.println(ehfumante);
    System.out.println(temCarteiraMotorista);

    System.out.println("Olá " + nome + " sua cidade é: " + cidade + ".");

    }
}