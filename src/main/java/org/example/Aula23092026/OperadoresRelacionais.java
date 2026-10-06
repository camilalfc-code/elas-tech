package org.example.Aula23092026;

public class OperadoresRelacionais {
    public static void main(String[] args) {

    /*
    1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
- a = 10, b = 3
- a = 3, b = 10
- a = 5, b = 5
*/

// a = 10 e b = 3
        int a = 10;
        int b = 3;

        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

// a = 3 e b = 10
        a = 3;
        b = 10;

        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

// a = 5 e b = 5
        a = 5;
        b = 5;

        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));


/*
2- Exiba na tela  a == b, sendo a = 10 e b 3.
*/
        a = 10;
        b = 3;

        System.out.println(a == b);

/*
3- Exiba na tela a != b, sendo a = 10 e b = 3.
*/
        a = 10;
        b = 3;

        System.out.println(a != b);


/*
 4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
     */
        boolean chovendo = true;

        System.out.println(!chovendo);
    }
}
