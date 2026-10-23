package org.example.Aula22102026;

public class Aula {
}

/*
/*
Questão 1.
Uma açaiteria vende açaí com qualquer combinação de adicionais:
granola, leite ninho, morango, paçoca.
Por que criar uma classe para cada combinação
(AcaiComGranola, AcaiComGranolaEMorango, AcaiComMorangoEPacoca...)
é um problema? O que o Decorator faz no lugar?
Criar uma classe para cada combinação gera uma explosão de classes.
Com 4 adicionais, já são 15 combinações possíveis (e mais se a ordem
ou a quantidade importar). Se entrar um adicional novo, como banana,
o número de classes praticamente dobra. Além disso, o código fica
repetido e difícil de manter: mudar o preço da granola significaria
mexer em várias classes.
O Decorator resolve isso criando uma classe por adicional
(Granola, Morango, LeiteNinho, Paçoca) que “embrulha” um açaí já
existente. Cada adicional acrescenta sua descrição e seu preço ao
que ele embrulha, e as combinações são montadas em tempo de execução,
empilhando um embrulho dentro do outro.

Questão 2.
Em um Decorator, por que a classe AcaiDecorator tem implements Acai?
a) Para poder ser criada com new
b) Para que um adicional também conte como açaí e possa ir dentro
de outro adicional
Para que um adicional também conte como açaí e possa ir dentro de
outro adicional.
Como AcaiDecorator implementa Acai, um decorator é, ele mesmo,
um Acai. Por isso ele pode ser passado no construtor de outro
decorator, formando a cadeia (morango embrulhando granola
embrulhando açaí simples).
c) Para herdar o preço do açaí simples
d) Para não precisar usar o super

Questão 3 (prática).
O seu sistema já tem esta interface e estas duas classes:
public interface Acai {
    String getDescricao();
    double getPreco();
}

public class AcaiSimples implements Acai {
    public String getDescricao() {
        return "Açaí Simples";
    }

    public double getPreco() {
        return 12.00;
    }
}

public abstract class AcaiDecorator implements Acai {
    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }
}

No main:
Crie um açaí só com granola e imprima a descrição e o preço.
Crie um açaí com granola e morango (um adicional embrulhando o outro)
e imprima a descrição e o preço.
 */
