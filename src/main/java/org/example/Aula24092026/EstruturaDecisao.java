package org.example.Aula24092026;

public class EstruturaDecisao {

            public static void main(String[] args) {

            /* 1 - Categoria por idade
                1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente",
                    de 18 a 59 é "Adulto" e 60 ou mais é "Idoso". */
            int idade = 38;

            if (idade < 13) {
                System.out.println("Criança");
            } else if (idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade <= 59) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }

            /*
            outra versao:
            int idade = 38;
            if (idade < 13) {
             System.out.println("Criança");
             } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
            } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
            } else {
             System.out.println("Idoso");
            }
             */

            /*
            if       → primeira possibilidade
            else if  → outra possibilidade
            else     → tudo que não entrou nas anteriores.
            O último else não precisa de condição.
             */


            /* 2 - Saldo da conta
            2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
            Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante.
            Se não for, mostre "Saldo insuficiente" e quanto está faltando.
             */
            double saldoConta = 500.00;
            double compra = 320.00;

            if (saldoConta >= compra) {
                double saldoRestante = saldoConta - compra;

                System.out.println("Compra aprovada!");
                System.out.println("Saldo restante: R$ " + saldoRestante);
            } else {
                double faltando = compra - saldoConta;

                System.out.println("Saldo insuficiente");
                System.out.println("Está faltando: R$ " + faltando);
            }


            /* 3 - Cardápio
            3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch,
            mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino,
            3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".
             */
            int opcao = 3;

            switch (opcao) {

                case 1:
                    System.out.println("Café");
                    break;

                case 2:
                    System.out.println("Cappuccino");
                    break;

                case 3:
                    System.out.println("Chocolate quente");
                    break;

                case 4:
                    System.out.println("Chá");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
                /*
                O switch serve para escolher um caminho com base no valor de uma variável.
                o switch procura e executa

                A ideia é:
                switch → qual é o valor?
                case → se for esse valor, faça isso.
                break → pare aqui.
                default → se não for nenhuma opção, faça isso.

                if = "essa condição é verdadeira?"
                if trabalha com uma condição, que precisa resultar em true ou false
                IF → faço uma pergunta.

                switch = "qual é o valor?"
                switch é usado quando você tem uma variável e várias possibilidades específicas para o valor dela.
                SWITCH → procuro uma opção.

                if → else
                "Se nenhuma condição anterior for verdadeira..."

                switch → default
                "Se nenhum case corresponder..."

                Na prática, eles ocupam um papel parecido: são o “caso contrário”.
                A diferença é que else pertence ao if, enquanto default pertence ao switch
                 */

            /* 4 - Entrada na festa
            4 — Crie variáveis idade (17) e temAutorizacao (true).
            Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização.
            Faça o mesmo para precisa ter 18 anos e ter autorização.
             */
            int idadeFesta = 17;
            boolean temAutorizacao = true;

            // 18 anos OU autorização
            if (idadeFesta >= 18 || temAutorizacao) {
                System.out.println("Pode entrar na festa.");
            } else {
                System.out.println("Não pode entrar na festa.");
            }

            // 18 anos E autorização
            if (idadeFesta >= 18 && temAutorizacao) {
                System.out.println("Pode entrar na festa.");
            } else {
                System.out.println("Não pode entrar na festa.");
            }
            /*
            && = E
            && → as duas condições precisam ser verdadeiras
            && = E → precisa das duas
            || = OU
            || → basta uma condição ser verdadeira
            || = OU → basta uma
             */


            /* Desafio - Média
              Desafio: Crie variáveis para três notas de uma aluna.
              Calcule a média e mostre:
              "Aprovada" se for 7 ou mais,
              "Recuperação" entre 5 e 6.9, e
              "Reprovada" abaixo de 5.
              Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

              Ps: Utilize double para o valor das notas.
              Para controlar as casas decimais, use printf com o marcador %.2f onde você quer que apareça a média no seu texto
              (Troquem ele de lugar pra ver o que acontece), onde 2 é a quantidade de casas que você quer
              (Experimentem trocar por 3 e ver o que acontece). O texto e a pontuação vão dentro das aspas,
              e o \n no final pula a linha (ele funciona como  um enter para que tudo não fique colado um do lado do outro):
             */

                double nota1 = 5.3;
                double nota2 = 7.8;
                double nota3 = 4.5;

                double media = (nota1 + nota2 + nota3) / 3;

                if (media >= 7) {
                    System.out.printf("Aprovada! Sua média é: %.2f\n", media);
                } else if (media >= 5) {
                    System.out.printf("Recuperação! Sua média é: %.2f\n", media);
                } else {
                    System.out.printf("Reprovada! Sua média é: %.2f\n", media);
                }

                /*
                System.out.print() → imprime e fica na mesma linha.
                System.out.println() → imprime e depois pula para a próxima linha.
                System.out.printf() → imprime permitindo formatar os valores, principalmente números.
                %.2f significa:
                - % → indica que você vai colocar um valor formatado ali
                - .2 → mostrar 2 casas depois da vírgula
                - f → número decimal
                 */
        }

}
