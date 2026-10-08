package org.example.Aula07102026;

public class Coelho implements Presa {
    //É o contrato.
    //O coelho aceita e cumpre o contrato.


    @Override
    public void fugir() {
        //Executa o jeito de fugir do objeto real.
        System.out.println("O Coelho foge correndo");

        //Coelho aceita o contrato de Presa.
        //Como Presa exige o método fugir(), Coelho precisa implementá-lo.
        //Todo animal presa deve ter uma forma de fugir.
    }
}
