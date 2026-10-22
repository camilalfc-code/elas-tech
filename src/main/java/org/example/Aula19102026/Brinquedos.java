package org.example.Aula19102026;

public class Brinquedos {

    String nome;

    public String verBrinquedo(Brinquedos brinquedo) {
    //o metodo verBrinquedo, dentro da classe Brinquedos.
    //Ele recebe uma instância de Brinquedos como parâmetro e
    // imprime o nome dela.
    //a ordem é modificador → tipo de retorno → nome.
    //public: quem pode usar o metodo (vem primeiro)
    //String: o que ele devolve (no caso, nome)
    //verBrinquedo: o nome
    //Dentro do parêntese tem duas palavras, sempre nessa ordem:
    //tipo e depois nome.
    //Brinquedos: o tipo do dado que o metodo aceita (a classe, o molde).
    // Está dizendo “eu só aceito um objeto feito com o molde Brinquedos”.
    //brinquedo: o nome que o metodo dá pra esse objeto só dentro dele.
    // É como um apelido temporário.
        return "O brinquedo escolhido foi: " + brinquedo.nome;
    }

    int soma(int n1, int n2){
        return n1+n2;
    }

    public Brinquedos(String nome) {
        this.nome = nome;
    }
}
