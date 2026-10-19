package org.example.Aula16102026;

public class Exercicio7 {

    static void main(String[] args) {
        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
        System.out.println();

    }


    /*
7. Crie uma classe Singleton chamada Carrinho que:
    -tenha um atributo quantidadeItens, começando em 0;
    -tenha um método adicionarItem() que soma 1 à quantidade;
    -tenha um método getQuantidadeItens() que devolve a quantidade.
    No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes,
    adicione itens usando as duas, e imprima a quantidade final.
    O resultado deve mostrar que as duas telas usam o mesmo carrinho.
    Exemplo de saída esperada:
    Itens no carrinho: 4

 */
}
