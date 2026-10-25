package org.example.Aula23102026;

public class Aula {
}

/*
Atividade Testes Unitários


1.(Cenário Real)
A equipe mexeu na classe CalculadoraFrete para adicionar entrega por
Drone, mas sem querer estragou o cálculo antigo do Sedex.
Qual é a principal vantagem de ter Testes Unitários nesse momento?
A) O teste unitário corrige o código do Sedex sozinho usando
Inteligência Artificial.
B) Correto - O teste apita Vermelho imediatamente na máquina da programadora
antes de o bug ir para o cliente (evitando regressão).
C) O teste substitui a necessidade de usar interfaces e princípios
S.O.L.I.D. no projeto.
D) O teste deixa o banco de dados do sistema duas vezes mais rápido.

2.
Olhando para a Pirâmide de Testes, por que os Testes Unitários
ficam na base (representando cerca de 70% dos testes de uma empresa)?
A) Porque eles testam a tela inteira clicando nos botões como um
humano.
B) Porque eles exigem que o banco de dados oficial esteja ligado.
C) Correto - Porque eles testam pequenas partes isoladas do código,
rodando em milissegundos e sendo muito mais baratos e fáceis de
manter.
D) Porque são feitos manualmente usando System.out.println no main.

/Quiz Rápido: Vamos testar o conhecimento? (2/3)/

3. No JUnit 5, nós organizamos nosso metodo de teste seguindo o
padrão AAA (Arrange, Act, Assert). O que fazemos na etapa "Assert"?
A) Damos new na classe que queremos testar e preparamos as variáveis.
B) Correta - Usamos os comandos do JUnit (como assertEquals ou assertTrue)
para verificar se o resultado obtido bateu com o esperado.
C) Apagamos os dados do banco de dados após o teste terminar.
D) Imprimimos o resultado no console com System.out.println
para conferir no olho.


4.
Qual comando do JUnit 5 você deve usar para garantir que o metodo
conta.sacar(-50.0) bloqueia a operação lançando uma exceção
(IllegalArgumentException)?
A) assertEquals(-50.0, conta.sacar(-50.0));
B) assertFalse(conta.sacar(-50.0));
C) assertNull(conta.sacar(-50.0));
D) Correto - assertThrows(IllegalArgumentException.class, () ->
conta.sacar(-50.0));

/Quiz Rápido: Vamos testar o conhecimento? (3/3)/

5.
No TDD (Test-Driven Development), trabalhamos no ciclo
Red ➡️ Green ➡️ Refactor.
O que significa a etapa "GREEN" (Verde)?
A) Escrever o teste primeiro e ver ele falhar porque a classe
ainda não existe.
B) Correto - Escrever o código mais simples e direto possível na
classe principal apenas para fazer o teste passar e ficar verde.
C) Limpar o código, tirar repetições e aplicar boas práticas sem
alterar o resultado.
D) Enviar o código direto para o servidor de produção sem testar.

6.
Responda:Na sinceridade:
Por que testar o sistema apenas dando System.out.println() dentro
do metodo main ("teste no olho") não funciona quando o projeto
cresce na empresa?
Detetive de Código:
Uma colega escreveu um metodo de teste perfeito com assertEquals,
clicou para rodar a classe de teste, mas o JUnit ignorou o metodo
dela completamente!
Qual anotação ela esqueceu de colocar em cima  do metodo?
Refatoração sem medo: No ciclo do TDD, por que a gente
só faz o Refactor (deixar o código bonito e limpo) depois que o
já ficou Verde?
Teste no olho (println no main):
você precisa rodar e conferir com os próprios olhos,
e ninguém garante que vai lembrar de olhar tudo de novo a cada
mudança.
Quando o projeto tem centenas de classes, isso fica impossível,
e os testes automáticos fazem essa conferência sozinhos e avisam
quando algo quebra.
Detetive de código: ela esqueceu a anotação @Test em cima do metodo.
Refactor só depois do verde: porque o teste verde é a sua rede de
segurança.
Se você limpar o código e quebrar algo sem querer, o teste fica
vermelho e avisa na hora.
Refatorar antes do verde é mexer sem rede.

/Atividade Prática:
Meu Primeiro TDD com JUnit 5/
Mão na massa: A Calculadora de Descontos
Vamos desenvolver uma classe CalculadoraDesconto usando os 3 passos
(AAA) do JUnit!
Regras de Negócio que nossa classe deve ter:
Metodo aplicarDesconto(double valorCompra, boolean clienteVip):
Se a compra for menor que R$ 100,00 e o cliente não for VIP,
não tem desconto (retorna o próprio valorCompra).
Se o cliente for VIP, ganha 10% de desconto em qualquer valor
(multiplica por 0.90).
Se o valorCompra passado for zero ou negativo (<= 0),
deve lançar um erro: IllegalArgumentException.

Sua Missão na classe CalculadoraDescontoTest:
Teste 1 (@Test): Prepare uma compra de R$ 50.0 para cliente comum
(false) e use assertEquals para garantir que retorna 50.0.
Teste 2 (@Test): Prepare uma compra de R$ 200.0 para cliente VIP
(true) e use assertEquals para garantir que retorna 180.0.
Teste 3 (@Test): Use assertThrows para garantir que passar -10.0
lança IllegalArgumentException!
 */