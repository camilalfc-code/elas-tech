package org.example.Aula29102026;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Random;

public class Aula {

    public static void main(String[] args) {
        Supplier<String> aviso = () -> "Aviso: O sistema está online!";
        System.out.println(aviso.get());
    }


}
