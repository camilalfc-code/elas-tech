package org.example.listarevisao04102026;

public class Variaveis {
    public static void main(String[] args) {

    /*
    Variáveis e tipos
    Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
    Crie uma variável cidade e imprima: "Eu moro em Salvador."
    Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
    Crie uma variável preco com 29.90 e imprima o valor dela numa frase.
    Crie uma variável temCarteira com true e imprima.
    Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.
    Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável pra guardar alguma
    coisa antes.
     */

        //Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
        String nome = "Maria Silva";
        int idade = 50;
        double altura = 1.65;
        boolean jaProgramou = true;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Já programou antes? " + jaProgramou);
        System.out.println();


        //Crie uma variável cidade e imprima: "Eu moro em Salvador."
        String cidade = "Salvador";
        System.out.println("Eu moro em " + cidade + ".");
        System.out.println();

        //Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
        String primeiroNome = "Maria";
        String sobrenome = "Silva";
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
        System.out.println();

        //Crie uma variável preco com 29.90 e imprima o valor dela numa frase.
        double preco = 29.90;
        System.out.printf("O preço do produto é R$ %.2f%n", preco);
        //%.2f é o espaço do número com duas casas decimais.
        // O f é de "float" (número com vírgula) e o .2 é a quantidade de casas.
        //%n pula a linha.
        // O printf não pula linha sozinho, diferente do println.
        //Depois da vírgula vem o valor que entra no %.2f, aqui o preco.
        System.out.println();

        //Crie uma variável temCarteira com true e imprima.
        boolean temCarteira = true;
        System.out.println("Tem carteira? " + temCarteira);
        System.out.println();

        //Mini-desafio — Você tem a = 10 e b = 20.
        //Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.
        //Se você fizer a = b, o valor antigo de a se perde.
        // Você vai precisar de uma terceira variável pra guardar alguma coisa antes.
        int a = 10;
        int b = 20;
        int aux = a;
        //Cria a variável aux e copia o valor de a pra ela.
        // Agora o 10 está guardado em dois lugares: no a e no aux.
        // Esse aux é o "copo extra" que guarda o valor antes de ele se perder.
        a = b;
        //Agora o a recebe o valor do b.
        // O valor antigo do a (10) é sobrescrito, mas não tem problema, porque ele continua guardado no aux.
        b = aux;
        //O b recebe o que estava no aux, ou seja, o 10 original do a.
        //Depois da linha	a	b	aux
        //(início)	        10	20	não existe
        //int aux = a;	    10	20	10
        //a = b;	        20	20	10
        //b = aux;	        20	10	10
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
