package org.example.Aula20102026.Interfaces;

public interface BancoDeDados {
    //são as regras
    //public void proibidoBarulhoAposDezHoras(){
    //};
    //public BancoDeDados identificarBanco(){
    //}

    String chamarBanco();
    int getNumero();

    /*
    a interface BancoDeDados
    Ela é um contrato: diz o que toda classe de banco precisa saber
    fazer, mas não como. Aqui são dois métodos:
    chamarBanco() devolve uma mensagem (String)
    getNumero() devolve um número (int)
    Repara que eles não têm corpo (nada de { }), só a assinatura.
    Quem implementa a interface é que preenche.
    */
}
