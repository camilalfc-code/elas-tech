package org.example.Aula13102026;

public class Abstracao {

    /*
    Abstração é mostrar só o que importa e esconder o resto.
    Em Java, ela aparece principalmente em dois jeitos: classes abstratas e interfaces.

    A ideia central: você define o que algo faz, sem dizer como faz.

    Pensa num controle remoto:
    você sabe que o botão “volume +” aumenta o volume,
    mas não precisa saber como a TV faz isso por dentro.

    Em código, é assim:

    Classe abstrata: um molde que não pode virar objeto direto.
    Ela serve de base pras classes filhas, e pode obrigar as filhas a implementar certos métodos.

    Método abstrato: só a assinatura, sem corpo.
    Fala “toda filha tem que fazer isso”, mas cada uma faz do seu jeito.

    Exemplo: todo Animal faz som, mas cada animal faz um som diferente.
    O Animal só diz “existe um fazerSom()”, e o Cachorro e o Gato dizem como.

    Um detalhe que ajuda a diferenciar do encapsulamento:
    encapsulamento protege os dados, e abstração simplifica mostrando só o essencial.
     */
}
