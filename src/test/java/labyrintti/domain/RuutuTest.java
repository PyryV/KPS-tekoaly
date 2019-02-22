package labyrintti.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RuutuTest {

    private Ruutu ruutu;

    @Before
    public void setUp() {
        ruutu = new Ruutu(12, 35, 42);
    }

    @Test
    public void ruutuLuodaanOikein() {
        assertEquals(false, ruutu.onkoKayty());
        assertEquals(12, ruutu.getId());
        assertEquals(35, ruutu.getX());
        assertEquals(42, ruutu.getY());
    }

    @Test
    public void ruudussaKayminenToimii() {
        assertEquals(false, ruutu.onkoKayty());
        ruutu.kay();
        assertEquals(true, ruutu.onkoKayty());
    }

    @Test
    public void naapurinLisaaminenToimii() {
        Ruutu r1 = new Ruutu(1,1,1);

        assertEquals(false, ruutu.onkoNaapuri(r1));
        ruutu.lisaaNaapuri(r1);
        assertEquals(true, ruutu.onkoNaapuri(r1));
    }
}