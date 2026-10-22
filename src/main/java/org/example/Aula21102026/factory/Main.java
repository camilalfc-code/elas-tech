package org.example.Aula21102026.factory;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = AnimalFactory.getAnimal("cachorro");
        Animal gato = AnimalFactory.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

        System.out.println();
    }
}

/*
Factory

Questão 1.
Explique com suas palavras qual problema o Factory resolve.
O que aconteceria se os ifs que decidem qual objeto criar ficassem
espalhados pelo main e por outras partes do programa, e depois
surgisse um tipo novo?
O Factory resolve o problema de ter a decisão de qual objeto
criar espalhada pelo programa.
Sem ele, se surgir um tipo novo, eu preciso mexer em todos os
lugares onde tem if, e se eu esquecer de um, aquele trecho não
reconhece o tipo novo e dá bug.
Com a fábrica, essa decisão fica em um lugar só,
então o tipo novo é adicionado uma vez e vale pra todos.


Questão 2.
O metodo da fábrica normalmente devolve o objeto criado com qual tipo?
• a) O tipo da classe concreta (ex.: Cachorro)
• b) O tipo da interface (ex.: Animal) - correto
A fábrica devolve o tipo da interface (Animal), não o da
classe concreta.
• c) String
• d) Não devolve nada (void)


Questão 3 (prática).
Implemente a interface e as classes abaixo:
public interface Animal {
    void emitirSom();
}
public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
Crie a classe AnimalFactory com um metodo getAnimal(String tipo):
• se o tipo for "cachorro", devolve um Cachorro;
• se o tipo for "gato", devolve um Gato.
No main, use a fábrica para criar um cachorro e um gato e chame
emitirSom() nos dois. O main não pode ter new Cachorro() nem new
Gato().
 */
