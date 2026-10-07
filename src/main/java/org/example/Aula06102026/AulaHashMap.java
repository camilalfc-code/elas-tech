package org.example.Aula06102026;

import java.util.HashMap;

public class AulaHashMap {

    static void main() {

       /*
       Atividade HashMap
        1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
           inteiro e depois use get para mostrar a idade de uma delas.
        2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
           imprima, e depois faça put de "café" DE NOVO com valor 7.50.
           Imprima outra vez e veja o que aconteceu com o tamanho.
        3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
           dentro de um if para mostrar o telefone de alguém que está na agenda
           e de alguém que não está.
        4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
           Use getOrDefault para mostrar a quantidade de um produto que existe
           e de um que não existe (devolvendo 0). Depois tente com get normal
           no que não existe e compare.
        5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
           Remova uma delas e imprima de novo.
        */


        // 1. Crie um HashMap de nomes e idades com três pessoas.
        // Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.
        HashMap<String, Integer> idades = new HashMap<>();
        //HashMap<String, Integer> guarda pares: a chave é o nome (String) e o valor é a idade (Integer).
        idades.put("Ana", 28);
        idades.put("Bruno", 35);
        idades.put("Carla", 22);
        //Cada put adiciona um par(nome e idade), um de cada vez.
        System.out.println(idades);
        //println(idades) mostra o mapa inteiro, no formato chave=valor.
        System.out.println("Idade do Bruno: " + idades.get("Bruno"));
        //get("Bruno") devolve o valor da chave "Bruno", ou seja, 35.
        System.out.println();


        // 2. Crie um HashMap de produtos e preços.
        // Coloque "café" com valor 5.00, imprima,
        // e depois faça put de "café" DE NOVO com valor 7.50.
        // Imprima outra vez e veja o que aconteceu com o tamanho.
        HashMap<String, Double> precos = new HashMap<>();
        //Agora o valor é Double, porque o preço tem casas decimais. A chave continua sendo String.
        precos.put("café", 5.00);
        //primeiro put cria o par café=5.0.
        System.out.println(precos);
        System.out.println("Tamanho: " + precos.size());
        //precos.size() conta os pares (chave e valor) que estão no HashMap naquela hora e devolve o número.
        precos.put("café", 7.50);
        //O segundo put usa a mesma chave. Como a chave não repete, o Java não cria um segundo par:
        // ele troca o valor do que já existe.
        //put com chave que já existe → troca o valor (o tamanho fica igual).
        System.out.println(precos);
        System.out.println("Tamanho: " + precos.size());
        //O tamanho continua 1. Se o segundo put tivesse criado um par novo, o tamanho seria 2.
        // Como não mudou, você prova que o put com uma chave que já existe troca o valor em vez de adicionar outro par.
        System.out.println();


        //3. Crie uma agenda (nome -> telefone) com duas pessoas.
        // Use containsKey dentro de um if para mostrar o telefone de alguém que está na agenda
        // e de alguém que não está.
        HashMap<String, String> agenda = new HashMap<>();
        //Os dois tipos são String: a chave é o nome e o valor é o telefone.
        // O telefone é String e não Integer porque tem espaço e hífen, e não vai ser usado em conta.
        agenda.put("Ana", "11 91234-5678");
        agenda.put("Bruno", "16 99876-5432");
        //Cada put cria um par: o primeiro valor é a chave (o nome) e o segundo é o valor (o telefone).
        String buscaPresente = "Ana";
        //buscaPresente é o nome que eu dei pra variável. Quer dizer "a busca de quem está presente na agenda".
        if (agenda.containsKey(buscaPresente)) {
            //containsKey("Ana") responde true ou false: "essa chave existe no mapa?".
            // Por isso entra direto no if, sem == true.
            System.out.println("Telefone da " + buscaPresente + ": " + agenda.get(buscaPresente));
            //1º: o Java resolve o get, que está dentro do parêntese. agenda.get(buscaPresente)
            //buscaPresente vale "Ana", então vira agenda.get("Ana").
            // O get procura a chave "Ana" na agenda e devolve o telefone dela: "11 91234-5678"
        } else {
            System.out.println(buscaPresente + " não está na agenda.");
            //Se não existir, o else avisa, e o get nem chega a rodar.
        }
        String buscaAusente = "Carla";
        if (agenda.containsKey(buscaAusente)) {
            System.out.println("Telefone da " + buscaAusente + ": " + agenda.get(buscaAusente));
        } else {
            System.out.println(buscaAusente + " não está na agenda.");
        }
        System.out.println();


        // 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
        //Use getOrDefault para mostrar a quantidade de um produto que existe
        //e de um que não existe (devolvendo 0). Depois tente com get normal
        //no que não existe e compare.
        HashMap<String, Integer> estoque = new HashMap<>();
        //A chave é o produto (String) e o valor é a quantidade (Integer).
        estoque.put("caneta", 20);
        estoque.put("caderno", 8);
        //cria o par objeto e valor
        System.out.println("Caneta: " + estoque.getOrDefault("caneta", 0));
        //O getOrDefault é um get com plano B.
        //O getOrDefault recebe dois valores: 1º valor (a chave): o que você quer procurar.
        //2º valor (o padrão): o que ele devolve se a chave não existir.
        //getOrDefault("caneta", 0) procura a chave "caneta". Se existir, devolve a quantidade dela.
        // Se não existir, devolve o valor padrão que você mandou, no caso 0.
        System.out.println("Lápis: " + estoque.getOrDefault("lápis", 0));
        //getOrDefault("lápis", 0) procura uma chave que não está no mapa, então cai no padrão e devolve 0.
        System.out.println("Lápis com get: " + estoque.get("lápis"));
        //get("lápis") é o get normal, e como a chave não existe, ele devolve null.
        System.out.println();
       // Resumindo em uma frase: getOrDefault é o get que, em vez de devolver null quando não acha,
        // devolve o valor que você escolheu.

        //5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
        //Remova uma delas e imprima de novo.
        HashMap<String, Double> notas = new HashMap<>();
        //A chave é o nome da aluna (String) e o valor é a nota (Double, porque tem casas decimais).
        notas.put("Ana", 8.5);
        notas.put("Bia", 7.0);
        notas.put("Carla", 9.5);
        //cria os pares nomes e notas
        System.out.println(notas);
        //mostra o mapa inteiro
        System.out.println("Tamanho: " + notas.size());
        //O size() mostra quantos pares tem: 3.
        notas.remove("Bia");
        //remove("Bia") remove o par pela chave, e não pela posição.
        // O mapa não tem posição, então você sempre diz o nome da chave.
        System.out.println(notas);
        System.out.println("Tamanho: " + notas.size());
        //Depois do remove, o segundo println mostra o mapa sem a Bia, e o size() cai pra 2.

    }

}
