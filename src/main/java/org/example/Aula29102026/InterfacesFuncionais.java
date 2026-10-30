package org.example.Aula29102026;

public class InterfacesFuncionais {
    public static void main(String[] args) {
        Runnable tarefa1 = () -> System.out.println("executando tarefa");
        tarefa1.run();
    }
}
