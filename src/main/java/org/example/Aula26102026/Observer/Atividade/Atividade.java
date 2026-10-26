package org.example.Aula26102026.Observer.Atividade;

/*
Atividade Observer

Qual problema o padrão Observer resolve?
Ele resolve o problema de vários objetos precisarem saber quando
outro objeto muda, sem ficar perguntando toda hora e sem o objeto que
muda precisar conhecer cada um deles.

Dê um exemplo do dia a dia que funcione como ele.
Exemplo do dia a dia: inscritos de um canal do YouTube.
O canal posta vídeo novo e todo mundo que se inscreveu é avisado.
O canal não precisa saber quem são as pessoas nem o que cada uma vai
fazer com o aviso. Quem quer entra na lista, quem não quer sai.

No Observer, o que é o Subject  e o que é o Observer?
Como o Subject avisa os observadores sem conhecer as classes
concretas deles?
Subject: é o objeto que tem a informação que muda e avisa quem está
interessado.
Observer: é quem quer ser avisado quando o Subject muda.
Como avisa sem conhecer as classes concretas: o Subject guarda uma lista
da interface (não das classes) e só chama o atualizar de cada um.
Como todo mundo da lista implementa a interface, todo mundo tem esse
metodo.

Se você precisar adicionar um novo interessado, por exemplo um
Entregador que também precisa saber quando o pedido muda de status,
o que é preciso alterar na classe Pedido? Por quê?
Nada precisa ser alterado na classe Pedido.
Basta criar a classe Entregador implementando a interface do observador
e adicioná-lo na lista do Pedido.
Isso funciona porque o Pedido só conhece a interface, e não as classes
concretas

A interface já está pronta:
public interface ObservadorVoo {
void atualizar(String status);

}

a) Crie uma classe Passageiro que implementa ObservadorVoo e,
no atualizar, imprime "Passageiro avisado: " + o status.

b) Crie uma classe Voo com uma lista de ObservadorVoo, um metodo
adicionarObservador(ObservadorVoo o) e um metodo mudarStatus(String status),
que chama o atualizar de todos da lista.

c) No main, crie um voo, adicione um passageiro e mude o status para
"Embarque iniciado".

Crie uma classe PainelAeroporto que também implementa ObservadorVoo
e imprime "Painel: " + o status.
No main, adicione ao voo um passageiro um painel, e mude o status
para "Atrasado". Os dois devem ser avisados.

Agora monte o mesmo padrão do zero, com outro tema:

a) Crie uma interface ObservadorEstoque com o metodo void atualizar
(int quantidade).

b) Crie uma classe RegistroEstoque que implementa a interface e imprime
 "Nova quantidade: " + a quantidade.

c) Crie uma classe Estoque com uma lista de observadores, um metodo
adicionarObservador e um metodo setQuantidade(int quantidade),
que avisa todos da lista.

d) No main, adicione um RegistroEstoque e mude a quantidade duas vezes.
 */
