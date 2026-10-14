package org.example.Aula13102026;

public class AulaEncapsulamento {
    static void main() {

        ContaBancaria c = new ContaBancaria();

        //System.out.println(c.titular);
        //c.saldo = -5000;

        //o private fazendo o trabalho dele: o Java está dizendo “você não tem permissão
        // pra mexer em titular e saldo aqui de fora

        //error: titular has private access in ContaBancaria
        //error: saldo has private access in ContaBancaria



        //System.out.println("Titular: " + c.getTitular());
        //System.out.println("Saldo: " + c.getSaldo());

        //Titular: null
        //Saldo: 0.0

        //E repara no que a atividade comentou: o objeto existe, mas está vazio.
        // O null e o 0.0 são os valores que o Java coloca sozinho quando você dá new


        //c.setTitular("");
        //System.out.println("Titular: " + c.getTitular());        //
        //c.setTitular("Ana");
        //System.out.println("Titular: " + c.getTitular());
        //System.out.println();

        //Titular inválido! Mantido null
        //Titular: null
        //Titular: Ana

        //O porteiro barrou o "" e manteve o null


        //c.setTitular("Ana");        //
        //c.depositar(500);
        //System.out.println("Saldo: " + c.getSaldo());        //
        //c.depositar(-100);
        //c.sacar(2000);        //
        //c.sacar(200);
        //System.out.println("Saldo: " + c.getSaldo());
        //System.out.println();

        //O setTitular("Ana") no começo é importante, senão o log sai com null no lugar do nome.

        //[LOG] Ana: deposito de 500.0
        //Saldo: 500.0
        //Valor inválido!
        //Saldo insuficiente!
        //[LOG] Ana: saque de 200.0
        //Saldo: 300.0

        //repara que o depositar e o sacar fizeram o trabalho sujo sozinhos, usando o
        // temSaldo e o registrarLog por baixo dos panos.

        //c.registrarLog("teste");
        //registrarLog(String) has private access in ContaBancaria
        //Quem usa a sua classe vê só depositar() e sacar(), e o resto é maquinário interno


        //Produto p = new Produto();        //
        //System.out.println(p.nome);
        //System.out.println(p.preco);
        //System.out.println();

        //Caneta
        //5.5

        //Os dois funcionaram, como esperado.
        // No mesmo package, o default (sem nada) e o public se comportam igual.

        //System.out.println(p.codigoInterno);
        //codigoInterno has private access in Produto

        //Resumindo: nome (default) e preco (public) funcionaram, e codigoInterno (private) deu erro.
        // A diferença entre default e public só aparece quando você sai do package.


        //System.out.println("Numero da conta: " + c.getNumeroConta());
        //System.out.println();

        //Numero da conta: 001-X
        //o número da conta pode ser lido

        //c.setNumeroConta("999-Z");
        //cannot find symbol: method setNumeroConta(String)
        //Ou seja, o método nem existe, porque a gente escolheu não criar o setter.


        System.out.println("Numero da conta: " + c.getNumeroConta());
                System.out.println();

    }

    /*
    Encapsulamento é trancar os dados da classe (private) e
    deixar só umas portinhas controladas (métodos public) pra mexer neles.
    Hoje, na ContaBancaria:
    saldo é private, então ninguém faz c.saldo = -5000.
    depositar() e sacar() são as portinhas, e elas conferem as regras antes de mexer no saldo.
    temSaldo() e registrarLog() são private porque são só maquinário interno.
    numeroConta tem getter e não tem setter, então dá pra ler, mas não dá pra mudar.
     */



    /*
    Encapsulamento é proteger os dados de uma classe e deixar o acesso a eles só por “portas controladas”.
    Na prática, são duas coisas juntas:
    Os atributos ficam private (ninguém de fora mexe direto).
    Você cria métodos public (os famosos getters e setters) pra ler e alterar esses atributos,
    com as regras que você quiser.

    Pensa no caixa eletrônico: você não enfia a mão no cofre do banco e pega o dinheiro.
    Você passa pelo caixa, que confere sua senha e seu saldo antes de liberar.
    O cofre é o private, o caixa é o método public.
     */



}
