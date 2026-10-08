package org.example.Aula07102026;

public class Pombo implements Presa{
    //É o contrato.
    //O pombo aceita e cumpre o contrato.

    public void fugir () {
        //Executa o jeito de fugir do objeto real.
        System.out.println("Pega o Pombo");

        //Pombo aceita o contrato de Presa.
        //Como Presa exige o método fugir(), Pombo precisa implementá-lo.
        //Todo animal presa deve ter uma forma de fugir.
    }

}
