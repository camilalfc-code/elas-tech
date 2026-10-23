package org.example.Aula22102026.decorator;

abstract class CafeDecorator implements Cafe {
    protected Cafe cafeEmbrulhado;


    public CafeDecorator(Cafe cafe) {
        this.cafeEmbrulhado = cafe;

    }
}
