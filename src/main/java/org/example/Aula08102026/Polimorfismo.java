package org.example.Aula08102026;

import java.util.ArrayList;

public class Polimorfismo {
    static void main() {

        /* Aula
        Polimorfismo (do grego, “muitas formas”) é quando o mesmo comando dá resultados diferentes,
        dependendo de qual objeto o recebe
        E no main, a variável é do tipo da mãe, e o objeto é da filha,
        polimorfismo deixa você tratar vários tipos de objeto do mesmo jeito, cada um respondendo do seu.

        ArrayList<Funcionario> equipe = new ArrayList<>();
        Funcionario recepcionista = new Funcionario();
        recepcionista.nome = "Carlos";
        Medico medico = new Medico();
        medico.nome = "Marina";
        Cardiologista cardio = new Cardiologista();
        cardio.nome = "Helena";
        equipe.add(recepcionista);
        equipe.add(medico);
        equipe.add(cardio);
        for (Funcionario f : equipe) {
                f.trabalhar();
        }
        */

        /*
        Atividade Polimorfismo

        1. (mesma classe — muda a QUANTIDADE de parâmetros)
           Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
           - recebe um double (lado do quadrado)  -> lado * lado
           - recebe dois double (base e altura)   -> base * altura
           - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
           Chame os três na Main e imprima os resultados.

        2. (mesma classe — muda o TIPO do parâmetro)
           Crie a classe Painel com QUATRO métodos chamados exibir, cada um
           recebendo um tipo diferente: String, int, boolean e double.
           Cada um imprime de um jeito, dizendo que tipo recebeu.
           Chame os quatro.
           Depois pense: por que o System.out.println() aceita texto, número,
           boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que vocês acabaram de fazer.

        3. Crie a classe Professora, também filha de Pessoa, com o atributo
           disciplina e o método lancarNota(String aluna, double nota), que
           imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
           com %.1f.
           Na Main, crie uma aluna e uma professora e dê valor aos atributos
           de cada objeto:
           Professora flora = new Professora();
           flora.nome = "Flora";
           flora.idade = 30;
           flora.disciplina = "Java e IA";
           Faça o mesmo com a aluna e chame os métodos das duas.

        4. (herança — quem não sobrescreve)
           Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
           o apresentar() e não acrescenta nada.
           Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
           variável do tipo da mãe e chame o método apresentar().
           O que saiu? Por quê?

        5. (herança — método que recebe a mãe)
           Crie um método na sua classe Main:
           static void mostrarFicha(Pessoa p) {
               p.apresentar();
           }
           Chame ele três vezes, passando a aluna, a professora e a estagiária.
           O método não sabe quem vai receber, e funciona pros três.

        6. (interface)
           Crie a interface MeioDePagamento com pagar(double valor).
           Crie Pix e Boleto implementando ela, cada uma imprimindo uma
           mensagem diferente com printf e %.2f.
           Declare UMA variável do tipo da interface:
           MeioDePagamento forma;
           forma = new Pix();     forma.pagar(150.00);
           forma = new Boleto();  forma.pagar(150.00);

        7. (a armadilha)
           Na Professora, troque o apresentar() sobrescrito por este,
           com um parâmetro a mais e SEM o @Override:
           void apresentar(String cargo) {
               System.out.println("Oi, sou " + nome + ", " + cargo);
           }
           Rode o exercício 3 de novo. O que a professora imprime agora?
           Deu algum erro?
           Depois coloque o @Override nesse método e veja o que o Java diz.
           Essa questão mostra por que o @Override existe.
         */


            //1. (mesma classe — muda a QUANTIDADE de parâmetros)
            //Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
            //recebe um double (lado do quadrado)  -> lado * lado
            //recebe dois double (base e altura)   -> base * altura
            //recebe um int (raio do círculo)      -> 3.14159 * raio * raio
            //Chame os três na Main e imprima os resultados.
            Calculadora calculadora = new Calculadora();
                System.out.println("Área do quadrado: "
                    + calculadora.calcularArea(5.0));
                System.out.println("Área do retângulo: "
                    + calculadora.calcularArea(4.0, 6.0));
                System.out.println("Área do círculo: "
                    + calculadora.calcularArea(3));
                System.out.println();


            //2. (mesma classe — muda o TIPO do parâmetro)
            //Crie a classe Painel com QUATRO métodos chamados exibir, cada um
            //recebendo um tipo diferente: String, int, boolean e double.
            //Cada um imprime de um jeito, dizendo que tipo recebeu.
            //Chame os quatro.
            //Depois pense: por que o System.out.println() aceita texto, número,
            //boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que
            //vocês acabaram de fazer
            Painel painel = new Painel();
            painel.exibir("Olá");
            painel.exibir(10);
            painel.exibir(true);
            painel.exibir(8.5);
            System.out.println();
            //O System.out.println() aceita vários tipos porque a classe Java possui várias versões do método println,
            // todas com o mesmo nome, mas com parâmetros diferentes.
            //O Java identifica o tipo do valor e escolhe automaticamente a versão adequada de println().
            //O println() aceita texto, números, booleanos e objetos porque possui várias versões sobrecarregadas
            // do mesmo método. Cada versão recebe um tipo diferente de parâmetro.
            // Isso é sobrecarga de métodos, exatamente como os três métodos calcularArea().


            //3. Crie a classe Professora, também filha de Pessoa, com o atributo
            //disciplina e o método lancarNota(String aluna, double nota), que
            //imprime algo como "Flora lançou nota 9.5 para Ana". Use printf com %.1f.
            //Na Main, crie uma aluna e uma professora e dê valor aos atributos de cada objeto:
            //Professora flora = new Professora();
            //flora.nome = "Flora";
            //flora.idade = 30;
            //flora.disciplina = "Java e IA";
            //Faça o mesmo com a aluna e chame os métodos das duas.
            Aluna ana = new Aluna();
            ana.nome = "Ana";
            ana.idade = 20;
            ana.curso = "Java";
            Professora flora = new Professora();
            flora.nome = "Flora";
            flora.idade = 30;
            flora.disciplina = "Java e IA";
            ana.apresentar();
            ana.estudar();
            flora.apresentar();
            flora.lancarNota("Ana", 9.5);
            System.out.println();


            //4. (herança — quem não sobrescreve)
            //Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
            //o apresentar() e não acrescenta nada.
            //Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
            //variável do tipo da mãe e chame o método apresentar().
            //O que saiu? Por quê?
            Pessoa estagiaria = new Estagiaria();
            estagiaria.nome = "Bia";
            estagiaria.idade = 19;
            estagiaria.apresentar();
            System.out.println();
            //Isso acontece porque Estagiaria não criou sua própria versão de apresentar().
            // Portanto, ela usa o método herdado de Pessoa.


            // 5. (herança — método que recebe a mãe)
            //Crie um método na sua classe Main:
            //static void mostrarFicha(Pessoa p) {
            //p.apresentar();
            //}
            //Chame ele três vezes, passando a aluna, a professora e a estagiária.
            // O método não sabe quem vai receber, e funciona pros três.
            estagiaria.nome = "Bia";
            estagiaria.idade = 20;
            mostrarFicha(ana);
            mostrarFicha(flora);
            mostrarFicha(estagiaria);
            System.out.println();


            //6. (interface)
            //Crie a interface MeioDePagamento com pagar(double valor).
            //Crie Pix e Boleto implementando ela, cada uma imprimindo uma
            //mensagem diferente com printf e %.2f.
            //Declare UMA variável do tipo da interface:
            //MeioDePagamento forma;
            //forma = new Pix();     forma.pagar(150.00);
            //forma = new Boleto();  forma.pagar(150.00);
            MeioDePagamento forma;
            forma = new Pix();
            forma.pagar(150.00);
            forma = new Boleto();
            forma.pagar(150.00);
            //Você criou uma variável chamada forma, cujo tipo é a interface MeioDePagamento.
            //Depois ela recebe um objeto Pix
            //Depois recebe um objeto Boleto
            //A variável é a mesma, mas o objeto muda

            //7. (a armadilha)
            //Na Professora, troque o apresentar() sobrescrito por este,
            //com um parâmetro a mais e SEM o @Override:
            //void apresentar(String cargo) {
            //System.out.println("Oi, sou " + nome + ", " + cargo);
            //}
            //Rode o exercício 3 de novo. O que a professora imprime agora?
            //Deu algum erro?
            //Depois coloque o @Override nesse método e veja o que o Java diz.
            //Essa questão mostra por que o @Override existe.

            //A saída será: Oi, sou Flora e tenho 30 anos.
            //Não será:Oi, sou Flora e ensino Java e IA.
            //Por que não dá erro sem @Override?
            //Porque este método é válido
            //Ele é um novo método, diferente do método da classe mãe
            //Os métodos têm assinaturas diferentes
            //Isso é sobrecarga, não sobrescrita.
            //O @Override serve para avisar ao Java: “estou tentando substituir um método da classe mãe;
            // confirme se escrevi a assinatura corretamente.”


}

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

}
