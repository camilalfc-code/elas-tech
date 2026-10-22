package org.example.Aula21102026.adapter;

public class Main {

    public static void main(String[] args) {

        // Pagamento p = new PayPalAPI();
        // não compila: PayPalAPI não implementa Pagamento

        Pagamento pagamento = new PayPalAdapter(new PayPalAPI());
        pagamento.pagar();

        System.out.println();
    }
}

/*
Adapter
Questão 4. Seu sistema precisa usar uma classe de pagamento de
outra empresa, mas ela não implementa a sua interface.
Por que não dá para simplesmente escrever implements na classe dela?
O que você faz no lugar?
Não dá pra escrever implements na classe da outra empresa porque
o código é dela e eu não posso alterar
No lugar, eu crio uma classe nova, que implementa a minha interface
Pagamento e por dentro usa a classe da outra empresa,
traduzindo o pagar() para o metodo dela.


Questão 5.
Em um Adapter, onde fica a tradução (por exemplo, a conversão de
dólar para real)?
• a) Na classe de fora
• b) Na interface
• c) No metodo implementado da interface, dentro do adapter
A tradução fica no metodo implementado da interface,
dentro do adapter
• d) No main, antes de chamar o metodo


Questão 6 (prática).
O seu sistema usa esta interface:
public interface Pagamento {
    void pagar();
}
Você recebeu esta classe de outra empresa.
Ela não pode ser alterada:
public class PayPalAPI {
    public void sendPayment() {
        System.out.println("Pagamento enviado pelo PayPal.");
    }
}
Crie a classe PayPalAdapter, para que o sistema consiga usar
o PayPal como um Pagamento.
Não precisa fazer nenhuma conversão: o metodo pagar() só p
recisa chamar o metodo da classe de fora.
No main:
1. Escreva, como comentário, a linha que tentaria usar
PayPalAPI direto como Pagamento (a que não compila).
2. Crie uma variável do tipo Pagamento usando o adapter e
chame pagar().
 */

//public class Main {
    //static void main(String[] args) {
        //Produto blusa = new ProdutoNacional();
        //System.out.println(blusa.precoEmReais(25.99));
        //Produto blusaAmericana2 = new ProdutoInternacionalAdapter();
        //System.out.println(blusaAmericana2.precoEmReais(5));
    //}
//}
