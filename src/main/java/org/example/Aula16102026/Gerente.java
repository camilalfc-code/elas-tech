package org.example.Aula16102026;

public class Gerente extends Funcionario {

    //Gerente: o salário é o salário base mais 50%. (
    //salario = salarioBase + (salarioBase * 0.50)
    // ou salario = salarioBase * 1.50 )

    public Gerente(String nome, double salarioBase) {
            super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.50;
    }
}
