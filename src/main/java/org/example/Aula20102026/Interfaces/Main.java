package org.example.Aula20102026.Interfaces;

    public class Main {

        public static void main(String[] args) {

            Agendamento a = Agendamento.builder()
                    .nomePet("Thor")
                    .servico("banho")
                    .horario("14h")
                    .perfume(true)
                    .laco(true)
                    .observacao("alérgico a shampoo")
                    .desconto(10.0)
                    .build();

            Agendamento b = Agendamento.builder()
                    .nomePet("Luna")
                    .servico("tosa")
                    .horario("10h")
                    .build();

            Agendamento c = Agendamento.builder()
                    .nomePet("Mel")
                    .servico("banho")
                    .horario("16h")
                    .hidratacao(true)
                    .build();

            a.mostrar();
            b.mostrar();
            c.mostrar();
        }
    }

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