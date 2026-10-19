package org.example.Aula16102026;

public class TesteSingleton {

    private static TesteSingleton instancia;

    private TesteSingleton(){

    }

    public static TesteSingleton getInstancia(){
        if (instancia == null){
            instancia = new TesteSingleton();
        }
        return instancia;
    }

    /*
    TesteSingleton instancia: é uma variável que guarda o único
    objeto dessa classe. Ela é o “cofre” onde a instância única
    mora.

    static: faz a variável pertencer à classe, e não a um objeto.
    Isso é essencial: pra criar um objeto você precisaria de um
    objeto antes, e o static quebra esse ciclo. Existe uma só
    instancia, compartilhada por todo o programa.

    private: ninguém de fora mexe direto nela. Só a própria classe
    decide quando ela é preenchida.

    Sem valor inicial: quando o programa começa, instancia vale
    null, ou seja, o objeto ainda não foi criado.

    Aí entra o getInstancia():
    1ª chamada: instancia é null, então cria o objeto e guarda nela.
    Da 2ª em diante: instancia já tem objeto, então pula o if e
    devolve o mesmo de sempre.

    Por isso o construtor é private: ninguém consegue dar new
    TesteSingleton() por fora, só passando pelo getInstancia().

     */



    /*
    Crie um atributo private static do tipo da própria classe.
    É onde o objeto único fica guardado. Começa como null.
    Deixe o construtor private. Assim ninguém consegue usar new
    fora da classe.
    Crie um método public static de acesso, geralmente chamado
    getInstancia().
    Dentro dele, crie o objeto só se ainda não existir
    (if (instancia == null)).
    Retorne sempre o mesmo objeto.
    Acesse sempre pelo nome da classe: Classe.getInstancia(),
    nunca com new.
     */

}
