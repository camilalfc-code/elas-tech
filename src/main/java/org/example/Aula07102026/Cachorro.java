package org.example.Aula07102026;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}


//@Override
//O que ele quer dizer: “esse método não é novo, ele vem de fora (da interface)
// e eu estou escrevendo a versão da minha classe”.
// A palavra override é “sobrescrever”:
// você está escrevendo por cima do método que a interface só prometeu.
//Pra que serve: ele é um aviso pro Java conferir se o método realmente existe
// na interface. Se você errar o nome, o Java reclama na hora: