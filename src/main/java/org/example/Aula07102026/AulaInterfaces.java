package org.example.Aula07102026;

import java.util.ArrayList;

public class AulaInterfaces {
    static void main() {

         /*
        Interfaces
        Em Java, uma interface é como um contrato: ela define quais métodos uma classe deve ter,
        mas geralmente não define como esses métodos serão executados.
        A interface garante que todas as formas de pagamento tenham o método pagar, mesmo que cada uma funcione de
        maneira diferente.
        Resumindo: interface é um contrato que define o que uma classe deve fazer; a classe define como fazer.
        Uma interface é um contrato: ela diz o que uma classe precisa saber fazer, mas não diz como.
        Cada classe que “assina” o contrato (com implements) é obrigada a escrever o método do jeito dela.
         */

        /* Aula
        Coelho pernalonga = new Coelho();
        pernalonga.fugir();
        //Criar um objeto do tipo Coelho;
        //Guardá-lo na variável pernalonga;
        //Chamar o método fugir().
        Presa coelhinho = new Coelho();
        //Aqui, coelhinho é uma variável do tipo interface Presa, mas o objeto criado é um Coelho.

        Pombo rolinha = new Pombo();
        rolinha.fugir();

        //O coelho e o pombo fogem de maneiras diferentes, mas os dois cumprem o mesmo contrato
        //Mesmo usando o tipo Presa, cada objeto executa sua própria versão de fugir():
        //O coelho está fugindo
        //O pombo está voando para fugir
        */


        /*
        Atividade Interfaces
        1. Crie uma interface Animal com o método emitirSom().
           Crie a classe Cachorro que implementa ela e imprime "Au au!".
           Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
        2. Agora acrescente a classe Gato, que implementa a mesma interface e
           imprime "Miau!". Na main, declare as duas variáveis como Animal:
           Animal bidu = new Cachorro();
           Animal salem= new Gato();
           Chame emitirSom() nas duas.
        3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
           e percorra com for-each chamando emitirSom(). Repare que não
           tem nenhum if. Dica:
           animais.add(new Cachorro());
           4. Crie uma interface Notificacao com o método enviar(String mensagem).
           Crie duas classes que implementam ela: Email e SMS. Cada uma
           imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
           e percorra com for-each, enviando a mesma mensagem.
           Saída esperada:
           E-mail enviado: Sua compra foi aprovada!
           SMS enviado: Sua compra foi aprovada!
        5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
           Crie Carro e Moto implementando os dois. Coloque numa lista e
           percorra com for-each chamando os dois métodos em cada um.
         */


            // 1. Crie uma interface Animal com o método emitirSom().
            // Crie a classe Cachorro que implementa ela e imprime "Au au!".
            // Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
            Cachorro cachorro = new Cachorro();
            cachorro.emitirSom();
            System.out.println();

            //2. Agora acrescente a classe Gato, que implementa a mesma interface e
            // imprime "Miau!". Na main, declare as duas variáveis como Animal:
            // Animal bidu = new Cachorro();
            // Animal salem= new Gato();
            // Chame emitirSom() nas duas.
            Animal bidu = new Cachorro();
            Animal salem = new Gato();
            bidu.emitirSom();
            salem.emitirSom();
            System.out.println();


            //3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
            //e percorra com for-each chamando emitirSom(). Repare que não
            //tem nenhum if. Dica:
            //animais.add(new Cachorro());
            ArrayList<Animal> animais = new ArrayList<>();
            //ArrayList<Animal> é uma lista de animais, o tipo da interface, e não de Cachorro ou Gato.
            // Por isso cabem os dois dentro dela.
            animais.add(new Cachorro());
            animais.add(new Gato());
            for (Animal animal : animais) {
                animal.emitirSom();
                //O for-each lê assim: “para cada animal (um Animal) dentro de animais, chama o emitirSom()”.
                //epara que não tem nenhum if perguntando “é cachorro ou é gato?”.
                // O Java olha qual objeto está dentro de cada posição e chama o método dele.
            }
            System.out.println();

            //4. Crie uma interface Notificacao com o método enviar(String mensagem).
            //Crie duas classes que implementam ela: Email e SMS. Cada uma
            //imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
            //e percorra com for-each, enviando a mesma mensagem.
            //Saída esperada:
            //E-mail enviado: Sua compra foi aprovada!
            //SMS enviado: Sua compra foi aprovada!
            ArrayList<Notificacao> notificacoes = new ArrayList<>();
            //A lista é ArrayList<Notificacao>, então cabem os dois tipos.
            // A mesma mensagem é entregue a todos no for-each.
            notificacoes.add(new Email());
            notificacoes.add(new SMS());
            String mensagem = "Sua compra foi aprovada!";
            for (Notificacao notificacao : notificacoes) {
                notificacao.enviar(mensagem);
            }
            //Email e SMS escrevem o enviar cada um do seu jeito, com o prefixo diferente
            // (E-mail enviado: e SMS enviado:).
            System.out.println();


            // 5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
            //Crie Carro e Moto implementando os dois. Coloque numa lista e
            //percorra com for-each chamando os dois métodos em cada um.
            ArrayList<Veiculo> veiculos = new ArrayList<>();
            veiculos.add(new Carro());
            veiculos.add(new Moto());
            for (Veiculo veiculo : veiculos) {
                veiculo.ligar();
                veiculo.acelerar();
            }

    }
}
