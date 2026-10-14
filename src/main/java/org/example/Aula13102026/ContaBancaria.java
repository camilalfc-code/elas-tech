package org.example.Aula13102026;

public class ContaBancaria {
    private String titular;
    private double saldo;


    public String getTitular() {
        return titular;
    }
    //O get devolve o valor de um atributo private pra quem está de fora.
    //Como o titular está trancado, a Main não consegue fazer c.titular.
    // Mas ela pode pedir pro objeto: “me entrega o titular?”.
    // Quem responde é o getter
    //Linha por linha:
    //public: qualquer classe pode chamar.
    //String: o tipo do que ele devolve (igual ao tipo do titular).
    //getTitular(): o nome (por convenção, get + nome do atributo).
    //return titular;: entrega o valor guardado.


    public double getSaldo() {
        return saldo;
    }


    public void setTitular(String titular) {
        //O set faz o contrário do get: em vez de entregar o valor, ele recebe um valor novo
        // pra guardar no atributo private.
        // E, como é um método, pode conferir se o valor presta antes de aceitar.
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
        //O this.titular é o atributo da classe, e o titular sozinho é o parâmetro que chegou.
        // O this é o que separa um do outro.

        //Linha por linha:
        //void: não devolve nada, só executa (diferente do get, que devolve).
        //String titular entre parênteses: o valor novo que chegou de fora.
        //O if: se vier null ou vazio, avisa, mantém o que já estava e sai do método com o return.
        //this.titular = titular;: se passou no porteiro, guarda o valor novo.
    }

    //Resumindo: get = “me entrega o valor”, set = “guarda esse valor novo (se ele prestar)”.


    private void registrarLog(String acao) {
        System.out.println("[LOG] " + titular + ": " + acao);
    }
    //Esse é private porque quem usa a classe não precisa (nem deve) chamar o log diretamente.
    // Ele só serve pra uso interno.
    //métodos que fazem o trabalho sujo


    private boolean temSaldo(double valor) {
        return saldo >= valor;
    }
    //Ele devolve true se o saldo cobre o valor e false se não cobre.
    // Repare que o tipo de retorno é boolean, porque a resposta é sempre sim ou não.


    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        saldo += valor;
        registrarLog("deposito de " + valor);
    }
    //Repare que o depositar (público) chama o registrarLog (privado) por dentro.
    // Quem usa a classe só vê o depositar, e o log acontece escondido.


    public void sacar(double valor) {
        if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        registrarLog("saque de " + valor);
    }
    //O ! na frente do temSaldo significa “não”: o if lê como
    // “se NÃO tem saldo, avisa e sai”.
    // Aqui o sacar usa os dois privados, o temSaldo pra decidir e o registrarLog quando dá certo.
    //o registrarLog só anota o que aconteceu
    //O ponto principal está em duas outras linhas do depositar:
    //if (valor <= 0): confere se o valor presta antes de mexer.
    //saldo += valor;: o próprio método altera o saldo, de dentro da classe.
    //Ou seja, o saldo só muda por depositar() e sacar(), que passam pelas regras.
    // Se existisse um setSaldo() livre, qualquer um faria c.setSaldo(-5000)
    // e pularia todas as regras, igual na questão 1.
    // Sem o setter, o saldo só muda pelas portinhas certa


    private String numeroConta = "001-X";
    //Ele já nasce com valor fixo


    public String getNumeroConta() {
        return numeroConta;
    }
    //E não crie o setter, de propósito.
    // É isso que faz o número da conta poder ser lido, mas nunca alterado de fora


    /*
    por que o numeroConta tem getter mas não tem setter?
    pergunta era sobre o que falta: por que não tem setter?
    Porque o número da conta é um dado que pode ser lido, mas não deveria mudar depois que existe.
    Sem setter, ninguém de fora consegue trocar ele, nem por acidente.
    Pensa no seu CPF: qualquer um pode consultar, mas ninguém pode sair trocando o número dele.
     */

}
