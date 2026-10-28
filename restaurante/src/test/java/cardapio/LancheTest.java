package cardapio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LancheTest {

    @Test
    void precoNegativoERecusado() {
        assertThrows(IllegalArgumentException.class, () -> new Lanche("X-Burger", -5.00));
    }

    @Test
    void xBaconComCheddarCusta26() {
        ItemCardapio lanche = new ComCheddar(LancheFactory.xBacon());
        assertEquals(26.0, lanche.getPreco(), 0.001);
    }

}
