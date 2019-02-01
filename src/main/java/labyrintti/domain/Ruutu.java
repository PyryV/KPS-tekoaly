package labyrintti.domain;

import java.util.ArrayList;

/**
 * Ruutu-olio kuvaa ruudukon yhtä ruutua ja kertoo mihin suuntiin ruudusta voi
 * mennä.
 */
public class Ruutu {
    private ArrayList<Ruutu> naapurit;
    private boolean kayty;
    private int id;
    private int x;
    private int y;

    public Ruutu(int id, int x, int y) {
        this.x = x;
        this.y = y;
        this.id = id;
        naapurit = new ArrayList<>();
        kayty = false;
    }

    public boolean onkoNaapuri(Ruutu ruutu) {
        if(naapurit.contains(ruutu)) {
            return true;
        }
        return false;
    }
    
    public void lisaaNaapuri(Ruutu ruutu) {
        naapurit.add(ruutu);
    }

    public boolean onkoKayty() {
        return kayty;
    }

    public void kay() {
        kayty = true;
    }

    public Integer getId() {
        return id;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

}


