package labyrintti.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class RuutuTest {

    @Test
    public void ruudunLuominenOnnistuu() {
        Ruutu ruutu = new Ruutu(2,3);
        
        assertTrue(ruutu.getUp());
        assertTrue(ruutu.getDown());
        assertTrue(ruutu.getLeft());
        assertTrue(ruutu.getRight());
    }

    @Test
    public void setBarrierToimii() {
        Ruutu ruutu = new Ruutu(4,5);

        assertTrue(ruutu.getUp());

        ruutu.setBarrier("up");
        ruutu.setBarrier("down");
        ruutu.setBarrier("left");
        ruutu.setBarrier("right");

        assertFalse(ruutu.getUp());
        assertFalse(ruutu.getDown());
        assertFalse(ruutu.getLeft());
        assertFalse(ruutu.getRight());

    }
}