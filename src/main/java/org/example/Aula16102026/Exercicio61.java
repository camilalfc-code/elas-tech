package org.example.Aula16102026;

public class Exercicio61 {

    static void main() {

        Funcionario dev = new Desenvolvedor("Ana", 5000);
        Funcionario ger = new Gerente("Carlos", 8000);

        FolhaPagamento folhaEmail = new FolhaPagamento(new NotificadorEmail());
        folhaEmail.pagar(dev);
        folhaEmail.pagar(ger);

        FolhaPagamento folhaSms = new FolhaPagamento(new NotificadorSms());
        folhaSms.pagar(dev);
        folhaSms.pagar(ger);
        System.out.println();
    }
    //Etapa 6. No main, crie um desenvolvedor e um gerente,
    // pague os dois usando uma folha com notificação por email,
    // e depois crie outra folha com notificação por SMS.
    //Repara que a mesma FolhaPagamento funciona com e-mail ou SMS,
    // e só muda o que você entrega pra ela na hora de criar.
    // É o D do SOLID funcionando


    /*
    Questão 6: Exercício integrado (Sistema de Funcionários)
    Faça em etapas.

    Etapa 1. Crie uma classe abstrata Funcionario com atributos privados
    nome e salarioBase, um construtor que recebe os dois, getters,
    e um setter de salarioBase que não aceite valores negativos.

    Etapa 2. Adicione à classe Funcionario um metodo abstrato
    calcularSalario().

    Etapa 3. Crie duas classes que herdam de Funcionario:
    Desenvolvedor: o salário é o salário base mais 20%.
    ( salario = salarioBase + (salarioBase * 0.20) ou
    salario = salarioBase * 1.20
    )
    Gerente: o salário é o salário base mais 50%. (
    salario = salarioBase + (salarioBase * 0.50) ou
    salario = salarioBase * 1.50 )

    Etapa 4. Crie uma interface Notificador com o metodo
    notificar(String mensagem).
    Crie duas implementações: NotificadorEmail e NotificadorSms,
    cada uma imprimindo a mensagem de um jeito diferente.

    Etapa 5. Crie uma classe FolhaPagamento que recebe um Notificador
    pelo construtor e tem um metodo pagar(Funcionario f),
    que calcula o salário e usa o notificador para avisar o funcionário.

    Etapa 6. No main, crie um desenvolvedor e um gerente,
    pague os dois usando uma folha com notificação por email,
    e depois crie outra folha com notificação por SMS.

    Pergunta final: quais princípios e conceitos de POO você usou em
    cada etapa?

    Etapa 1: Usei o encapsulamento.
    Deixei o nome e o salarioBase privados e só dá pra acessar por
    getters e pelo setter, que tem uma regra pra não aceitar salário negativo.

    Etapa 2: Usei abstração e classe abstrata.
    A Funcionario é um molde que não pode virar objeto, e o metodo
    calcularSalario() não tem corpo, só diz que todo funcionário precisa
   saber calcular o salário.

    Etapa 3: Usei herança e polimorfismo.
    O Desenvolvedor e o Gerente herdam da Funcionario e escrevem o
    calcularSalario() cada um do seu jeito (20% e 50%).

    Etapa 4: Usei interface e abstração.
    O Notificador é só o contrato (notificar), e o NotificadorEmail e o
    NotificadorSms assinam esse contrato e imprimem de jeitos diferentes.

    Etapa 5: Usei o D do SOLID (Inversão de Dependência).
    A FolhaPagamento recebe a interface Notificador pelo construtor,
    e não uma classe concreta.

    Etapa 6: Usei polimorfismo e o D do SOLID.
    A mesma FolhaPagamento funciona com e-mail e com SMS, e o pagar()
    roda o cálculo certo pra cada tipo de funcionário.
     */
}
