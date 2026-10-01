package org.example;

import java.util.Scanner;

public class ListaRevisão {
    static void main() {

        Scanner sc = new Scanner(System.in);

        /*
        Scanner sc = new Scanner(System.in);
        — cria o "leitor" que vai capturar o que você digitar no teclado.
        É basicamente o objeto responsável por ler a entrada do usuário.
         */


        /*
        1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
        Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
        No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
         */

                System.out.print("Digite o nome do lanche: ");
                String nome = sc.nextLine();

                System.out.print("Digite o valor do lanche: ");
                double valor = sc.nextDouble();

                if (valor > 30) {
                    valor = valor - 5;
                }

                System.out.printf("O lanche " + nome + " custa R$ %.2f%n", valor);
        /*
        sc.nextLine() — lê uma linha inteira de texto
        (por isso serve pro nome do lanche, que pode ter espaço, tipo "Xis Bacon").

        sc.nextDouble() — lê um número decimal
        (o valor do lanche).

        if (valor > 30) { valor = valor - 5; } — a condicional.
            Se o valor digitado for maior que 30, ela subtrai 5 direto na variável valor.
            Se não for maior, simplesmente não entra no bloco e o valor continua o mesmo.

        System.out.printf(...) — aqui é onde mistura concatenação com formatação.
            Você concatenou o texto fixo com a variável nome usando +, e depois usou %.2f pra dizer
            "formata esse número com exatamente 2 casas decimais" — é por isso que %.2f existe:
            sem ele, um valor tipo 28.5 apareceria como 28.5 em vez de 28.50. O %n no final é só uma quebra de linha.
         */



        /*
        2 - Faça um programa que use um laço for para contar de 1 até 15.
        Dentro do for, coloque um if para verificar se o número atual é par ou ímpar
        (dica: use o operador de resto da divisão % 2 == 0).
        Imprima na tela o número e a palavra correspondente.
        Exemplo de saída:
        "1 é Ímpar"
        "2 é Par"
         */

                   for (int i = 1; i <= 15; i++) {

                    if (i % 2 == 0) {
                        System.out.println(i + " é Par");
                    } else {
                        System.out.println(i + " é Ímpar");
                    }
                }

         /*

         for (int i = 1; i <= 15; i++) — o laço for tem três partes separadas por ;:
         int i = 1 → começa criando a variável i valendo 1 (só roda uma vez, no início)
         i <= 15 → a condição: enquanto isso for verdade, o laço continua
         i++ → depois de cada volta, soma 1 no i (é o mesmo que i = i + 1)
         Então ele vai rodar com i = 1, 2, 3... até 15, e para quando i passar de 15.

         i % 2 == 0 — o % é o operador de resto da divisão (módulo). i % 2 calcula o resto de i dividido por 2.
         Se o resto for 0, o número é par (divide exato); se o resto for 1, é ímpar.
         É o truque clássico pra testar paridade.

         Dentro do if/else, ele só decide qual mensagem imprimir dependendo do resultado desse teste.
          */



         /*
         3 - Usando um do-while e um switch, crie um menu interativo.
         O menu deve oferecer três opções:
            1 - Ver camisas
            2 - Ver calças
            3 - Sair
            Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha.
            Se digitar uma opção inválida, avise.
            O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
          */


        int opcao;

        do {
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Você escolheu ver camisas.");
                    break;

                case 2:
                    System.out.println("Você escolheu ver calças.");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 3);

        /*
        do { ... } while (condição);
        — a grande diferença dele pro for e pro while normal é que o do-while executa o bloco pelo menos uma vez,
        antes mesmo de checar a condição. Faz sentido aqui porque você precisa mostrar o menu pra pessoa ver as opções
        antes de qualquer verificação — não teria como testar a condição sem antes ter perguntado nada.

        Dentro do laço, ele imprime o menu, lê a opção digitada (sc.nextInt()), e joga pro switch.

        switch (opcao) { case 1: ... }
        — o switch compara o valor de opcao com cada case.
        Achou o valor batendo, executa aquele bloco.
        O break é essencial: ele interrompe o switch ali, senão o código "cai" pro próximo case e continua executando
        (isso se chama fall-through, e geralmente não é o que você quer).
        A diferença é mais de estilo e organização do que de lógica: switch fica mais limpo e legível quando você está comparando
        uma mesma variável contra vários valores fixos possíveis (tipo 1, 2, 3...).
        Já o if/else é mais flexível — serve pra comparar coisas diferentes, usar >, <, combinar condições com &&/||, etc.
        O switch só compara igualdade.

        default: — é o "senão" do switch.
        Roda quando o valor não bate com nenhum case — no seu caso, cobre qualquer opção inválida.
        E o default do switch é o equivalente exato do else final — "se não bateu com nenhum caso anterior, cai aqui".

        while (opcao != 3)
        — a condição de parada: repete o laço enquanto a opção for diferente de 3.
        Só quando a pessoa digita 3 é que o laço para.
         */


        /*
        4 - Crie uma classe chamada Pet.
        Dê a ela três atributos: nome (String), raca (String) e peso (double).
        Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        Atribua valores para os atributos de cada um deles.
        Imprima os dados dos dois pets concatenando textos e variáveis.
         */

        Pet cachorro = new Pet();
        cachorro.nome = "Rex";
        cachorro.raca = "Golden Retriever";
        cachorro.peso = 25.5;

        Pet gato = new Pet();
        gato.nome = "Mia";
        gato.raca = "Siamês";
        gato.peso = 4.2;

        System.out.println("Cachorro: " + cachorro.nome
                + ", raça: " + cachorro.raca
                + ", peso: " + cachorro.peso);

        System.out.println("Gato: " + gato.nome
                + ", raça: " + gato.raca
                + ", peso: " + gato.peso);

        /*
        A classe Pet é como um "molde" ou "ficha em branco".
        Ela define que todo Pet tem um nome, uma raca e um peso — mas ainda não diz quais valores. É só a estrutura.

        Pet cachorro = new Pet();
        — aqui você está instanciando a classe, ou seja, criando um objeto de verdade a partir daquele molde.
        O new Pet() cria um Pet novinho na memória, e você guarda a referência dele na variável cachorro.
        cachorro.nome = "Rex";
        — agora que o objeto existe, você acessa seus atributos com ponto (.) e atribui valores específicos pra aquele objeto.
        É o que diferencia cachorro de gato: os dois são Pets (vieram do mesmo molde), mas cada um tem seus próprios valores
        nos atributos.
        Repare que você criou dois objetos separados (cachorro e gato) da mesma classe
        — isso é a base de POO (programação orientada a objetos): uma classe pode gerar quantos objetos você quiser,
        cada um com seu próprio estado.

        No println, você concatena texto fixo com os atributos de cada objeto pra montar a frase.
         */



        /*
        5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        Na classe principal, faça um laço for que repita 3 vezes.
        A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        Instancie um novo Produto e guarde nele os valores digitados.
        Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
        Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
         */

           for (int i = 1; i <= 3; i++) {

            Produto produto = new Produto();

            System.out.print("Digite o nome do produto: ");
            produto.nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            produto.preco = sc.nextDouble();

            sc.nextLine();

            if (produto.preco > 100) {
                System.out.println("Produto caro!");
            } else {
                System.out.println("Produto com preço acessível!");
            }

            System.out.printf("Produto: %s | Preço: R$ %.2f%n",
                    produto.nome, produto.preco);
        }

        /*
        for (int i = 1; i <= 3; i++)
        — o mesmo laço for do exercício 2, só que aqui ele não serve pra contar e mostrar números:
        ele serve pra repetir o cadastro de produto 3 vezes.
        A cada volta, o corpo inteiro do laço roda do zero.

        Produto produto = new Produto();
        — repara que isso está dentro do for.
        Isso é proposital: a cada volta do laço, um objeto Produto novo é criado.
        Se você criasse o objeto fora do laço, ficaria reaproveitando o mesmo objeto e sobrescrevendo os valores a cada volta
        (o que até funcionaria pra esse exercício específico, mas a instrução pedia pra instanciar a cada repetição
        — e isso também é o que prepara terreno pro exercício 7, onde isso é regra obrigatória).

        sc.nextLine(); sozinho (linha depois do sc.nextDouble())
        — essa é a "armadilha do Scanner" que o enunciado do exercício 7 menciona!
        Quando você lê um número com nextDouble(), o Scanner não consome o "Enter" (quebra de linha) que ficou depois do número digitado.
        Se o próximo comando fosse outro nextLine() pra ler texto, ele leria essa quebra de linha vazia em vez de esperar você digitar algo
        — e o programa "pularia" a pergunta seguinte.
        Por isso aqui, mesmo sem usar o valor lido, dá-se um sc.nextLine() "vazio" só pra limpar esse resto antes da próxima volta
        do laço pedir o nome de novo.

        O resto é igual ao exercício 1: um if/else testando o preço, e um printf formatando a saída.
         */


        /*
        6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
        Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
        Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
        Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
         */

        System.out.print("Digite seu ano de nascimento: ");
        int ano = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite seu nome completo: ");
        nome = sc.nextLine();

        System.out.println("O usuário " + nome + " nasceu em " + ano + ".");

        /*
        int ano = sc.nextInt();
        — lê um número inteiro, o ano de nascimento.

        sc.nextLine();
        — de novo aquela mesma limpeza do Enter que sobra depois de um nextInt().
        Você já entendeu essa pegadinha, então repara que aqui ela já veio "premeditada":
        o enunciado pediu pra ler o ano primeiro e o nome depois, exatamente na ordem que causa o problema
        — então essa linha de limpeza é obrigatória aqui, não é opcional.

        String nome = sc.nextLine();
        — lê o nome completo (linha inteira, por isso serve pra nomes com espaço).

        System.out.println("O usuário " + nome + " nasceu em " + ano + ".");
        — simplesmente concatena tudo numa frase só, usando +.

        Diferente dos exercícios anteriores, aqui não teve printf porque não tem nenhum número decimal pra formatar
        — é só texto e um inteiro, então concatenação direta já resolve.
         */



        /*
        7 -  DESAFIO — Sistema de Cadastro de Alunas
        Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas.
        O programa fica rodando até a pessoa escolher sair.
        Este desafio tem regras de construção obrigatórias.
        Não é só fazer funcionar, é fazer funcionando do jeito pedido.
        Sigam as instruções solicitadas, pois o objetivo é praticar as estruturas que vimos essa semana.

        O que o programa faz
        Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair

        Se escolher 1:
        pede a primeira nota
        pede a segunda nota
        calcula a média
        pede o nome da aluna
        decide se ela foi aprovada (média 6 ou mais)
        mostra uma frase com o nome, as duas notas, a média e se foi aprovada
        volta pro menu

        Se escolher 2: mostra uma mensagem de despedida e encerra

        Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu

        Regras obrigatórias:
        1. Crie uma classe Aluna com cinco atributos: nome, nota, nota2, media e passou (passou sendo boolean).
        2. Toda informação fica nos atributos do objeto. Nada de criar variáveis soltas tipo double nota1 = sc.nextDouble().
            O valor lido vai direto pro atributo: aluna.nota = sc.nextDouble().
        3. Use while para manter o programa rodando até a pessoa escolher sair.
        4. Use switch para tratar as opções do menu. Todos os casos precisam de break, e precisa ter um default.
        5. Instancie a Aluna dentro do loop, no momento do cadastro. Cada volta cria uma aluna nova.
            (Ainda não estudamos como guardar vários valores, por enquanto, cada aluna é mostrada na tela e descartada
            na próxima iteração do loop.)
        6. Calcule a média dentro do programa. Nada de pedir a média pronta pra pessoa.
        7. Use if / else para definir se a aluna passou. A média mínima para aprovação é 6.
            Se a média for 6 ou mais, passou recebe true; se for menor, recebe false.
            O programa decide sozinho — não pergunte isso para a pessoa.
        8. Use printf para mostrar o resultado: %s para o nome (String), %.1f para as notas e a média, e %b para o passou (boolean).
            Exemplo de execução:
            Deseja iniciar? Pressione 1 continuar, 2 para sair
            1
            Nota 1:
            8.0
            Nota 2:
            7.0
            Nome da Aluna:
            Maria Silva
            O nome da aluna é Maria Silva, sua primeira nota foi 8.0, sua segunda nota foi 7.0,
            e sua média final foi 7.5. Aluna aprovada: true
            Deseja iniciar? Pressione 1 continuar, 2 para sair
            5
            Opção inválida.
            Deseja iniciar? Pressione 1 continuar, 2 para sair
            2
            Encerrando o sistema. Até logo!


            Bônus:
            Se terminar e quiser ir além
            Faça o programa mostrar "Aprovada" ou "Reprovada" em vez de true / false,
            Adicione uma opção no menu que mostra quantas alunas já foram cadastradas até agora
            Não deixe cadastrar nota menor que 0 ou maior que 10

            ⚠️ Dica: Você vai precisar de um scanner.nextLine() sozinho.
            Lembram do bug do scanner.nextLine?
            Ler número e depois texto tem uma armadilha: sobra um Enter no caminho e o programa pula a pergunta do nome.
            É ai que entra o sc.nextLine() sozinho pra limpar antes de ler o nome.
            Descubra onde ele vai.
                     */



        opcao = 0;
        /*
        opcao = 0 começando em zero é só pra garantir que o while não seja "enganado" logo de cara —
        se opcao já nascesse com valor 2, o programa fecharia antes mesmo de perguntar qualquer coisa pro cliente.
         */

        int totalAlunas = 0;
        /*
        cria uma variável chamada totalAlunas, do tipo número inteiro (int),
        começando com o valor 0 — é o contador de quantas alunas já foram cadastradas até agora.
        Ela nasce zerada porque, no começo do programa, nenhuma aluna foi cadastrada ainda.
        A cada vez que uma aluna nova é registrada (dentro do case 1:),
        você soma 1 nela (totalAlunas++;) — então ela vai subindo: 0, 1, 2, 3...
        E lembra que ela precisa ficar fora do while (declarada só uma vez, antes do laço começar) — igual o opcao.
        Se ela nascesse dentro do while ou dentro do switch, toda vez que o laço desse a volta ela voltaria pra 0,
        e você nunca conseguiria contar de verdade quantas alunas já foram cadastradas no total.
         */

        while (opcao != 2) {
            /*
            while (opcao != 2)
            Isso quer dizer: "continue perguntando pro cliente o que ele quer, até ele dizer '2 = quero ir embora'".
            o while testa a condição antes de rodar o bloco.
            Por isso opcao precisa começar com um valor que não seja 2 (aqui, 0)
            — senão o laço nem entraria na primeira vez.
            */

            System.out.println("Deseja iniciar?");
            System.out.println("Pressione 1 para continuar");
            System.out.println("Pressione 2 para sair");
            System.out.println("Pressione 3 para ver quantas alunas foram cadastradas");
            /*
            Os quatro println mostram o menu pro usuário ver as opções — só texto na tela.
             */

            opcao = sc.nextInt();
            /*
            opcao = sc.nextInt(); é onde o programa para e espera você digitar um número,
            e guarda ele na variável opcao (repara que aqui não tem int na frente, porque opcao já foi declarada
            lá em cima — aqui é só atribuição, não declaração de novo).
             */

            switch (opcao) {
                /*
                é o "porteiro" ele pega o valor que está dentro de opcao e vai comparar com cada case logo abaixo,
                pra decidir qual bloco de código rodar.
                 */

                case 1:

                    Aluna aluna = new Aluna();
                    /*
                    Pega uma caixinha Aluna novinha do estoque
                    — cria um objeto novo, vazio, pra guardar os dados dessa aluna específica
                    que vai ser cadastrada agora.
                     */

                    System.out.println("Nota 1:");
                    aluna.nota = sc.nextDouble();
                    /*
                    Mostra na tela "Nota 1:" pedindo pro usuário digitar,
                    e o valor que ele digitar (um número decimal) vai direto pra gavetinha nota daquela caixinha (aluna.nota).
                     */

                    System.out.println("Nota 2:");
                    aluna.nota2 = sc.nextDouble();
                    /*
                    Mostra na tela "Nota 2:" pedindo pro usuário digitar,
                    e o valor que ele digitar (um número decimal) vai direto pra gavetinha nota daquela caixinha (aluna.nota).
                    */

                    aluna.media = (aluna.nota + aluna.nota2) / 2;
                    /*
                    Aqui é a continha da média:
                    soma a nota 1 com a nota 2, e divide por 2 (média de dois valores).
                    O resultado vai direto pra gavetinha media.
                    Repara que ele não pede pra você digitar a média — o programa calcula sozinho,
                    é uma das regras obrigatórias do exercício.
                     */

                    sc.nextLine();
                    /*
                    Aquela "limpeza" do Enter que sobrou depois do sc.nextDouble() da nota 2.
                    Sem essa linha, a próxima leitura de texto (o nome) pularia sozinha.
                     */

                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();
                    /*
                    Pede o nome, e guarda na gavetinha nome —
                    aqui usa nextLine() (não nextDouble()) porque nome é texto, não número.
                    No final dessas linhas, a caixinha aluna já está com notas, média e nome preenchidos —
                    só falta decidir se ela passou (que é o próximo passo, o if/else)
                     */


                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }
                        /*
                         "Ela passou, sim ou não?" —
                        isso é a regra obrigatória do exercício.
                        A resposta precisa ficar guardada especificamente no atributo aluna.passou,
                        que é do tipo boolean (só aceita true ou false).
                        Ninguém vê isso na tela diretamente (você não usa aluna.passou no printf),
                        mas ele precisa existir preenchido, porque foi isso que o enunciado pediu.
                         */


                    if (aluna.media >= 6) {
                        aluna.situacao = "Aprovada";
                        /*
                        Pergunta: a média daquela aluna é 6 ou mais?
                        (repara que ele olha aluna.media — isso sim é a gavetinha da caixinha,
                        porque a média já foi calculada e guardada lá antes).
                        Se a resposta for sim, guarda o texto "Aprovada" dentro da variável situacao.
                         */
                    } else {
                        aluna.situacao = "Reprovada";
                        /*
                        Se a resposta for não (média menor que 6), guarda "Reprovada" na mesma variável.
                         */
                    }

                    System.out.printf(
                            /*
                            Chama o printf (print formatado) —
                            ele serve pra imprimir texto misturado com valores formatados de um jeito controlado
                            (tipo, forçar duas casas decimais num número).
                             */
                            "O nome da aluna é %s, sua primeira nota foi %.1f, " +
                                    "sua segunda nota foi %.1f, e sua média final foi %.1f. " +
                                    "Aluna aprovada: %s%n",
                            /*
                            Essa é a frase modelo (o "molde" do texto), toda entre aspas.
                            Repara que ela está quebrada em três linhas só por organização visual —
                            o + no final de cada linha concatena os pedaços, formando uma frase só, gigante.
                            Você podia escrever tudo numa linha só, ficaria só mais difícil de ler.
                            Dentro dessa frase, tem uns "espaços reservados" especiais, que são as marcações com %:
                            %s → reserva um espaço pra um texto (String).
                            Tem dois %s na frase: um vai virar o nome, o outro vai virar "Aprovada"/"Reprovada".
                            %.1f → reserva um espaço pra um número decimal, formatado com 1 casa decimal.
                            Tem três: um pra nota 1, um pra nota 2, um pra média.
                            %n → só uma quebra de linha (pula pra linha de baixo depois de imprimir).
                             */
                            aluna.nome,
                            aluna.nota,
                            aluna.nota2,
                            aluna.media,
                            aluna.situacao
                            /*
                            Aqui é onde você diz o que vai entrar em cada % que apareceu lá em cima —
                            e a ordem importa muito!
                            O Java pega esses valores na sequência e "encaixa" um em cada % correspondente,
                            na ordem em que aparecem:
                            aluna.nome → entra no primeiro %s
                            aluna.nota → entra no primeiro %.1f
                            aluna.nota2 → entra no segundo %.1f
                            aluna.media → entra no terceiro %.1f
                            aluna.situacao → entra no segundo %s
                            Se você trocasse a ordem desses argumentos (por exemplo, colocasse aluna.media antes de aluna.nota), o resultado sairia
                            todo bagunçado, com os valores errados nos lugares errados —
                             mesmo sem dar erro de compilação, porque os tipos ainda batem (double com %.1f, String com %s).
                             */
                    );

                    totalAlunas++;
                    /*
                    Soma 1 na variável totalAlunas.
                    É o mesmo que escrever totalAlunas = totalAlunas + 1;, só que mais curto —
                    o ++ é um "atalho" pra incrementar em 1.
                    Esse é o pedaço que faz o contador de alunas cadastradas (o bônus) realmente funcionar:
                    toda vez que o case 1: termina de cadastrar uma aluna, esse contador sobe mais um.
                     */

                    break;
                    /*
                    Avisa pro switch "acabou aqui, pode sair" —
                    interrompe o switch naquele ponto, sem deixar o código "escorregar" pra dentro do case 2:
                    ou do default: logo abaixo.
                    sem ele, mesmo depois de fazer tudo do case 1:, o programa continuaria executando o código
                    dos outros cases também — o que bagunçaria tudo.
                    Depois desse break, o controle do programa volta pro while,
                    que checa de novo se opcao != 2 —
                    e como a rodada de cadastro terminou, ele mostra o menu de novo, esperando a próxima escolha do usuário.
                     */

                    /*
                    "instancie a Aluna dentro do loop, no momento do cadastro".
                    Por isso Aluna aluna = new Aluna(); está dentro do case 1, não lá em cima antes do while.
                    Isso significa que toda vez que a pessoa escolhe cadastrar, nasce uma Aluna nova e vazia,
                    sem lembrar nada da aluna anterior.
                    Quando o switch termina aquela rodada, essa aluna "some" (é descartada)
                    — é exatamente o que o enunciado avisa: "cada aluna é mostrada na tela e descartada na próxima iteração"
                     */

                case 2:
                    /*
                    Esse é o "caminho" que o switch segue quando o valor de opcao é exatamente 2 — ou seja, quando o usuário escolheu "sair".
                     */
                    System.out.println("Encerrando o sistema. Até logo!");
                    /*
                    Só mostra uma mensagem de despedida na tela — nenhuma lógica complicada aqui, é texto fixo mesmo.
                     */
                    break;
                    /*
                    Sai do switch, do mesmo jeito que no case 1:.
                    Mas repara numa coisa importante: esse break só encerra o switch, não o while!
                    Depois desse break, o controle volta pro while (opcao != 2),
                    que vai testar a condição de novo.
                    Como opcao é 2, a condição opcao != 2 vira falsa —
                    e é isso que faz o while parar de repetir de verdade.
                    Ou seja: quem realmente "fecha a loja" é o while lá de fora, não o case 2: em si —
                    o case 2: só imprime a mensagem e deixa a condição do laço cuidar do resto.
                     */

                case 3:
                    /*
                    Caminho que o switch segue quando opcao é 3 — a opção nova que você criou pro bônus
                     */
                    System.out.println("Total de alunas cadastradas: "+ totalAlunas);
                    /*
                    Monta a frase concatenando o texto fixo
                    "Total de alunas cadastradas: " com o valor que está guardado na variável totalAlunas (
                    aquele contador que vai subindo com o totalAlunas++; lá no case 1:).
                    Igual você fez no exercício 6, com nome e ano — texto entre aspas, +, variável sem aspas.
                    Repara numa coisa boa dessa opção: ela não muda o valor de totalAlunas, só mostra ele na tela.
                    Ou seja, o usuário pode escolher a opção 3 várias vezes seguidas, ver o total,
                    e continuar cadastrando alunas depois — nada é resetado ou alterado aqui, é só uma "consulta".
                     */
                    break;
                    /*
                    Mesma função de sempre: sai do switch, sem deixar o código continuar pro default: logo abaixo.
                    Depois disso, o while testa de novo opcao != 2 —
                    como opcao é 3 (não 2), a condição continua verdadeira, e o menu aparece de novo, esperando a próxima escolha.
                     */

                default:
                    /*
                    Esse é o "else" do switch —
                    o caminho que roda quando opcao não bate com nenhum dos cases definidos
                    (não é 1, não é 2, não é 3).
                    Por exemplo, se o usuário digitar 5, 0, 99... qualquer coisa fora das opções válidas cai aqui.
                     */
                    System.out.println("Opção inválida.");
                    /*
                    Só avisa pro usuário que o número digitado não corresponde a nenhuma opção do menu —
                    sem cadastrar nada, sem mudar contador, sem fazer nenhuma lógica além de mostrar o aviso.
                     */
                    break;
                    /*
                    Sai do switch —
                    nesse caso específico nem seria estritamente necessário
                    (já que default: costuma ser o último bloco do switch, não tem mais nada depois pra "escorregar"),
                    mas é uma boa prática manter, principalmente porque o enunciado pediu explicitamente:
                    "Todos os casos precisam de break, e precisa ter um default."
                    Depois disso, o while testa a condição de novo —
                    como opcao não é 2, o laço continua e o menu aparece outra vez, dando outra chance pro usuário digitar uma opção válida.
                     */
            }
        }

        sc.close();
        /*
        Fecha o Scanner —
        libera o recurso que estava "ouvindo" a entrada do teclado (System.in).
        É uma boa prática sempre fechar recursos desse tipo quando você não vai mais usá-los,
        porque eles ficam "reservados" pelo sistema enquanto abertos.
        Repara onde essa linha está: fora do while, depois dele terminar.
        Isso é importante — se você fechasse o Scanner dentro do laço (por exemplo, dentro do case 2:),
        e por algum motivo tentasse usar o sc de novo depois, o programa quebraria com um erro (Scanner closed),
        porque um Scanner fechado não pode mais ler nada.
        Como esse sc.close() só roda depois que o while (opcao != 2)
        já terminou de vez (ou seja, o usuário já escolheu sair),
        faz sentido fechar aqui: o programa realmente não vai precisar ler mais nada do teclado a partir desse ponto.
         */


    }
}
