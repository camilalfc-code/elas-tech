package org.example.Aula21102026.facade;

public class Main {

    public static void main(String[] args) {

        ManhaFacade manha = new ManhaFacade();
        manha.acordar();

        System.out.println();
    }
}

/*
Facade
Questão 7.
Explique com suas palavras qual problema o Facade resolve.
Se quiser, use o exemplo do síndico do condomínio ou crie outro.
O Facade resolve o problema de um processo ter várias etapas
que precisam ser chamadas na ordem certa.
Sem ele, o main precisa conhecer todas elas.
Com a fachada, o main chama um metodo só, e ela cuida de
todas as etapas por trás, como um síndico de condomínio.


Questão 8. Marque V (verdadeiro) ou F (falso):
• ( F ) A fachada precisa implementar uma interface.
• ( V ) A fachada guarda as classes envolvidas no processo em
atributos.
• ( F ) Depois que a fachada existe, é proibido usar as outras
classes diretamente.


Questão 9 (prática).
Você já tem estas três classes:
public class Despertador {
    public void desligar() {
        System.out.println("Despertador desligado.");
    }
}
public class Cafeteira {
    public void fazerCafe() {
        System.out.println("Café pronto.");
    }
}
public class Chuveiro {
    public void ligar() {
        System.out.println("Chuveiro ligado.");
    }
}
Crie a classe ManhaFacade com um metodo acordar() que desligue o
despertador, faça o café e ligue o chuveiro, nessa ordem.
No main, use só a fachada: crie um objeto ManhaFacade e chame
acordar().
 */

//public class Main {
    //public static void main(String[] args) {
        //SEM FACADE
        //Estoque estoque = new Estoque();
        //Cobranca cobranca = new Cobranca();
        //NotaFiscal notaFiscal = new NotaFiscal();
       // Entrega entrega = new Entrega();
        //estoque.darBaixa();
        //cobranca.cobrar();
        //notaFiscal.emitir();
        //entrega.agendar();
        // DEPOIS DO FACADE
        //CompraFacade compra = new CompraFacade();
       // compra.finalizarCompra();
    //}
//}





