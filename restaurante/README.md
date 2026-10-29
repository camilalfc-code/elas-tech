# Projeto 1 - Sistema de Restaurante

Sistema de restaurante em Java, feito no console: cardápio, pedidos, personalização dos lanches e fechamento do dia.

## O que o sistema faz

- Registrar pedidos com vários itens
- Personalizar o lanche (retirar queijo, alface, tomate ou cebola)
- Acrescentar adicionais pagos (cheddar e bacon extra)
- Modificar um pedido: acrescentar item, remover item ou cancelar o pedido
- Listar os pedidos do dia
- Fechar o restaurante: total vendido e combinações diferentes pedidas
- Entrada inválida não quebra o sistema

## Organização dos pacotes

- `app`: Main, MenuConsole e RestauranteFacade
- `cardapio`: Lanche, ItemCardapio, LancheFactory e os adicionais
- `pedido`: Pedido e GerenciadorPedidos

## Padrões de projeto

- **Factory:** LancheFactory
- **Decorator:** ComCheddar e ComBaconExtra
- **Facade:** RestauranteFacade

## Testes

Testes com JUnit 5 em `src/test/java`.

## Vídeo

(link do vídeo aqui)