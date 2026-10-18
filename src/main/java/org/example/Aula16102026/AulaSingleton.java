package org.example.Aula16102026;

public class AulaSingleton {

    static void main(String[] args) {

    }

    Teste teste = new Teste();

    TesteSingleton testes = TesteSingleton.getInstancia();




    //a classe garante que existe só UMA instância dela no programa
    // inteiro, e todo mundo que precisar dela usa essa mesma.

    //Acoplamento é o quanto uma classe depende de outra.
    // Quanto mais uma classe precisa conhecer os detalhes de outra
    // pra funcionar, mais acoplada ela é.
    //
    //Alto acoplamento (ruim): se você mexe numa classe, quebra um
    // monte de outras. Dá pra imaginar a dor de cabeça na hora de
    // testar.
    //
    //Baixo acoplamento (bom): as classes conversam por “contratos”
    // (interfaces, métodos públicos) e não sabem como a outra faz
    // as coisas por dentro. Dá pra trocar uma peça sem quebrar o
    // resto.
    //
    //Tem uma conexão direta com o Singleton: ele costuma aumentar
    // o acoplamento.

    //Isso conversa com o D do SOLID
    //(Inversão de Dependência): depender de abstrações em vez de
    // classes concretas é justamente um jeito de reduzir acoplamento.

}
