package org.example.Aula16102026;

public class Desenvolvedor extends Funcionario {

    //Etapa 3. Crie duas classes que herdam de Funcionario:
    //Desenvolvedor: o salário é o salário base mais 20%. ( salario = salarioBase + (salarioBase * 0.20) ou
    //salario = salarioBase * 1.20
    //)

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    //O super(nome, salarioBase) entrega os dois valores pra Funcionario
    // guardar, igual ao super(nome) do Retangulo.
    // Como o Desenvolvedor não tem atributo próprio, o construtor só
    // repassa.

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.20;
    }
    //Repara que a gente usou o getSalarioBase() e não salarioBase direto.
    // Lembra do aviso? O atributo é private na Funcionario,
    // então o Desenvolvedor não enxerga ele e precisa pedir pelo getter.
    //A conta é o salário base mais 20%, que é o mesmo que multiplicar por 1.20.
}
