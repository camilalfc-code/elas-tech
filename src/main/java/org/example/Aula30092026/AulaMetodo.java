package org.example.Aula30092026;

import java.util.Scanner;

///
public class AulaMetodo {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        //Aula

        //saudar();
        //Os parênteses ( ) sempre vão atrás do nome do método, tanto quando você cria quanto quando você chama:

        //saudarParametro();

    }


    //static void saudar() {
    //System.out.println("Oi, eu sou um método!");
    //System.out.println();
    //}

    //void quer dizer que o método não devolve nada, só executa algo.
    //um método é um bloquinho de código com nome, que você escreve uma vez e pode chamar quantas vezes quiser.
    // Em vez de repetir o mesmo código em vários lugares, você coloca ele num método e só chama pelo nome.

    //static void saudarParametro() {
    // Scanner scanner = new Scanner(System.in);
    //System.out.print("Digite seu nome: ");
    //String nome = scanner.nextLine();
    //System.out.println("Ola " + nome + "! Seja bem vinda");
    //System.out.println();


    // É questão de devolver ou não devolver:
    //void → o método faz algo e não devolve nada pra quem chamou
    //int → o método devolve um número inteiro (com return)
    //double → devolve um número com vírgula
    //String → devolve um texto
    //boolean → devolve true ou false

    //Se o método tem um tipo de retorno (int, double, String, boolean...),
    //ele precisa de um return com um valor desse tipo.
    //Sem o return, o Java reclama
    //E o void? Ele não precisa de return (e não devolve valor nenhum).

    //}


    //Exercicios

    /*
    1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime
    "Bem-vinda ao curso de Java!". Chame ele no main.
    ⚠️ O método vai fora do main, mas dentro da classe, no mesmo nível do main, logo abaixo dele.
    Se você tentar criar um método dentro do main, não compila.
    Nos próximos, crie uma classe separada para guardar os métodos (pode ser uma só, chamada Utilidades,
    ou uma por exercício, você decide). Lembre que para chamar, você precisa escrever o nome da classe na frente:
    Utilidades.dobro(5).
     */

    public static void main(String[] args) {
        mostrarBoasVindas();
    }

    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
        System.out.println();
    }

    /*
    2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?".
    Chame ele três vezes, passando nomes diferentes.
    */

    public class Utilidades {

        static void saudar(String nome) {
            System.out.println("Olá, " + nome + "! Tudo bem?");
            System.out.println();
        }

        static void executar() {
            saudar("Camila");
            saudar("Ana");
            saudar("Bruno");
        }
    }


    /*
    3 — Crie um método dobro(int numero) que devolve o dobro do número recebido.
    No main, chame ele e mostre o resultado.
    */
    static class Utilidades1 {

        static int dobro(int numero) {
            return numero * 2;
        }

        static void mostrarDobro() {
            int resultado = dobro(5);
            System.out.println("O dobro é: " + resultado);
            System.out.println();
        }
    }


    /*
    4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas.
    No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
    */

    static class Utilidades4 {

        static double calcularMedia(double n1, double n2) {
            return (n1 + n2) / 2;
        }

        static void mostrarMedia() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            double media = calcularMedia(nota1, nota2);
            System.out.printf("Média: %.2f%n", media);
            System.out.println();
        }
    }



    /*
    5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false.
    No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa
    é maior ou menor de idade.
    */

    static class Utilidades5 {

        static boolean ehMaiorDeIdade(int idade) {
            return idade >= 18;
        }

        static void mostrarMaioridade() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (ehMaiorDeIdade(idade)) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }
            System.out.println();
        }
    }


    /*
    6 — Crie três métodos com o mesmo nome somar:
    um que recebe dois inteiros
    um que recebe três inteiros
    um que recebe dois decimais
    No main, chame os três e veja o Java escolher sozinho qual usar.
    */

    static class Utilidades6 {

        static int somar(int a, int b) {
            return a + b;
        }

        static int somar(int a, int b, int c) {
            return a + b + c;
        }

        static double somar(double a, double b) {
            return a + b;
        }

        static void mostrarSomas() {
            System.out.println("Soma de 2 inteiros: " + somar(2, 3));
            System.out.println("Soma de 3 inteiros: " + somar(1, 2, 3));
            System.out.println("Soma de 2 decimais: " + somar(2.5, 3.5));
            System.out.println();
        }
    }

    /*
    7 — Crie dois métodos chamados saudacao:
    um sem parâmetro, que imprime "Olá!"
    um que recebe um nome, e imprime "Olá, [nome]!"
    */

    static class Utilidades7 {

        static void saudacao() {
            System.out.println("Olá!");
        }

        static void saudacao(String nome) {
            System.out.println("Olá, " + nome + "!");
        }

        static void mostrarSaudacoes() {
            saudacao();
            saudacao("Camila");
        }
    }
    }
