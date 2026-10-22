package org.example.Aula19102026;

public class Main {
    public static void main(String[] args) {
        Brinquedos b1 = new Brinquedos("Hotwheels");
        Brinquedos b2 = new Brinquedos("Barbie");
        System.out.println(b1.verBrinquedo(b1));
        System.out.println(b2.verBrinquedo(b2));
        System.out.println();


        Bebe b3 = new Bebe("Sofia", "10/03/2025");
        Bebe b4 = new Bebe("Miguel", "22/07/2025");
        System.out.println(b3.nome);
        System.out.println(b3.dataNascimento);
        System.out.println(b4.nome);
        System.out.println(b4.dataNascimento);


    }

}

//Construtor é um metodo especial que roda automaticamente quando você usa
// o new. A função dele é deixar o objeto já “pronto”, com os valores
// iniciais preenchidos.