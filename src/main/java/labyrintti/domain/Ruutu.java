package labyrintti.domain;

/**
 * Ruutu-olio kuvaa ruudukon yhtä ruutua ja kertoo mihin suuntiin ruudusta voi mennä.
 */
public class Ruutu {
    
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    private int x;
    private int y;

    public Ruutu(int x, int y) {
        this.x = x;
        this.y = y;
        up = true;
        down = true;
        left = true;
        right = true;
    }

    public Ruutu(int x, int y, boolean up, boolean down, boolean left, boolean right) {
        this.x = x;
        this.y = y;
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public void setBarrier(String direction) {
        switch (direction) {
            case "up": up = false;
                        break;
            case "down": down = false;
                        break;
            case "left": left = false;
                        break;
            case "right": right = false;
                        break;
            default: break;                        
        }
    }

    public boolean getUp() {
        return up;
    }

    public boolean getDown() {
        return down;
    }

    public boolean getLeft() {
        return left;
    }

    public boolean getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "x:" + x + " y:" + y;
    }
}


