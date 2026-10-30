package org.example.Aula29102026;

public class InterfacesFuncionais {
    public static void main(String[] args) {
        Runnable tarefa1 = () -> System.out.println("executando tarefa");
        Runnable tarefa2 = () -> System.out.println("executando segunda tarefa");
        tarefa1.run();
        tarefa2.run();
        System.out.println();
    }
}

/*
() -> ... com parênteses vazios, porque Runnable não recebe nada.
Declarar a Runnable não executa nada. Quem dispara é o .run().
Chamar tarefa1.run() e depois tarefa2.run() executa as duas em sequência, como o enunciado pede.
O println() vazio no final é a linha em branco de sempre.
 */
