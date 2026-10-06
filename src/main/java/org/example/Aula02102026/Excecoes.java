package org.example.Aula02102026;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    static void main() {

        /*Aula
        System.out.println("Antes da divisão");

        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não dá pra dividir por zero!");
        } finally {
            System.out.println("Isso aparece sempre!");
        }

        System.out.println("Depois da divisão");

        //catch: quer dizer "pegar". Diz pro Java: "se der erro lá no try, vem pra cá".
        //ArithmeticException: é o tipo do erro que esse catch sabe pegar.
        // Arithmetic é de aritmética (conta matemática), e a divisão por zero é um erro desse tipo.
        // Se acontecesse outro tipo de erro, tipo ArrayIndexOutOfBoundsException, esse catch não pegaria.
        //e: é o nome que você dá pra exceção que foi pega, igual o nome num método com parâmetro.
        // Pode ser qualquer nome, mas e é o costume.
        */


        //Exercicios

        Scanner scanner = new Scanner(System.in);

        /*
        1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
        Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra
        dividir por zero.
         */

        System.out.println("Questão 1");
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        try {
            //Abre o bloco do "tentar".
            // O Java vai executar o que está aqui dentro, mas já de olho:
            // se algum erro acontecer, ele não quebra, ele pula pro catch.
            int resultado = a / b;
            //Divide a por b e guarda em resultado.
            // É essa linha que pode dar problema: se b for 0, o Java lança a ArithmeticException.
            System.out.println("Resultado: " + resultado);
            //Mostra o resultado. Fica dentro do try porque só faz sentido se a divisão funcionou.
            // Se deu erro na linha de cima, o Java nem chega aqui.
        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");
            //Se a divisão deu erro do tipo ArithmeticException, o programa cai aqui.
            //Mostra a mensagem que o enunciado pede.
            //Se não deu erro, o catch é pulado.
        } finally {
                System.out.println("Fim da divisão.");
        }
        System.out.println();


        /*
        2 — Crie um array com 5 notas.
        Peça uma posição para a pessoa e mostre a nota daquela posição.
        Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
         */

        System.out.println("Questão 2");
        int[] notas = {8, 6, 10, 7, 9};
        //Cria o array com as 5 notas. Cada nota tem uma posição, e a contagem começa do zero:
        //Posição	0	1	2	3	4
        //Nota	8	6	10	7	9
        //Por isso o array "só vai de 0 a 4": são 5 notas, mas a última está na posição 4.

        System.out.print("Digite a posição da nota: ");
        int posicao = scanner.nextInt();
        //O scanner espera a pessoa digitar um número inteiro e apertar Enter,
        // e o int posicao guarda o que foi digitado.

        try {
            //Abre o bloco do "tentar". Se algo der errado lá dentro, o programa não quebra: ele pula pro catch.
            System.out.println("Nota: " + notas[posicao]);
            //O notas[posicao] pega a nota daquela posição, e o + junta com o texto "Nota: ".
            // Se você digitar 2, vira notas[2], que é 10.
            // É essa linha que pode dar erro: se digitar 7, a posição 7 não existe no array,
            // e o Java lança a ArrayIndexOutOfBoundsException.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe. O array só vai de 0 a 4.");
            //catch (ArrayIndexOutOfBoundsException e) só pega o erro de posição que não existe no array.
            //Se esse erro aconteceu, mostra a mensagem que o enunciado pede.
            //Se não teve erro, o catch é pulado.
        }
        System.out.println();


        /*
        3 — Peça a idade da pessoa com scanner.nextInt().
        Se ela digitar um texto em vez de um número, trate a InputMismatchException
        e mostre uma mensagem pedindo um número.
         */

        System.out.println("Questão 3");
        System.out.print("Digite sua idade: ");

        try {
            //Abre o "tentar". Se algo der errado lá dentro, o programa não quebra: ele pula pro catch.
            int idade = scanner.nextInt();
            //scanner.nextInt() espera a pessoa digitar e tenta ler como um número inteiro.
            //Se ela digitar 20, funciona e o int idade guarda o 20.
            //Se digitar abc, o Java não consegue transformar em número e lança a InputMismatchException.
            System.out.println("Sua idade é: " + idade);
            //Mostra a idade.
            // Fica dentro do try porque só faz sentido se a leitura deu certo.
            // Se deu erro na linha de cima, o Java nem chega aqui.
        } catch (InputMismatchException e) {
            //catch (InputMismatchException e) só pega o erro de digitar texto onde devia ser número.
            //O println mostra a mensagem que o enunciado pede.
            //O scanner.nextLine() limpa o abc que ficou preso no Scanner.
            // Quando o nextInt() falha, ele não consome o texto errado, então ele fica esperando lá.
            // Sem esse nextLine(), a próxima leitura do teclado (na questão 5, por exemplo) pegaria o abc de novo
            // e quebraria também.
            System.out.println("Isso não é um número! Digite a idade usando números.");
            scanner.nextLine();
        }
        System.out.println();

        /*
        4 — Crie uma variável String nome = null;
        e tente imprimir nome.length().
        Trate a NullPointerException e mostre "O nome não foi preenchido."
         */

        System.out.println("Questão 4");
        String nome = null;
        //Cria a variável nome, do tipo String, mas sem nenhum texto dentro.
        // O null quer dizer "não aponta pra nada". É diferente de texto vazio:
        //"" → existe um texto, só que ele não tem nenhuma letra
        //null → não existe texto nenhum
        //Pensa numa caixa: "" é uma caixa vazia, e null é nem ter a caixa.

        try {
            //Abre o "tentar". Se algo der errado lá dentro, o programa não quebra: ele pula pro catch.
            System.out.println("Tamanho do nome: " + nome.length());
            //O nome.length() tenta contar quantas letras tem o texto.
            // Mas o nome é null, então não tem texto pra contar.
            // É como pedir pra contar as páginas de um livro que você não tem.
            // Nesse momento o Java lança a NullPointerException, e a linha não chega a imprimir nada.
            //Lembra que o length() você usou na primeira atividade, com o nome digitado?
            // Lá funcionava porque tinha um texto. Aqui não tem.
        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido.");
            //NullPointerException é o erro de tentar usar algo que é null (chamar um método numa coisa que não existe).
            //O catch pega esse erro e mostra a mensagem que o enunciado pede.
        }
        System.out.println();


        /*
        5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        Trate a ArithmeticException para o caso de ela digitar 0.
         */

        System.out.println("Questão 5");
        System.out.print("Digite um número: ");
        int divisor = scanner.nextInt();
        //O scanner espera a pessoa digitar um número inteiro e apertar Enter,
        // e o int divisor guarda o que foi digitado.
        // O nome é divisor porque é o número pelo qual o 100 vai ser dividido,
        // e porque a, b e idade já foram usados no main.

        try {
            //Abre o "tentar". Se algo der errado lá dentro, o programa não quebra: ele pula pro catch.
            int resto = 100 % divisor;
            //O % é o operador de resto da divisão. Ele divide e te devolve só o que sobra:
            //100 % 30 → 30 cabe 3 vezes em 100 (que dá 90), então sobram 10
            //100 % 7 → 7 cabe 14 vezes (que dá 98), então sobram 2
            //100 % 10 → cabe 10 vezes certinho, então sobra 0
            //O int resto guarda esse resultado.
            // É essa linha que pode dar erro: se o divisor for 0, o Java lança
            // a ArithmeticException, porque o resto também é uma divisão por baixo dos panos,
            // e não existe divisão por zero.
            System.out.println("O resto da divisão de 100 por " + divisor + " é: " + resto);
            //Mostra o resultado, juntando textos e variáveis com o +.
            // Se você digitou 30, aparece O resto da divisão de 100 por 30 é: 10.
            // Fica dentro do try porque só faz sentido se a conta funcionou.
            // Se deu erro na linha de cima, o Java nem chega aqui.
        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");
            //ArithmeticException é o mesmo tipo de erro da questão 1.
            //Se o divisor for 0, o programa cai aqui e mostra a mensagem que o enunciado pede.
            //Se não deu erro, o catch é pulado.
        }
        System.out.println();


        /*
        6 — Crie um array com 3 nomes.
        Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem
        "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."
         */

        System.out.println("Questão 6");
        String[] nomes = {"Ana", "Bruno", "Carla"};
        //Cria o array com 3 nomes. A contagem começa do zero:
        //Posição	0	1	2
        //Nome	Ana	Bruno	Carla
        //Então esse array só vai de 0 a 2. Não existe posição 3, 4, 5...

        try {
            System.out.println("Nome: " + nomes[5]);
            //Tenta pegar o nome da posição 5, que não existe.
            // Nesse momento o Java lança a ArrayIndexOutOfBoundsException, e a linha não chega a imprimir nada.
            // O enunciado pede isso de propósito: "mostre o nome da posição 5 de propósito".
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
            //ArrayIndexOutOfBoundsException é o erro de usar uma posição que não existe no array. É o mesmo da questão 2.
            //O catch pega o erro e mostra a mensagem exata que o enunciado pede.
        }

        System.out.println("O programa continua funcionando.");
        //Essa linha está fora do try/catch, porque o enunciado pede pra imprimir
        // "depois do try/catch". Ela mostra o ponto principal de tratar exceção:
        // o erro aconteceu, foi pego, e o programa seguiu em frente em vez de parar.
        // Sem o try/catch, o programa quebraria na linha do nomes[5] e essa mensagem nunca apareceria.
        //O caminho do programa fica assim:
        //Cria o array com 3 nomes
        //Entra no try e tenta o nomes[5]
        //Dá erro → pula pro catch
        //Mostra Essa posição não existe.
        //Segue pra frente e mostra O programa continua funcionando.
    }

}
