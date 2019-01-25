package labyrintti.domain;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class LabyrintinluojaTest {

    @Test
    public void ruudukonLuonti() {
        Labyrintinluoja luoja = new Labyrintinluoja();
        Random r = new Random();
        int t = r.nextInt(100);
        luoja.luoRuudut(t);

        assertEquals("x:" + (t-1) + " y:" + (t-1), luoja.getRuudut()[(t*t)-1].toString());
    }
}