package labyrintti.domain;

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

    public boolean up() {
        return up;
    }

    public boolean down() {
        return down;
    }

    public boolean left() {
        return left;
    }

    public boolean right() {
        return right;
    }

    @Override
    public String toString() {
        return "x:" + x + " y:" + y;
    }
}


