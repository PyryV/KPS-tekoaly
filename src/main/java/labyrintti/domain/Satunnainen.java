package labyrintti.domain;

public class Satunnainen {
    public int getLuku() {
        int s = (int) (System.nanoTime() % 4);
        return s;
    }
}