package labyrintti.domain;

import java.util.ArrayList;

/**
 * Ruutu-olio kuvaa ruudukon yhtä ruutua 
 * @param id;
 * @param x;
 * @param y;
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

    /**
     * Kertoo onko annettu ruutu tämän ruudun naapuri
     * @param ruutu
     * @return onko annettu ruutu tämän ruudun naapuri
     */
    public boolean onkoNaapuri(Ruutu ruutu) {
        if(naapurit.contains(ruutu)) {
            return true;
        }
        return false;
    }
    
    /**
     * Lisää ruudulle naapurin, joita ruudulla voi olla max 4
     * @param ruutu
     */
    public void lisaaNaapuri(Ruutu ruutu) {
        naapurit.add(ruutu);
    }

    /**
     * Kertoo onko ruudussa vielä käyty labyrintin muodostuksen aikana
     * @return palauttaa true jos on ja false jos ei ole käyty
     */
    public boolean onkoKayty() {
        return kayty;
    }

    /**
     * Merkkaa ruudun kayty-muuttujaan, että ruudussa on käyty
     */
    public void kay() {
        kayty = true;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}


