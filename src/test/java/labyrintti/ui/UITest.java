package labyrintti.ui;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UITest {
    public UI ui;

    @Before
    public void setUp() {
        ui = new UI();
    }

    @Test
    public void uiPiirtaaLabyrintinOikein() {
        ui.setKoko(12);
        ui.luo();
        assertEquals(1274, ui.piirra().length());
    }

    


}