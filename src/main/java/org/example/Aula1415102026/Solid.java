package org.example.Aula1415102026;

public class Solid {

    /*
    S - Single Responsibility Principle (Princípio da Responsabilidade Única)
    O - Open/Closed Principle (Princípio do Aberto/Fechado)
    L - Liskov Substitution Principle (Princípio da Substituição de Liskov)
    I - Interface Segregation Principle (Princípio da Segregação de Interfaces)
    D - Dependency Inversion Principle (Princípio da Inversão de Dependência)

    Cada letra é um princípio:
    S: cada classe cuida de uma coisa só.
    O: dá pra adicionar funcionalidade nova sem mexer no que já funciona.
    L: uma classe filha tem que poder substituir a classe mãe sem quebrar nada.
    I: é melhor várias interfaces pequenas do que uma gigante.
    D: depender de abstrações (interfaces), não de classes concretas.

    S, Responsabilidade Única: cada classe deve ter um único motivo pra mudar,
    ou seja, cuidar de uma coisa só.
    Pensa numa prefeitura: o setor de compras não faz o trabalho do RH, e cada setor cuida da sua área.

    O, Aberto/Fechado: a classe deve ficar aberta pra extensão (dá pra acrescentar coisa nova)
    e fechada pra modificação (você não precisa mexer no código que já funciona).
    Quando surgir o cliente “premium”, você é obrigado a abrir esse método e mexer nele,
    e pode quebrar o que já funcionava
    Agora, pro cliente “premium”, você só cria uma classe nova e não encosta em nada do que já existia.
    Pensa numa tomada: pra ligar um aparelho novo, você não abre a parede, só pluga na tomada que já existe
    Na versão com interface, você só cria uma classe nova e não encosta em nada do que já existia.
    Esse é o “fechado pra modificação, aberto pra extensão”.

    L, Substituição de Liskov: uma classe filha tem que poder ocupar o lugar da classe mãe
    sem quebrar o programa. Se a mãe promete algo, a filha não pode descumprir a promessa.
    Pensa numa tomada: um plugue de qualquer aparelho tem que encaixar nela e funcionar,
    senão o aparelho não deveria dizer que é “compatível”.

    I, Segregação de Interfaces: é melhor ter várias interfaces pequenas e específicas
    do que uma gigante que obriga a classe a implementar o que ela não usa.
    Lembra que uma classe pode implementar várias interfaces ao mesmo tempo? É aqui que isso ajuda
    Pensa no seu RH: o cargo de analista não recebe uma lista com as tarefas de todos os cargos
    da prefeitura, só as do cargo dele
    A solução é separar em interfaces pequenas, e cada classe assina só o que faz sentido.

    D, Inversão de Dependência: uma classe deve depender de abstrações (interfaces),
    e não de classes concretas. Assim, dá pra trocar uma peça por outra sem mexer na classe que a usa.
    Pensa no carregador de celular: o aparelho depende da tomada (a abstração),
    não de uma usina específica. Não importa de onde vem a energia, ele funciona igual


    Aplicar no Projeto PetShop - 15/10/2026

     */
}
