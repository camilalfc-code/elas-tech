package org.example.Aula07102026;

import java.util.ArrayList;
import java.util.List;

public class AulaForEach {
    static void main() {

    /*
    For each
    A diferença principal é que o for tradicional dá mais controle sobre o índice e o avanço,
    enquanto o for-each percorre diretamente cada elemento da coleção ou array.
    Use o for-each quando só precisa ler os elementos
    Use o for tradicional quando precisa da posição ou quer alterar elementos pelo índice
    No for-each, a variável representa o elemento atual, não a posição
     */


   /*Aula

        ArrayList<String> animais = new ArrayList<>(
                List.of("Macaco", "Leão", "Guaxinim")
        );

        for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));
        }

        for (String animal : animais) {
            System.out.println(animal);
        }
*/

        /*
        Atividade For Each
        1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
           um por linha.
        2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
           todas e mostrar a soma e a média.
        4. Com um array de nomes, use for-each e um if para contar quantos
           têm mais de 5 letras. Mostre o total. Dica: usem o método length.
        5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
           usando o índice. Deixe os dois na mesma classe e compare.
          Referência:
        For-each:
        for (tipo apelido : coleção) {
         }
        Array normal:
        String[] nomeDoArray = {"Ana", "Maria"};
        ArrayList:
        ArrayList<String> lista = new ArrayList<>();
         */


        //1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
        //um por linha.
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego"};
        //String[] nomes = {...} é o array normal que o enunciado pede, com 4 nomes entre chaves.
        for (String nome : nomes) {
            //O for-each lê assim: “para cada nome (um String) dentro de nomes, mostra o nome”.
            //A variável nome é o “apelido” da referência: a cada volta ela guarda um item do array, do primeiro ao último.
            System.out.println(nome);
        }
        System.out.println();


        //2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        ArrayList<Double> notas = new ArrayList<>();
        //O ArrayList<Double> guarda números com casas decimais.
        // Lembra que a lista não aceita double puro entre < e >, então vai Double com maiúscula.
        notas.add(8.5);
        notas.add(6.0);
        notas.add(10.0);
        notas.add(7.5);
        notas.add(9.0);
        for (double nota : notas) {
            //O for-each percorre uma lista em vez de um array.
            // A variável é double nota, com minúscula, porque o Java converte o Double da lista pra double sozinho.
            System.out.println(nota);
        }
        System.out.println();


        //3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
        //todas e mostrar a soma e a média.
        int[] notasArray = {8, 6, 10, 7};
        int soma = 0;
        //int soma = 0; fica antes do for-each, o “carrinho vazio” que vai enchendo.
        for (int nota : notasArray) {
            soma += nota;
            //A cada volta, soma += nota; adiciona a nota da vez.
            // O for-each entrega cada nota direto, sem notasArray[i].
        }
        double media = (double) soma / notasArray.length;
        //A média usa notasArray.length, que é o tamanho do array (4).
        // O for-each não tem contador, então o length é quem diz quantas notas tem.
        //O (double) na frente do soma faz a divisão dar um número com vírgula.
        // Sem ele, o Java cortaria a parte decimal.
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f%n", media);
        System.out.println();


        //4. Com um array de nomes, use for-each e um if para contar quantos
        //têm mais de 5 letras. Mostre o total. Dica: usem o método length.
        String[] listaNomes = {"Ana", "Fernanda", "Bruno", "Gabriela", "Léo"};
        int total = 0;
        //int total = 0; fica antes do for-each. É o “placar” que começa zerado.
        for (String nome : listaNomes) {
            //A cada volta, o if olha o nome da vez: nome.length() devolve quantas letras ele tem
                if (nome.length() > 5) {
                total++;
                //Se for maior que 5, o total++ soma 1 no placar.
                }
        }
        System.out.println("Nomes com mais de 5 letras: " + total);
        System.out.println();


        //5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
        //usando o índice. Deixe os dois na mesma classe e compare.
        System.out.println("Com for normal:");
        for (int i = 0; i < nomes.length; i++) {
            //int i = 0; começa na posição 0, a primeira.
            //i < nomes.length; repete enquanto i for menor que o tamanho do array (4).
            //i++ avança uma posição por volta.
            System.out.println(nomes[i]);
            //nomes[i] pega o nome da posição i
        }
        /*
                        For-each	                        for normal
        Código	        for (String nome : nomes)	    for (int i = 0; i < nomes.length; i++)
        Pegar o item	nome (direto)	                nomes[i] (pela posição)
        Contador        i	                            não tem
        Resultado	os mesmos 4 nomes	                os mesmos 4 nomes
         */
    }
}
