package labyrintti.main;
import labyrintti.domain.Labyrintinluoja;
import labyrintti.domain.Ruutu;

public class Main {
    public static void main(String[] args) {
        //Ruutu ruutu1 = new Ruutu();
        Labyrintinluoja luoja = new Labyrintinluoja();

        //luoja.luo(5);
        //luoja.kayRuuduissa(0, 0);

        luoja.luoRuudut(2);
        luoja.tulostaRuudut();
        //luoja.labyrintti();

        //System.out.println(luoja.t());
    }
}