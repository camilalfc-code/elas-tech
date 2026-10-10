package org.example.Aula08102026;

public class AulaHeranca {
    static void main() {

    /*
    Herança é quando uma classe aproveita tudo (atributos e métodos) de outra classe,
    em vez de escrever de novo,
    Em Java, usa-se a palavra extends (“estende”).

    //No main, um Medico consegue usar os dois: medico.trabalhar() (herdado) e medico.atender() (dele).

        public static void main(String[] args) {
            Funcionario funcionario = new Funcionario();
            funcionario.nome = "Carlos";
            funcionario.salario = 2500.00;
            funcionario.trabalhar();
            System.out.println();

            Medico medico = new Medico();
            medico.nome = "Marina";
            medico.salario = 12000.00;
            medico.especialidade = "Cardiologia";
            medico.trabalhar();
            medico.atender();
            System.out.println();

            Cardiologista cardio = new Cardiologista();
            cardio.nome = "Marina";
            cardio.trabalhar();         // herdado do Funcionario
            cardio.atender();           // herdado do Medico
            cardio.examinarCoracao();   // só do Cardiologista

            //O Cardiologista herda do Medico,
            // que herda do Funcionario.
            // Então o cardiologista é um médico,
            // e o médico é um funcionário.
            // A frase do “é um” continua fazendo sentido nos dois degraus.
            */

            /*
            Atividade Herança

            1. Crie a classe Pessoa com os atributos nome e idade, e o método
               apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
               Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
               Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
               Repare: você não escreveu nome, idade nem apresentar() na Aluna,
               e os três funcionaram.

            2. Acrescente na Aluna o atributo curso e o método estudar(), que
               imprime "[nome] está estudando [curso]."
               Preencha os três atributos no objeto e chame os dois métodos.
               Repare que o estudar() usa o nome, que veio da mãe.

            3. Crie a classe Professora, também filha de Pessoa, com o atributo
               disciplina e o método lancarNota(String aluna, double nota), que
               imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
               com %.1f.
                  Na Main, crie uma aluna e uma professora, preencha os atributos de
               cada objeto e chame os métodos das duas.

            4. Na Professora, sobrescreva o apresentar() usando @Override, pra
               imprimir "Oi, sou [nome] e ensino [disciplina]."
               Chame apresentar() na aluna e na professora e compare as saídas.

            5. Faça uma cadeia de três níveis:
               - Funcionario, com o atributo nome e o método baterPonto()
               - Gerente extends Funcionario, com aprovarFerias(String quem)
               - Diretora extends Gerente, com definirMeta(String meta)
               Na Main, crie uma Diretora, preencha o nome dela
               (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
               Herança em cadeia: ela tem tudo que vem de cima.

            6. Crie duas interfaces:
               - Notificavel, com notificar(String mensagem)
               - Exportavel, com exportar()
               Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
               extends Funcionario:
               class Gerente extends Funcionario implements Notificavel, Exportavel
                Na Main, crie um gerente, preencha o nome e chame os quatro
               métodos nele: baterPonto(), aprovarFerias(), notificar()
               e exportar().
               UMA herança (extends), VÁRIAS interfaces (implements).
               Depois tente colocar uma segunda classe no extends:
               extends Funcionario, Pessoa
               Veja o que o Java responde.
                 */

        //1. Crie a classe Pessoa com os atributos nome e idade, e o método
        //   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
        //   Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
        //   Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
        //   Repare: você não escreveu nome, idade nem apresentar() na Aluna,
        //   e os três funcionaram.
        Aluna aluna = new Aluna();
        aluna.nome = "Camila";
        aluna.idade = 30;
        aluna.apresentar();
            System.out.println();
        //No main, o objeto é uma Aluna, e ela usa nome, idade e apresentar()
        // sem a classe ter escrito nenhum deles.


        //2. Acrescente na Aluna o atributo curso e o método estudar(), que
        //   imprime "[nome] está estudando [curso]."
        //   Preencha os três atributos no objeto e chame os dois métodos.
        //   Repare que o estudar() usa o nome, que veio da mãe.
        aluna.curso = "Java";
        aluna.apresentar();
        aluna.estudar();
        System.out.println();


        //3. Crie a classe Professora, também filha de Pessoa, com o atributo
        // disciplina e o método lancarNota(String aluna, double nota), que
        // imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
        // com %.1f.
        // Na Main, crie uma aluna e uma professora, preencha os atributos de
        // cada objeto e chame os métodos das duas.
        Professora professora = new Professora();
        //A Professora também é filha de Pessoa, então herda nome, idade e apresentar().
        // Ela acrescenta só o que é dela: disciplina e lancarNota().
        //aluna criada no exercicio1
        professora.nome = "Flora";
        professora.idade = 40;
        professora.disciplina = "Java";
        professora.lancarNota(aluna.nome, 9.5);
        //O lancarNota recebe dois parâmetros: o nome da aluna (String) e a nota (double).
        aluna.estudar();
        System.out.println();


        //4. Na Professora, sobrescreva o apresentar() usando @Override, pra
        //imprimir "Oi, sou [nome] e ensino [disciplina]."
        //Chame apresentar() na aluna e na professora e compare as saídas.
        aluna.nome = "Ana";
        aluna.idade = 20;
        aluna.curso = "Java";
        professora.nome = "Flora";
        professora.idade = 35;
        professora.disciplina = "Programação";
        aluna.apresentar();
        aluna.estudar();
        professora.apresentar();
        professora.lancarNota("Ana", 9.5);
        System.out.println();


        //5. Faça uma cadeia de três níveis:
        //Funcionario, com o atributo nome e o método baterPonto()
        //Gerente extends Funcionario, com aprovarFerias(String quem)
        //Diretora extends Gerente, com definirMeta(String meta)
        //Na Main, crie uma Diretora, preencha o nome dela
        //(carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
        //Herança em cadeia: ela tem tudo que vem de cima.
        Diretora carla = new Diretora();
        carla.nome = "Carla";
        carla.baterPonto();
        carla.aprovarFerias("Ana");
        carla.definirMeta("Aumentar as vendas em 20%");
        System.out.println();
        //Cada classe acrescenta uma capacidade, e a classe mais abaixo na cadeia recebe todas as capacidades anteriores.


        // 6. Crie duas interfaces:
        // Notificavel, com notificar(String mensagem)
        // Exportavel, com exportar()
        // Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
        // extends Funcionario:
        // class Gerente extends Funcionario implements Notificavel, Exportavel
        // Na Main, crie um gerente, preencha o nome e chame os quatro
        // métodos nele: baterPonto(), aprovarFerias(), notificar()e exportar().
        // UMA herança (extends), VÁRIAS interfaces (implements).
        // Depois tente colocar uma segunda classe no extends:
        // extends Funcionario, Pessoa
        // Veja o que o Java responde.
        Gerente gerente = new Gerente();
        gerente.nome = "Carlos";
        gerente.baterPonto();
        gerente.aprovarFerias("Ana");
        gerente.notificar("Reunião às 14 horas.");
        gerente.exportar();
        System.out.println();
        //Se você tentar:
        //public class Gerente extends Funcionario, Pessoa implements Notificavel, Exportavel {}
        //vai dar erro, porque uma classe Java não pode herdar de duas classes.
        //A regra é:
        //Uma classe pode estender uma única classe.
        //Uma classe pode implementar várias interfaces.

   }

}

