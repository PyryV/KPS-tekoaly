package labyrintti.domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LabyrintinluojaTest {
    public Labyrintinluoja l;
    

    @Before
    public void setUp() {
        l = new Labyrintinluoja();
    }

    @Test
    public void ruutujenLuominenOnnistuu() {
        l.setKoko(100);
        l.luoRuudut();
        assertEquals(100, l.getRuudut().length);
    }

    @Test
    public void labyrintinLuominenOnnistuu() {
        l.luo(25);
        int n = 24;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                assertTrue(l.getRuudut()[j][i].onkoKayty());
            }
        }

        l.luo(100);
        n = 99;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                assertTrue(l.getRuudut()[j][i].onkoKayty());
            }
        }

    }
}