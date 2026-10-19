package org.example.Aula16102026;

public class AtividadeRevisao {

/*
Questão 1: Abstração

a) Explique, com suas palavras, o que é abstração em programação
orientada a objetos.
Abstração é mostrar o que é necessário e esconder o que não é necessário
pra quem usa.

b) Qual a diferença entre abstração e encapsulamento?
Abstração é mostrar só o que é necessário pra quem usa e esconder o resto,
simplificando.
Encapsulamento é proteger os dados, deixando-os privados e só acessíveis
por métodos controlados.

c) Quando você usa lista.add("Ana"), você sabe como o Java guarda esse
elemento na memória? Por que isso é um exemplo de abstração?
Não sei como o Java guarda a “Ana” na memória.
Isso é abstração porque o add mostra só o necessário (que a “Ana”
foi adicionada na lista) e esconde como isso é feito por dentro.
 */


/*
Questão 2: SOLID
Para cada código abaixo, diga qual princípio do SOLID está sendo
violado e explique como você corrigiria.
*/

/*
a)
java
class Relatorio {
void calcularTotais() {  }
void formatarEmPdf() {  }
void salvarNoDisco() {  }
void enviarPorEmail() {  }
}

É o S, Responsabilidade Única.
A classe Relatorio faz quatro coisas diferentes, e cada uma é um
motivo pra mexer nela.

Viola o S (Responsabilidade Única), porque a classe faz 4 coisas
diferentes. Eu criaria uma classe pra cada tarefa:
uma pra formatar em PDF,
uma pra salvar no disco e
uma pra enviar por e-mail,
e a Relatorio ficaria só com o cálculo dos totais.
*/


/*
b)
java
class EnviadorEmail {
void enviar(String tipo) {
if (tipo.equals("aniversario")) {
System.out.println("Feliz aniversário!");
} else if (tipo.equals("seguranca")) {
System.out.println("Alerta de segurança!");
} else if (tipo.equals("promocao")) {
System.out.println("Promoção imperdível!");
}
}
}
O, Aberto/Fechado.
Cada tipo novo de e-mail (tipo “boas-vindas”) obriga a abrir o
metodo e acrescentar mais um else if, mexendo num código que já
funcionava.
Viola o O (Aberto/Fechado), porque oda vez que surgir um e-mail novo
eu teria que mexer no que já existe.
Eu criaria uma interface só e uma classe pra cada tipo dos emails
 */


/*
c)
java
class PedidoService {
private MySQLRepositorio repo = new MySQLRepositorio();
void finalizar() {
repo.salvar();
}
}
Aqui o princípio violado é o D (Inversão de Dependência),
porque o PedidoService está amarrado ao MySQLRepositorio.
Viola o D, porque o PedidoService está preso ao MySQLRepositorio,
criando ele direto.
Eu criaria uma interface Repositorio e o PedidoService passaria a
receber ela de fora, em vez de criar.
*/


/*
Questão 4: Modificadores de acesso
Explique quem pode acessar um atributo ou metodo declarado
com cada modificador:

a) private
private é o modificador mais fechado:
só quem está dentro da própria classe enxerga.
É o diário trancado
Um atributo ou metodo private só pode ser acessado por quem esta
na propria classe

b) default (sem modificador)
Quem está dentro da mesma pasta → enxerga o default
Quem está em outra pasta → não enxerga
Um atributo ou metodo default só pode ser acessado por
quem está no mesmo package

c) protected
Quem está no mesmo package enxerga (igual ao default).
Quem está em outro package, mas é classe filha (herda com extends),
também enxerga.
Um atributo ou metodo protected pode ser acessado por quem está
no mesmo package e também por classes filhas

d) public
o public, que é o mais aberto de todos
Um atributo ou metodo public pode ser acessado por todos
qualquer classe, de qualquer package
*/

}
