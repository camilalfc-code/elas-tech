package org.example;

/*
Projeto 1 - Sistema de Restaurante
100 pontos


Projeto 1 — Sistema de Restaurante
Domi
O que éngo, 01/11, até 23h59

Você vai construir o sistema de um restaurante:
cardápio, pedidos, personalização dos lanches e fechamento do dia.

Construa uma parte de cada vez.

Se algo quebrar depois, você pode voltar para uma versão que estava funcionando.

Implemente frase a frase.
Não lembra como implementa uma coisa? Pega o código no slide ou com uma IA apenas daquilo, não da questão inteira.

Antes de tudo: cinco minutos hoje
Crie o projeto novo do jeito que você já sabe e copie o bloco do JUnit do pom.xml do projeto que a gente usou
na aula de testes.
Depois, escreva este teste em src/test/java e rode:
@Test
void doisMaisDoisSaoQuatro() {
assertEquals(4, 2 + 2);
}

Está tudo certo, pode começar e pode apagar esse teste.

Isso leva cinco minutos e evita que você descubra na sexta à noite que o JUnit não está respondendo.
Se precisar, o bloco do pom.xml é este (Coloque dentro de <dependencies> COLOQUE AQUI DENTRO</dependencies>):
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<version>5.10.2</version>
<scope>test</scope>
</dependency>

Os pacotes
Crie estes pacotes dentro do seu projeto.
Essa organização não é decoração: é como um projeto se organiza para que cada parte tenha uma responsabilidade.

Contém o Main, o MenuConsole e a RestauranteFacade. Use no Nível 1.
Contém Lanche, ItemCardapio, a factory e os adicionais. Use nos Níveis 1 e 2.
Contém Pedido e as classes relacionadas aos pedidos. Use no Nível 1.
Contém Caixa e Transacao. É opcional e será usado no bônus.
Contém validações e utilitários, caso você crie algum. É opcional.

o menu conversa com a pessoa.
A fachada coordena as operações.
As classes de negócio guardam os dados e fazem o trabalho que lhes cabe.

O Main não deve fazer cálculos, manipular diretamente as coleções do sistema ou imprimir mensagens para a pessoa.
Ele controla o fluxo principal e delega a interação ao MenuConsole.

O pacote financeiro só precisa existir quando você criar uma classe para colocar nele.
O Git não versiona pastas vazias, e isso é normal.

A RestauranteFacade fica em app por simplicidade.
Num sistema grande ela poderia ter um pacote próprio, mas, com esse tamanho de projeto, não compensa separar.

NÍVEL 1 — O restaurante abre

1.1 — A classe Lanche
Crie a classe Lanche no pacote cardapio.
Ela deve ter os atributos privados:
nome
preco
Crie o construtor:
public Lanche(String nome, double preco)
Crie getters e setters para os atributos.

O nome não pode ser nulo nem vazio.
O preço não pode ser negativo.
O construtor deve reutilizar os setters para aplicar as mesmas validações:
public Lanche(String nome, double preco) {
setNome(nome);
setPreco(preco);
}
Assim, a validação fica centralizada.
Se você criar um objeto pelo construtor ou alterar um atributo pelo setter, as regras continuam valendo.
Se um valor for inválido, lance uma exceção adequada, como IllegalArgumentException (Throw new IllegalArgumentException)

1.2 — A classe Pedido
Crie a classe Pedido no pacote pedido.
Cada pedido precisa ter:
Um número identificador (int)
O nome do cliente (String)
Uma lista de lanches (ArrayList<Lanche> itens)
E os métodos:
adicionarItem(Lanche lanche) — acrescenta um lanche na lista
getItens() — devolve a lista para quem for exibir
calcularTotal() — percorre a lista com um for somando os preços e devolve o double
⚠️ Valide o nome do cliente no construtor (ou no setter): não pode ser vazio.
Lance IllegalArgumentException se for null ou .trim().isEmpty().
💡 O Pedido não sabe quantos pedidos existem no restaurante, e não guarda um HashMap.
Ele cuida de uma comanda só. Quem guarda todos os pedidos é o GerenciadorPedidos, no item 1.3 — e é lá que está o
contador que gera o número.
💡 O número chega pronto pelo construtor. O Pedido não cria o próprio número:

public Pedido(int numero, String nomeCliente) {
this.numero = numero;
setNomeCliente(nomeCliente);
}

1.3 — O GerenciadorPedidos e o fechamento
Crie a classe GerenciadorPedidos no pacote pedido.
Ela é quem guarda todos os pedidos do restaurante — e por isso é uma classe separada do Pedido, que cuida de
uma comanda só. É o S do SOLID na prática: cada classe com uma responsabilidade.

Atributos:
private HashMap<Integer, Pedido> pedidos = new HashMap<>();
private int contadorPedidos = 1;

Métodos:
criarPedido(String nomeCliente) — gera o número, cria o Pedido, guarda no mapa e devolve o pedido criado
buscarPedido(int numero) — devolve o Pedido daquele número, ou null se não existir
getPedidos() — devolve a coleção de pedidos para quem for exibir
calcularTotalDoDia() — percorre todos os pedidos e soma o calcularTotal() de cada um
public Pedido criarPedido(String nomeCliente) {
Pedido novo = new Pedido(contadorPedidos, nomeCliente);
pedidos.put(novo.getNumero(), novo);
contadorPedidos++;
return novo;
}

💡 Pra somar todos os pedidos do dia: for (Pedido p : pedidos.values()).
💡 O GerenciadorPedidos não imprime nada. Ele devolve os pedidos; quem mostra na tela é o MenuConsole (item 1.4).

⚠️ Cuidado com o número do pedido no HashMap, e leia isto com atenção:
O HashMap não deixa dois pedidos terem o mesmo número — mas não é porque ele recusa. É porque ele substitui.
Por isso, nunca peça para o usuário digitar o número de um pedido novo no Scanner. Quem gera o número é o próprio GerenciadorPedidos, usando contadorPedidos++ toda vez que um pedido nasce. Assim a repetição nunca acontece ao criar!
Já quando o usuário quiser buscar um pedido existente pelo número, aí sim a pessoa digita o número e você pode usar pedidos.containsKey(numero) (ou checar se pedidos.get(numero) != null) para conferir se aquele pedido realmente existe antes de mexer nele.

1.4 — Menu principal e MenuConsole
Crie a classe MenuConsole no pacote app. Ela será responsável por conversar com a pessoa que está usando o sistema.
O menu principal tem as opções definidas no item 1.5. Aqui você cria a classe que sabe exibi-las e lê-las.

O MenuConsole deve cuidar da leitura das opções e dos dados digitados, além de exibir as mensagens e os resultados.
Você pode organizar a classe com métodos como:
exibirMenu()
lerOpcao()
 lerOpcaoLanche()
exibirPedido()
 exibirFechamentoDoDia()

Esses nomes são sugestões para organizar o código. Você pode usar outros nomes, desde que mantenha as
responsabilidades separadas.
O Main deve ficar responsável por iniciar o sistema e controlar o fluxo principal.
Ele não deve usar System.out.println() para exibir mensagens nem Scanner para ler dados diretamente.
Essa interação fica no MenuConsole.

1.5 — Criar pedidos e fechar o dia
No primeiro nível, os lanches podem ser criados diretamente na RestauranteFacade, com nome e preço definidos no código. O cardápio é:
X-Burger — R$ 16,00
X-Salada — R$ 18,00
X-Bacon — R$ 22,00
No Main, crie o loop while com switch-case contendo, no mínimo:
Text
=== RESTAURANTE ===
1 - Registrar novo pedido
2 - Listar pedidos do dia
3 - Fechar restaurante
0 - Sair

A leitura de cada dado e a exibição de cada mensagem ficam no MenuConsole (item 1.4);
o Main só chama os métodos dele e passa o resultado para a Facade.
Ao registrar um pedido, o MenuConsole pede o nome do cliente e o Main cria o pedido pela Facade.
Depois o MenuConsole pergunta qual lanche do cardápio a pessoa quer, e pergunta se ela quer adicionar mais um item,
até responder que não.

⚠️ Importante: crie um novo objeto Lanche a cada escolha de item do cardápio.
Não guarde um único objeto mutável para reutilizá-lo em todos os pedidos.
Nos próximos níveis o cliente poderá personalizar o lanche, e uma alteração em um pedido não pode modificar
outro pedido.

— o Main só recebe o double pronto e passa para o MenuConsole exibir:

// no Main
double total = sistema.calcularTotalDoDia();
menu.exibirFechamentoDoDia(total);

💡 O for que percorre os pedidos já está dentro do GerenciadorPedidos, no item 1.3.
Não repita essa lógica na Facade nem no Main.
Neste nível, o objetivo é ter um sistema funcional: escolher lanches, criar pedidos, calcular valores e fazer o
fechamento.


NÍVEL 2 — O cardápio ganha vida
2.1 — A interface ItemCardapio
No pacote cardapio, crie a interface:
public interface ItemCardapio {
String getDescricao();
double getPreco();
}
A classe Lanche deve implementar essa interface.
Agora faça uma mudança na classe Pedido: troque a lista de Lanche por:

private ArrayList<ItemCardapio> itens;

⚠️ Troque também o parâmetro do metodo adicionarItem: ele recebe ItemCardapio, não Lanche.
Sem isso, você não consegue adicionar um adicional ao pedido.

Porque, a partir daqui, um item do pedido pode ser um lanche puro ou um lanche com adicionais.
Os adicionais também implementarão ItemCardapio, mas não serão objetos da classe Lanche.
Ao usar a interface como tipo da lista, você pode guardar os dois tipos de objeto.
É a mesma ideia do Pet[] pets que vocês usaram para guardar objetos de Cachorro e Gato: a lista trabalha com um
tipo comum, e cada objeto mantém seu comportamento.

2.2 — LancheFactory
Crie a classe LancheFactory no pacote cardapio.
Ela será responsável por criar os lanches padrão do cardápio.
O restante do sistema deve pedir o lanche à factory, em vez de conhecer os detalhes de como ele é criado.

pão, hambúrguer, queijo, alface e tomate.
pão, hambúrguer, queijo, alface, tomate e cebola.
pão, hambúrguer, queijo, bacon, alface, tomate e cebola.
+ R$ 4,00.
+ R$ 6,00.
Os métodos da factory devem criar uma nova instância de Lanche a cada chamada.
Por exemplo, se duas pessoas pedirem X-Bacon, elas devem receber objetos diferentes.
Isso será importante quando implementarmos a personalização.

Os métodos podem ter nomes como:
LancheFactory.xBurger()
 LancheFactory.xSalada()
LancheFactory.xBacon()

💡 Depois de criar a Factory, volte na RestauranteFacade (item 1.5) e troque a criação direta dos
lanches pelas chamadas à LancheFactory. A Facade não deve mais saber como um lanche é construído.

2.3 — Adicionais com Decorator
Implemente pelo menos dois adicionais pagos, como:
ComCheddar: acrescenta R$ 4,00.
ComBaconExtra: acrescenta R$ 6,00.
Cada adicional deve implementar ItemCardapio, guardar dentro de si outro ItemCardapio e delegar a ele as
informações que não precisa alterar.
O adicional deve:
Acrescentar sua descrição à descrição do item que está embrulhando.
Somar seu preço ao preço do item que está embrulhando.
As descrições devem usar exatamente estes formatos:
+ cheddar
+ bacon extra
Com o espaço, o sinal de mais, o espaço e as letras minúsculas.

Exemplo:
ItemCardapio lanche = LancheFactory.xBacon();
lanche = new ComCheddar(lanche);
lanche = new ComBaconExtra(lanche);

A descrição final será:
X-Bacon + cheddar + bacon extra
E o preço será R$ 32,00.

Esse é o padrão Decorator: cada adicional envolve o item anterior e acrescenta uma responsabilidade sem
precisar alterar a classe do lanche.

2.4 — Dois testes com JUnit
Crie pelo menos dois testes em src/test/java.
Um deve testar uma validação, por exemplo, verificar que um preço negativo é recusado.
O outro deve testar o preço de um lanche com adicional.

Exemplo:
@Test
 void xBaconComCheddarCusta26() {
 ItemCardapio lanche = new ComCheddar(LancheFactory.xBacon());
 assertEquals(26.0, lanche.getPreco(), 0.001);
}

O 0.001 é a tolerância usada na comparação de valores double.
Como esses números são armazenados de forma aproximada, a tolerância evita que uma diferença minúscula de
representação faça um teste falhar.
Em sistemas financeiros reais, double não é a melhor escolha para representar dinheiro.
Para este projeto, use double com tolerância nos testes.

NÍVEL 3 — O restaurante fica profissional
3.1 — Personalizar o lanche
Agora o cliente poderá retirar ingredientes do lanche.
Retirar um ingrediente não muda o preço — o X-Bacon sem cebola custa os mesmos R$ 22,00.
Adicione na classe Lanche quatro atributos boolean, um para cada ingrediente que pode ser retirado:

private boolean queijo = true;
private boolean alface = true;
private boolean tomate = true;
private boolean cebola = true;

⚠️ A inicialização = true na declaração não é opcional. Em Java, um boolean sem valor inicial vira false — e o
lanche viria sem nada por padrão. Como o construtor do Nível 1 só recebe nome e preço,
esses quatro campos nascem com o valor escrito na declaração.

Crie getters e setters manuais para os quatro (sem validação: são booleanos).
No getDescricao(), use ifs para acrescentar ao texto o que estiver false:

@Override
public String getDescricao() {
String desc = nome;

if (!queijo) desc += " sem queijo";
if (!alface) desc += " sem alface";
if (!tomate) desc += " sem tomate";
if (!cebola) desc += " sem cebola";
return desc;
}

No menu, ao escolher um lanche, pergunte quais ingredientes a pessoa quer retirar e chame os setters
correspondentes antes de adicionar o item ao pedido:

Lanche lanche = LancheFactory.xBacon();
if (!querCebola) lanche.setCebola(false);
if (!querTomate) lanche.setTomate(false);

⚠️ Crie um objeto novo para cada item do pedido. Não guarde um lanche personalizado e reutilize em outro pedido —
a personalização de um pedido não pode afetar outro.
💡 Não precisa verificar se o lanche tinha aquele ingrediente originalmente.
Chamar setCebola(false) num X-Burger mostra “X-Burger sem cebola” normalmente, e o preço não muda.

3.2 — Modificar um pedido
Implemente a possibilidade de buscar um pedido pelo número e fazer alterações nele.
O sistema deve permitir:
Acrescentar um item.
Remover um item existente. Para isso, liste os itens numerados e permita que a pessoa escolha pelo número.
Cancelar o pedido inteiro. (Devem ser removidos do total)
Modificar um pedido não significa editar diretamente um lanche que já foi criado.
Por exemplo, se o cliente quiser trocar um X-Bacon por um X-Bacon sem cebola, remova o item anterior e acrescente
o novo item personalizado.
Isso mantém cada item do pedido independente e evita que a personalização de um lanche afete outros pedidos.
Lembre-se de que, depois de remover ou acrescentar itens, o total do pedido precisa refletir a lista atualizada.

3.3 — Quantas combinações diferentes saíram?
No fechamento do dia, além do total vendido, mostre quantas combinações diferentes foram pedidas e quais são elas.
Percorra os itens de todos os pedidos e coloque o resultado de getDescricao() em um:
HashSet<String>
O size() do conjunto informa quantas descrições diferentes foram encontradas.

Exemplo: se saíram vários pedidos e as combinações foram:
X-Bacon
X-Bacon + cheddar
X-Salada (sem tomate)
O resultado será três combinações diferentes.

, porque as descrições são diferentes. Isso é intencional: o objetivo é descobrir quais combinações os clientes pedem.
É a questão do HashSet que vocês já viram no Petshop, aplicada a outro contexto.

Uma pergunta para pensar
X-Bacon + cheddar + bacon extra e X-Bacon + bacon extra + cheddar têm os mesmos adicionais e o mesmo preço.
Porém, as descrições são textos diferentes, então o HashSet vai contar duas combinações.
A ordem dos adicionais deveria importar? Como você resolveria isso?
Você não precisa implementar uma solução para essa questão. Mas, se pensou sobre o problema, pode explicá-lo no
vídeo. Perceber uma limitação e saber discuti-la também faz parte de programar.

3.4 — Entrada inválida não quebra o sistema
Se a pessoa digitar uma letra onde era esperado um número, ou escolher uma opção que não existe no menu,
o sistema deve avisar e continuar funcionando.
Trate as exceções de entrada numérica, incluindo InputMismatchException, nos métodos do MenuConsole que leem números.
Não basta proteger apenas a opção do menu principal: qualquer leitura numérica relevante precisa ser tratada.
Depois de capturar uma entrada inválida, limpe o valor incorreto que ficou no Scanner. Caso contrário, o programa
pode entrar em um loop infinito.
Uma abordagem comum é consumir a linha inválida com:
sc.nextLine();
A leitura, a mensagem de erro e a nova tentativa devem ficar no MenuConsole. O Main não deve imprimir
mensagens diretamente.

VÍDEO
Grave um vídeo de , mostrando a tela. O objetivo é explicar o que você fez e demonstrar o sistema funcionando.
Mostre:O sistema rodando, com um pedido do começo ao fim.Como você organizou os pacotes e por quê.Um padrão de
projeto no seu código, explicando o problema que ele resolveu.Um teste rodando.
Não precisa ser bonito. Não precisa aparecer. Precisa ser você explicando o que fez.

BÔNUS
Os bônus são opcionais. Faça primeiro o que está nos níveis do projeto.
registre gorjetas e apresente um relatório no fechamento.
crie a classe no pacote financeiro, com uma responsabilidade definida. Por exemplo, guardar as transações do dia e
calcular o fechamento. Só deve existir um objeto Caixa no sistema.
crie a classe no pacote financeiro e implemente equals() e hashCode(). Cada pedido pago pode gerar uma transação
com o número do pedido e o valor. Você pode guardar as transações em um HashSet<Transacao> para evitar registros
duplicados, desde que defina corretamente quando duas transações são consideradas iguais.
escreva três testes além dos testes obrigatórios dos níveis anteriores. Eles devem cobrir funcionalidades ainda não
testadas, como o filtro de descrições repetidas, o cálculo do fechamento e o cancelamento de um pedido.
gere um arquivo executável para facilitar a demonstração do sistema.
além das combinações do item 3.3, mostre quantos lanches base diferentes saíram.
Por exemplo, X-Bacon e X-Bacon + cheddar contam como o mesmo lanche base.Dica: isso pode exigir um metodo adicional
na interface, como getNomeBase(). Cada adicional devolve o nome base do item que está embrulhando.
É um exemplo de Decorator delegando uma informação ao objeto interno.
Como entregarCrie um repositório com o projeto.Inclua um README.md dizendo o que você fez.
Coloque o link do vídeo no README.
Pode ser YouTube, Drive ou outro serviço que permita assistir.
Envie o link do repositório no canal até .
 */
