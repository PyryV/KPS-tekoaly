package labyrintti.ui;

import java.util.Scanner;

import labyrintti.domain.Labyrintinluoja;
import labyrintti.domain.Ruutu;

public class UI {
    private int koko;
    private Labyrintinluoja luoja;
    private Scanner scanner;


    public UI(Labyrintinluoja luoja, Scanner scanner) {
        this.luoja = luoja;
        this.scanner = scanner;
    }

    public void kaynnista() {
         
        setKoko(scanner.nextInt());
        scanner.close();
        long time1 = System.currentTimeMillis();
        luo();
        long time2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Aikaa meni: " + (time2-time1) + "ms");
    }
    
    public void setKoko(int koko) {
        this.koko = koko;
    }

    public void luo() {
        luoja.luo(koko);
        System.out.print(piirra());
    }
    
    /**
     * Luo labyrintistä tulostettavan merkkijonon
     * @return labyrintti-merkkijono
     */
    public String piirra() {
        Ruutu[][] ruudut = luoja.getRuudut();
        boolean[][] taytetaan = new boolean[koko+koko-1][koko+koko-1];
        for(int i = 0; i<ruudut.length; i++) {
            for(int j = 0; j<ruudut.length; j++) {

                if(j <ruudut.length-1) {
                    if(ruudut[j][i].onkoNaapuri(ruudut[j+1][i])) {
                        if(meneekoYli(j+j+1, i+i)) taytetaan[j+j+1][i+i]=true;
                    }
                    
                }
                if(i < ruudut.length-1) {
                    if(ruudut[j][i].onkoNaapuri(ruudut[j][i+1])) {
                        if(meneekoYli(j+j, i+i+1)) taytetaan[j+j][i+i+1]=true;
                    }
                }
                taytetaan[j+j][i+i] = true;
            }
        }
        String labyrintti = "";
        System.out.println();
        for(int i=0; i<koko+koko+1; i++) {
            labyrintti += "XX";
        }
        
        labyrintti += "\n";
        for(int i=0; i<koko+koko-1; i++) {
            for(int j=0; j<koko+koko-1; j++) {
                    if(taytetaan[j][i]) {
                        if(j+1>=koko+koko-1) {
                            labyrintti += "  XX\n";
                        } else if (j-1<0) {
                            labyrintti += "XX  ";
                        } else {
                            labyrintti += "  ";
                        }
                    } else if(j+1>=koko+koko-1){
                        labyrintti += "XXXX\n";
                    } else if(j-1<0){
                        labyrintti += "XXXX";
                    } else {
                        labyrintti += "XX";
                    }
            }
        }
        for(int i=0; i<koko+koko+1; i++) {
            labyrintti += "XX";
        }
        
        return labyrintti;
    }

    public boolean meneekoYli(int x, int y) {
        if(x>koko+koko-1 || y>koko+koko-1) return false;
        return true; 
    }

}