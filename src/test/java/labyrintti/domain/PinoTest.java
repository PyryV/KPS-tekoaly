package labyrintti.domain;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class PinoTest {
    private Pino pino;

    @Before
    public void setUp() {
        pino = new Pino();
    }

    @Test()
    public void pushToimii() {
        Ruutu r = new Ruutu(1, 1, 1);
        Ruutu a = new Ruutu(2,2,2);
        pino.push(r);
        pino.push(a);
        assertEquals(2, pino.peek().getId());
    }

    @Test()
    public void popToimii() {
        Ruutu r = new Ruutu(1, 1, 1);
        Ruutu a = new Ruutu(2,2,2);
        pino.push(r);
        pino.push(a);
        pino.pop();
        assertEquals(1, pino.peek().getId());
        pino.pop();
        assertTrue(pino.isEmpty());
    }

    //Travis ei saa alla olevia testejä läpi alle sekunnin 

    @Test //(timeout = 1000)
    public void pushToimiiIsoillaMaarilla() {
        for(int i=0; i<1000000; i++) {
            pino.push(new Ruutu(1,1,1));
        }
        pino.push(new  Ruutu(2,2,2));
        assertEquals(2, pino.peek().getId());
    }

    @Test //(timeout = 1000)
    public void popToimiiIsoillaMaarilla() {
        for(int i=0; i<1000000; i++) {
            pino.push(new Ruutu(1,1,1));
        }

        for(int i=0; i<1000000; i++) {
            pino.pop();
        }
        assertTrue(pino.isEmpty());
    }




}

