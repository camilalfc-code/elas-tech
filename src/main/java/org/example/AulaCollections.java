package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulaCollections {
    static void main() {

        /*.add();
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .addAll(List.of());*/

        /*Exemplo

        ArrayList <Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(10);
        lista.add(100);
        System.out.println(lista);
        //tem que add um de cada vez

        lista.add (3,50);
        //add na posiçao 3 o valor 50
        System.out.println(lista);

        lista.addAll(List.of(1,6,58,89));
        //add todos em um comando so
        System.out.println(lista);

        lista.remove(1);
        //remove da lista a posição escolhida, no caso coloquei o 1 que é o numero 10
        System.out.println(lista);

        System.out.println(lista.get(3));
        // get é pra acessar

        lista.set(0,98);
        // modifica a posição
        System.out.println(lista);

        System.out.println(lista.size());
        //mostra o tamanho

        System.out.println(lista.contains(5));
        //mostra se contem esse numero na lista, o valor do numero e nao a posição

        System.out.println(lista.indexOf(58));
        //mostra em que posição esta o numero 58

        System.out.println(lista.isEmpty());
        //pergunta se a lista esta vazia
        */


        //Exercicios
        /*
        Atividade ArrayList
        - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        - Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        - Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        - Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        - Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
        (Dica: i + ": " + comando para pegar posição da lista)
        - Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição.
        Se não estiver, avise.

        Referência:
        nomes.add("Carla");          // adiciona no fim
        nomes.get(0);                // pega pela posição
        nomes.size();                // quantos tem
        nomes.set(0, "Zoe");         // troca o valor da posição
        nomes.remove(1);             // remove pela posição
        nomes.contains("Ana");       // true ou false
        nomes.indexOf("Bia");        // em que posição está
        nomes.isEmpty();             // true se está vazia
         */

        //Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        System.out.println(nomes);
        System.out.println();


        //Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        ArrayList<String> frutas = new ArrayList<>(List.of("Maçã", "Banana", "Uva", "Laranja"));
        //new ArrayList<>(List.of(...)) cria a lista já preenchida, com as quatro frutas de uma vez.
        //É o mesmo List.of que você usou no addAll na aula.
        System.out.println("Primeira: " + frutas.get(0));
        System.out.println("Última: " + frutas.get(frutas.size() - 1));
        //Pra pegar a última sem precisar contar, usa frutas.size() - 1.
        //O size() é 4, mas a última posição é 3, porque começa do zero.
        //É o mesmo raciocínio do nomes.length - 1 nos arrays.
        System.out.println("Quantidade: " + frutas.size());
        System.out.println();


        //Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        ArrayList<String> nomesTroca = new ArrayList<>(List.of("Ana", "Bruno", "Carla", "Diego"));
        System.out.println("Antes: " + nomesTroca);
        nomesTroca.set(2, "Elisa");
        System.out.println("Depois: " + nomesTroca);
        System.out.println();


        //Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        ArrayList<String> cidades = new ArrayList<>(List.of("Araraquara", "São Carlos", "Campinas", "Santos"));
        System.out.println(cidades);
        cidades.remove(1);
        System.out.println("Sobraram: " + cidades.size());
        System.out.println(cidades);
        System.out.println();


        //Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
        // (Dica: i + ": " + comando para pegar posição da lista)
        ArrayList<String> seisNomes = new ArrayList<>(List.of("Ana", "Bruno", "Carla", "Diego", "Elisa", "Fábio"));
        for (int i = 0; i < seisNomes.size(); i++) {
            System.out.println(i + ": " + seisNomes.get(i));
        }
        System.out.println();
        //O for percorre as posições da lista, igual nos arrays, mas agora com size() no lugar do length:
        //int i = 0; começa na posição 0.
        //i < seisNomes.size(); repete enquanto i for menor que o tamanho da lista (6).
        //i++ avança uma posição por volta.
        //seisNomes.get(i) pega o nome da posição i, que é o comando para pegar posição da lista que a dica fala.
        //i + ": " + ... junta o número da posição, o ": " e o nome, formando 0: Ana.
        // O i é um int e o ": " é um texto, e o + junta os dois sem problema.


        //Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição.
        // Se não estiver, avise.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cincoNomes = new ArrayList<>(List.of("Ana", "Bruno", "Carla", "Diego", "Elisa"));
        System.out.print("Digite um nome: ");
        String busca = scanner.nextLine();
        if (cincoNomes.contains(busca)) {
            //contains(busca) responde true ou false: "esse nome está na lista?".
            // Por isso ele entra direto no if, sem == true.
            System.out.println(busca + " está na lista, na posição " + cincoNomes.indexOf(busca));
            //indexOf(busca) devolve a posição do nome.
            // Só faz sentido usar depois de saber que ele existe, e por isso ele fica dentro do if.
        } else {
            //Se o nome não estiver na lista, o indexOf devolveria -1, mas o else já avisa antes disso.
            System.out.println("Esse nome não está na lista.");
        }


    }
}
