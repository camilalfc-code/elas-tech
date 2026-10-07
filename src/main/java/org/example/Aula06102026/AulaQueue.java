package org.example.Aula06102026;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {

        /*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */

        static void main() {

            /*Aula

            ArrayDeque<String> fila = new ArrayDeque<>();

            fila.add("Camila");
            fila.add("Maria");
            fila.addAll(List.of("Jose","Antonio", "Josefa", "Pedro"));
            System.out.println(fila);
            System.out.println();

            System.out.println(fila.peek());
            //olha quem está na frente, sem tirar
            System.out.println();

            System.out.println(fila.poll());
            //tira quem está na frente
            //tira a Camila e mostra o nome
            System.out.println(fila);
            fila.poll();
            //tira a Maria, mas não mostra
            //o segundo poll() não tem println, então a Maria saiu da fila sem aparecer na tela.
            // Ela só some quando você imprime a fila no final. O poll() sempre tira,
            System.out.println(fila);


            ArrayList é uma lista com posições.
            Você pode pegar, trocar ou remover qualquer item pela posição (get(2), set(0, ...), remove(1)).

            ArrayDeque é uma fila em que você só mexe nas pontas.
            Não tem posição: você olha ou tira quem está na frente (peek(), poll()) e coloca no final (add).

            Pensa assim:
            o ArrayList é uma prateleira numerada, em que você pega o que quiser.
            O ArrayDeque é a fila do mercado, em que você só atende quem está na frente.
             */

            /*
            Atividade ArrayDeque
            1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
               e quantas pessoas tem.
            2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
               imprima a fila logo depois. Repare que ela não mudou.
            3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
               depois. Compare com o exercício 2.
            4. Crie uma fila com três nomes e atenda todos usando
               while (!fila.isEmpty()). No final, imprima "Fila vazia!".
            5. Crie uma fila com três nomes e use contains para responder duas
               perguntas: se "Bia" está na fila e se "Zoe" está.
            6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
               - se estiver vazia  -> "Não tem ninguém na fila."
               - se tiver gente    -> "Próximo: [nome]"
               Depois adicione uma pessoa e teste de novo.
             */


            //1. Crie uma fila e coloque três pessoas nela com add.
            // Imprima a fila e quantas pessoas tem.
            ArrayDeque<String> fila = new ArrayDeque<>();
            //ArrayDeque<String> é uma fila de textos
            fila.add("Ana");
            fila.add("Bruno");
            fila.add("Carla");
            //Cada add coloca uma pessoa no final da fila, na ordem em que chegam.
            System.out.println(fila);
            //println(fila) mostra a fila inteira, com quem chegou primeiro na frente.
            System.out.println("Pessoas na fila: " + fila.size());
            //size() diz quantas pessoas tem: 3.
            System.out.println();


            //2. Crie uma fila com addAll.
            // Use peek para mostrar quem é o próximo e imprima a fila logo depois.
            // Repare que ela não mudou.
            ArrayDeque<String> fila2 = new ArrayDeque<>();
            //Usei fila2 porque fila já existe nesse main (da questão 1).
            fila2.addAll(List.of("Ana", "Bruno", "Carla"));
            //addAll(List.of(...)) coloca as três pessoas de uma vez
            System.out.println("Próximo: " + fila2.peek());
            //peek() olha quem está na frente, sem tirar ele da fila. É só uma espiadinha.
            System.out.println("Fila: " + fila2);
            //O segundo println mostra a fila logo depois, e é aí que você repara que ela não mudou: a Ana continua lá.
            System.out.println();


            //3. Mesma fila.
            // Agora use poll para atender o primeiro e imprima a fila depois.
            // Compare com o exercício 2.
            System.out.println("Atendendo: " + fila2.poll());
            //poll() tira quem está na frente da fila e devolve o nome dele.
            // Como está dentro do println, o nome aparece na tela.
            System.out.println("Fila: " + fila2);
            //O segundo println mostra a fila logo depois, já sem a Ana.
            System.out.println();


            //4. Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()).
            // No final, imprima "Fila vazia!".
            ArrayDeque<String> fila4 = new ArrayDeque<>();
            //Usei fila4 porque fila e fila2 já existem nesse main
            fila4.addAll(List.of("Ana", "Bruno", "Carla"));
            while (!fila4.isEmpty()) {
                //fila4.isEmpty() responde true se a fila está vazia.
                //O ! na frente inverte: !fila4.isEmpty() quer dizer "a fila não está vazia"
                //Então o while lê assim: "enquanto a fila não estiver vazia, repete".
                System.out.println("Atendendo: " + fila4.poll());
                //A cada volta, o poll() tira a primeira pessoa e mostra o nome.
                // A fila vai diminuindo até esvaziar, e aí o while para sozinho.
            }
            System.out.println("Fila vazia!");
            //O println("Fila vazia!") fica fora do while, pra aparecer uma vez só, depois que todos foram atendidos.
            //Você não precisa de contador nem de i++. É a própria fila que controla quando o laço termina.
            System.out.println();


            //5. Crie uma fila com três nomes e use contains para responder duas
            //perguntas: se "Bia" está na fila e se "Zoe" está.
            ArrayDeque<String> fila5 = new ArrayDeque<>();
            //Usei fila5 porque as outras filas já existem
            fila5.addAll(List.of("Ana", "Bia", "Carla"));
            System.out.println("Bia está na fila? " + fila5.contains("Bia"));
            //contains("Bia") responde true ou false: "esse nome está na fila?
            System.out.println("Zoe está na fila? " + fila5.contains("Zoe"));
            //Como a Zoe não foi adicionada, o segundo contains devolve false.
            System.out.println();


            //6. Crie uma fila vazia.
            // Antes de usar o peek, teste com isEmpty():
            // se estiver vazia  -> "Não tem ninguém na fila."
            // se tiver gente    -> "Próximo: [nome]"
            // Depois adicione uma pessoa e teste de novo.
            ArrayDeque<String> fila6 = new ArrayDeque<>();
            //Usei fila6 porque as outras filas já existem
            //new ArrayDeque<>() cria a fila vazia, sem nenhum add antes.
            if (fila6.isEmpty()) {
                //O if (fila6.isEmpty()) testa antes de usar o peek,
                // Se estiver vazia, avisa. Senão, mostra quem é o próximo.
                System.out.println("Não tem ninguém na fila.");
            } else {
                System.out.println("Próximo: " + fila6.peek());
            }
            //O primeiro teste cai no if, porque a fila está vazia, e mostra Não tem ninguém na fila.
            fila6.add("Ana");
            //Depois o add("Ana") coloca uma pessoa
            if (fila6.isEmpty()) {
                System.out.println("Não tem ninguém na fila.");
            } else {
                System.out.println("Próximo: " + fila6.peek());
                // o segundo teste cai no else, e mostra Próximo: Ana.
            }
            System.out.println();
            //Por que testar antes do peek?
            // Numa fila vazia, o peek() devolve null (sem dar erro),
            // e a frase sairia Próximo: null.
            // Com o isEmpty() na frente, o programa responde com uma mensagem clara




        }

}
