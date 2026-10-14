package org.example.Aula13102026;

public class ModificadoresDeAcesso {

    /*
    A ideia central: eles controlam quem pode enxergar uma classe, um atributo ou um método.
    São quatro no Java:
    public: qualquer classe, de qualquer lugar, enxerga.
    protected: enxerga quem está no mesmo package ou quem herda (classe filha).
    (sem nada, o “default”): só enxerga quem está no mesmo package.
    private: só a própria classe enxerga. É o mais fechadinho.
     */

    /*
    Atividade Encapsulamento
    ATIVIDADE - Encapsulamento e Modificadores de Acesso

    Referência geral:
    class Coisa {
    private String atributo;          // fechado pra fora

    public String getAtributo() {     // getter: devolve
        return atributo;
    }
    public void setAtributo(String atributo) {   // setter: recebe
        this.atributo = atributo;     // this: qual é qual
    }
    }

    1. (sentir o private na pele)
   Crie a classe ContaBancaria com os atributos titular (String) e
   saldo (double), os DOIS private.
   Na Main, crie uma conta e tente fazer estas duas linhas:
   System.out.println(c.titular);
   c.saldo = -5000;
   Rode e LEIA o erro.
   Saída esperada:
   error: titular has private access in ContaBancaria
   error: saldo has private access in ContaBancaria
    Agora a classe está fechada demais — não dá pra fazer nada
      com ela. As próximas questões abrem as portas, uma por uma.


    2. (abrir a porta de leitura)
   Crie um getter para cada atributo.
   Na Main, apague as duas linhas que davam erro e mostre o titular
   e o saldo usando os getters.
   Saída esperada:
   Titular: null
   Saldo: 0.0
    Olha o que apareceu. O objeto existe, mas está VAZIO — ninguém
      preencheu nada ainda. O null e o 0.0 são os valores que o Java
      coloca sozinho quando você dá new.
    No IntelliJ: alt + insert (ou Cmd + N no Mac) -> Getter. Mas
      escreva o primeiro na mão, pra ver como ele é por dentro.

    3. (a porta de escrita, com porteiro)
   Crie um setter para o titular que RECUSA valor vazio. Se vier
   vazio, avisa e mantém o que já estava.
   Na Main, chame ele duas vezes: uma com "" e uma com "Ana".
   Mostre o titular depois de cada uma.
   Saída esperada:
   Titular inválido! Mantido null
   Titular: Ana
   Referência:
   public void setAtributo(String atributo) {
       if (atributo == null || atributo.isEmpty()) {
           System.out.println("Inválido! Mantido " + this.atributo);
           return;
       }
       this.atributo = atributo;
   }
    O return sozinho sai do método na hora, sem fazer o resto.
    Compare com a questão 1: lá, c.saldo = -5000 passava direto.
      Aqui o objeto conferiu antes de aceitar.


    4. (métodos que fazem o trabalho sujo)
   Crie na ContaBancaria:
   PÚBLICOS:
   - depositar(double valor)   -> recusa valor menor ou igual a zero
   - sacar(double valor)       -> recusa se não tiver saldo
   PRIVADOS:
   - temSaldo(double valor)    -> devolve true ou false
   - registrarLog(String acao) -> imprime "[LOG] Ana: saque de 200.0"
   O sacar() usa o temSaldo() pra decidir, e os dois chamam o
   registrarLog() quando dá certo.
   Na Main: deposite 500, tente depositar -100, tente sacar 2000,
   saque 200.
   Saída esperada:
   [LOG] Ana: deposito de 500.0
   Saldo: 500.0
   Valor inválido!
   Saldo insuficiente!
   [LOG] Ana: saque de 200.0
   Saldo: 300.0
   Depois tente chamar c.registrarLog("teste") lá da Main:
   error: registrarLog(String) has private access in ContaBancaria
    Quem usa a sua classe vê só depositar() e sacar(). O resto é
      maquinário interno e nem aparece no autocompletar.


    5. (os modificadores lado a lado)
   Crie a classe Produto com TRÊS atributos, cada um com um
   modificador diferente:
   private String codigoInterno = "X-99";
   String nome = "Caneta";            // sem modificador: default
   public double preco = 5.50;
   Na Main (mesmo package), tente imprimir os três.
   Quais funcionaram? Qual deu erro?
   Saída esperada:
   Caneta
   5.5
   error: codigoInterno has private access in Produto
    No MESMO package, default e public se comportam igual. A
      diferença entre eles só aparece quando você sai do package.


    6. (nem todo atributo precisa de setter)
   Na ContaBancaria, acrescente o atributo numeroConta, private,
   já com um valor fixo:
   private String numeroConta = "001-X";
   Crie o GETTER dele. NÃO crie o setter.
   Na Main, mostre o número da conta. Depois tente mudar ele:
   c.setNumeroConta("999-Z");
   Saída esperada:
   Numero da conta: 001-X
   error: cannot find symbol
     symbol:   method setNumeroConta(String)
    Getter e setter não são um par obrigatório. Número de conta,
      CPF e data de cadastro são informações que podem ser LIDAS,
      mas não deveriam mudar depois. Você decide isso simplesmente
      não escrevendo o setter.
     */

}
