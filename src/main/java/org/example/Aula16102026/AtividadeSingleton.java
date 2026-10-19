package org.example.Aula16102026;

public class AtividadeSingleton {

/*
1. O que o padrão Singleton garante?
    a) Que a classe tenha vários construtores
    b) Que exista apenas um objeto da classe no programa (correto)
    c) Que a classe não tenha atributos
    d) Que a classe possa ser herdada
*/

/*
2. Por que o construtor de um Singleton é private?
Deixei o construtor private pra bloquear o new nas outras classes.
Se qualquer um pudesse criar objeto, deixava de ser Singleton.
Então o acesso fica só pelo getInstancia(), que sempre devolve a mesma instância.
 */

/*
3. Complete a lacuna:
    java
    private ______ Configuracao instancia;
    a) final
    b) public
    c) static (correto)
    d) void
*/

/*
4. O que acontece se alguém tentar escrever isto fora da classe?
    java
    Configuracao c = new Configuracao();

    dá erro de compilação, porque o construtor é private e só pode ser chamado de dentro da própria classe.
    Fora dela, o acesso tem que ser pelo getInstancia().
 */

/*
5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
    a) new Configuracao()
    b) Configuracao.getInstancia() - (correto)
    c) Configuracao.instancia
    d) this.getInstancia()
*/


}
