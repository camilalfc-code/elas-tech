package org.example.Aula20102026.Interfaces;

//public class Main {

    //static void main() {
        //MySql mySql = new MySql();
        //MongoDb mongoDb = new MongoDb();
        //BancoDeDados oracle = new MongoDb();
        //mongoDb.pessoa = "";
        //BancoDeDados mongo = new MongoDb();
        //BancoDeDados outroBanco = new MongoDb();
        //conectarBanco(MySql);
    //}
    //public static void conectarBanco(BancoDeDados bd){
    //}

    //public static void main(String[] args) {
        //conectarBanco(new MySql());
        //conectarBanco(new Oracle());

        //System.out.println();
    //}

    //public static void conectarBanco(BancoDeDados banco) {
        //System.out.println(banco.chamarBanco());
       // System.out.println("Número do banco: " + banco.getNumero());
   // }

    public class Main {

        public static void main(String[] args) {

            Agendamento a = new Agendamento("Thor", "banho", "14h",
                    true, true, false, "alérgico a shampoo", 10.0);

            Agendamento b = new Agendamento("Luna", "tosa", "10h",
                    false, false, false, "", 0.0);

            Agendamento c = new Agendamento("Mel", "banho", "16h",
                    false, false, true, "", 0.0);

            a.mostrar();
            b.mostrar();
            c.mostrar();
        }
    }



/*
o conectarBanco() na Main
É o coração do exercício:
public static void conectarBanco(BancoDeDados banco)
O parâmetro é do tipo da interface, não de MySql nem de Oracle.
Então o metodo aceita qualquer objeto que tenha assinado o contrato.
Dentro dele, a gente só chama banco.chamarBanco() e banco.getNumero(),
sem saber (nem precisar saber) qual banco chegou.

o main chamando tudo
conectarBanco(new MySql());
conectarBanco(new Oracle());
Aqui a gente cria um objeto de cada banco e passa pro metodo.
Na hora que roda:
Entra o MySql: o Java executa o chamarBanco() da classe MySql
Entra o Oracle: o Java executa o chamarBanco() da classe Oracle
Mesma linha de código dentro do conectarBanco(), resultados diferentes.
Isso se chama polimorfismo: o comportamento muda conforme o objeto
que chegou.
*/