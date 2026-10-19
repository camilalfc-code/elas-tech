package org.example.Aula16102026;

public class Exercicio5 {
    static void main() {

        //c) No main, crie um Retangulo, chame exibirNome() e imprima a área.
        Retangulo r = new Retangulo("Retângulo", 5, 3);

        r.exibirNome();
        System.out.println("Área: " + r.calcularArea());
        System.out.println();

        //Repara que o exibirNome() você não escreveu no Retangulo:
        // ele veio de herança, da Forma


        //d) Agora tente escrever Forma f = new Forma("teste");.
        // O que acontece? Por quê?
        //Forma f = new Forma("teste");
        //fica vermelho
        //'Forma' is abstract; cannot be instantiated
        //“Forma é abstrata, não pode ser instanciada
        // (não dá pra criar objeto com new)
        //Pensa no metodo calcularArea() da Forma:
        // ele não tem corpo, não diz como calcular nada.
        //Se o Java deixasse criar uma Forma direto e você chamasse
        // f.calcularArea(), o que ele ia calcular?
        // Não teria conta nenhuma pra fazer

    }





/*
Questão 5: Classe abstrata
a) Crie uma classe abstrata Forma com:
um atributo nome;
um construtor que recebe o nome;
um metodo normal exibirNome(), que imprime o nome da forma;
um metodo abstrato calcularArea(), que retorna um double.

b) Crie uma classe Retangulo que herda de Forma,
tem os atributos largura e altura, e implementa calcularArea().

c) No main, crie um Retangulo, chame exibirNome() e imprima a área.

d) Agora tente escrever Forma f = new Forma("teste");. O que acontece?
Por quê?
*/

}
