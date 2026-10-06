package org.example.Aula05102026;

import java.util.HashMap;

public class AulaHashMap {
    static void main() {

        /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        //HashMap em Java é uma estrutura de dados que armazena informações no formato chave → valor.

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Ane", "ane@gmail.com");
        //"Ane" é a chave (key);
        //"ane@gmail.com" é o valor (value).
        emails.put("Paloma", "paloma@gmail.com");
        emails.put("posicao2", "qualquer coisa");

        System.out.println(emails.get("Ane"));
        //chama o nome e ele entrega o conteudo
        System.out.println(emails.get ("posicao2"));
        System.out.println(emails.get ("Paloma"));

        System.out.println(emails.get("Ola"));
        //não existe Ola por isso retorna null




    }



}
