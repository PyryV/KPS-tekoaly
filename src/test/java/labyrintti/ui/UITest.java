package labyrintti.ui;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import labyrintti.domain.Labyrintinluoja;


public class UITest {
    public UI ui;
 
    @Before
    public void setUp() {
        Scanner scanner = new Scanner(System.in);
        Labyrintinluoja luoja = new Labyrintinluoja();
        ui = new UI(luoja, scanner);

    }

    @Test
    public void uiPiirtaaLabyrintinOikein() {
        ui.setKoko(12);
        ui.luo();
        assertEquals(1274, ui.piirra().length());
    }

    


}