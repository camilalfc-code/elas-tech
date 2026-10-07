package org.example.Aula06102026;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AulaSets {

    static void main() {

        /*
        .add("Ana");
        .contains("Ana");
        .remove("Ana");
        .size();
        .isEmpty();
        .clear();
        new HashSet<>(lista);
        .addAll(List.of("Ana", "Bia", "Carla"));
        */

        //HashSet é uma collection que não aceita repetidos.
        // Se você tentar adicionar um valor que já está lá, ele simplesmente ignora.
        //O HashSet não guarda ordem e não tem posição

        /*
        Atividade HashSet
        1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
           repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
           com o repetido.
        2. Crie um HashSet de cores usando addAll. Depois use contains dentro
           de um if para avisar se a cor "verde" já está no conjunto ou não.
        3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
           tirar os repetidos. Imprima os dois e compare.
        4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
           imprima de novo, junto com o tamanho.
        5. Crie um HashSet com três frutas e percorra ele com for,
           imprimindo uma por linha.
        6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
           imprima o isEmpty() de novo.
         */

        // 1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido.
        // Imprima o conjunto e o tamanho.
        // Repare no que aconteceu com o repetido.
        HashSet<String> nomes = new HashSet<>();
        //HashSet<String> é um conjunto de textos. Diferente do mapa, ele guarda só valores, sem chave.
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Ana");
        //Foram quatro add, mas o "Ana" aparece duas vezes.
        System.out.println(nomes);
        System.out.println("Tamanho: " + nomes.size());
        //O HashSet não aceita repetidos: o segundo add("Ana") é simplesmente ignorado, sem erro.
        //Por isso o size() vai mostrar 3 e não 4.
        System.out.println();


        //2. Crie um HashSet de cores usando addAll.
        // Depois use contains dentro de um if para avisar se a cor "verde" já está no conjunto ou não.
        HashSet<String> cores = new HashSet<>();
        cores.addAll(List.of("azul", "vermelho", "verde", "amarelo"));
        //addAll(List.of(...)) adiciona várias cores de uma vez
        if (cores.contains("verde")) {
            //contains("verde") responde true ou false: "esse valor está no conjunto?".
            // Por isso entra direto no if, sem == true.
            System.out.println("A cor verde já está no conjunto.");
            //Como o "verde" está na lista, cai no if e mostra a primeira mensagem.
        } else {
            System.out.println("A cor verde não está no conjunto.");
        }
        System.out.println();


        //3. Crie um ArrayList com nomes repetidos.
        // Use new HashSet<>(lista) para tirar os repetidos.
        // Imprima os dois e compare
        ArrayList<String> lista = new ArrayList<>(List.of("Ana", "Bruno", "Ana", "Carla", "Bruno", "Ana"));
        //new ArrayList<>(List.of(...)) cria a lista já preenchida, com nomes repetidos de propósito.
        HashSet<String> semRepetidos = new HashSet<>(lista);
        //new HashSet<>(lista) cria um conjunto a partir da lista: ele copia os itens e, como não aceita repetidos,
        // os repetidos somem sozinhos
        System.out.println("Lista: " + lista);
        System.out.println("Conjunto: " + semRepetidos);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Tamanho do conjunto: " + semRepetidos.size());
        //A lista original não muda. O HashSet é uma cópia nova.
        //Os dois size() servem pra você comparar.
        System.out.println();

        //4. Crie um HashSet com três CPFs e imprima.
        // Depois remova um deles e imprima de novo, junto com o tamanho.
        HashSet<String> cpfs = new HashSet<>();
        //O CPF é String e não int, porque tem pontos e hífen, e não vai ser usado em conta.
        //um CPF não pode repetir, então o conjunto garante que cada um entra uma vez só.
        cpfs.add("111.111.111-11");
        cpfs.add("222.222.222-22");
        cpfs.add("333.333.333-33");
        System.out.println(cpfs);
        cpfs.remove("222.222.222-22");
        //remove("222.222.222-22") remove pelo valor.
        // O HashSet não tem posição, então você sempre diz qual valor quer tirar.
        System.out.println(cpfs);
        System.out.println("Tamanho: " + cpfs.size());
        //O primeiro println mostra os três, e o segundo mostra só dois, seguido do size(), que vai ser 2.
        System.out.println();

        //5. Crie um HashSet com três frutas e percorra ele com for,
        //imprimindo uma por linha.
        HashSet<String> frutas = new HashSet<>();
        //Cria o conjunto de frutas, vazio. O <String> diz que ele guarda textos.
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("uva");
        //Coloca as três frutas no conjunto, uma de cada vez.
        // O HashSet não guarda ordem, então ele não lembra qual entrou primeiro.
        Iterator<String> it = frutas.iterator();
        //Iterator<String> é o tipo do ponteiro.
        // O <String> diz que ele entrega textos.
        //it é o nome que você deu pra ele (de iterator).
        //frutas.iterator() cria o ponteiro já ligado ao conjunto frutas.
        // Ele começa antes do primeiro item, ainda sem apontar pra nenhuma fruta.
        for (String fruta : frutas) {
            //for: começa o laço
            //String fruta:	a variável da vez.
            // Ela é criada nova a cada volta,
            // e o String é o tipo dos itens (o mesmo do HashSet<String>)
            //:	lê-se "dentro de"
            //frutas: o conjunto que vai ser percorrido
            System.out.println(fruta);
        }
        System.out.println();


        //6. Crie um HashSet vazio. Imprima o isEmpty().
        // Adicione um valor e imprima o isEmpty() de novo.
        HashSet<String> vazio = new HashSet<>();
        //O new HashSet<>() cria o conjunto sem nenhum item.
        System.out.println("Está vazio? " + vazio.isEmpty());
        //isEmpty() responde true ou false: "o conjunto está vazio?".
        //O primeiro isEmpty() roda antes do add, então devolve true.
        vazio.add("Ana");
        System.out.println("Está vazio? " + vazio.isEmpty());
        //Depois o add("Ana") coloca um valor, e o segundo isEmpty() devolve false, porque agora tem um item.

    }
}
