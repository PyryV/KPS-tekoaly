
package labyrintti.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Labyrintinluoja {
    private int koko;
    private Ruutu[] ruudut;
    private boolean[] kaydyt;
    private int maara = 1;
    private ArrayList<Integer> pino;
    private Random random;
    private int laskin;

    public void luo(int koko) {
        this.koko = koko;
        ruudut = new Ruutu[koko^2];
        kaydyt = new boolean[koko];
        random = new Random();
        laskin = 0;
        taytaTaulukko();
    }

    private void taytaTaulukko() {
        int a = 0;
        for(int i = 0; i<koko; i++) {
            for(int z = 0; z<koko; z++) {
                //ruudut[i][z] = a;
                a++;  
            } 
        }
        
    }
    
    public void tulostaRuudut() {
        for(int i=0; i<koko*koko; i++) {
            System.out.println(ruudut[i].toString());
        }
    }

    public void kayRuuduissa(int x, int y) {
        if(x==koko-1 && y==koko) {
            return;
        }    
        if(y>koko-1) {
            y=0;
            x++;
        }

        //System.out.println(ruudut[x][y]);
        kayRuuduissa(x, y+1);

    }

    public void luoRuudut(int koko) {
        this.koko = koko;
        ruudut = new Ruutu[koko*koko];
        int a = 0;
        for(int y=0; y<koko; y++) {
            for(int x=0; x<koko; x++){
                if(x==0) {
                    if(y==0){
                        ruudut[a] = new Ruutu(x,y,false,true,false,true);
                    }else if(y==koko-1){
                        ruudut[a] = new Ruutu(x,y,true,false,false,true);
                    }else{
                        ruudut[a] = new Ruutu(x,y,true,true,false,true);
                    }
                }else if(x==koko-1) {
                    if(y==0){
                        ruudut[a] = new Ruutu(x,y,false,true,true,false);
                    }else if(y==koko-1){
                        ruudut[a] = new Ruutu(x,y,true,false,true,false);
                    }else{
                        ruudut[a] = new Ruutu(x,y,true,true,true,false);
                    }
                }else if(y==0) {
                    ruudut[a] = new Ruutu(x,y,false,true,true,true);
                }else if(y==koko-1) {
                    ruudut[a] = new Ruutu(x,y,true,false,true,true);
                }else{
                    ruudut[a] = new Ruutu(x,y);
                }
                System.out.println(a);
                a++;
            }
        }
    }

    
    
    public void labyrintti() {
        pino = new ArrayList<>();
    }
    































    /*
    public void kayRuuduissa2(int x, int y) {
        System.out.println("nyt ollaan: " + ruudut[x][y] );
            ArrayList<Integer> vapaat = vapaatRuudut(x, y);
            if(vapaat.isEmpty()) {
                pino.remove(pino.size()-1);
                return;
            }
            int nro = vapaat.get(random.nextInt(vapaat.size()));

            if(nro == 0) {
                kayRuuduissa2(x, y--);
                lisaaPinoon(x, y--);
            } else if(nro == 1) {
                kayRuuduissa2(x, y++);
                lisaaPinoon(x, y++);
            } else if(nro == 2) {
                kayRuuduissa2(x--, y);
                lisaaPinoon(x--, y);
            } else if (nro == 3) {
                kayRuuduissa2(x++, y);
                lisaaPinoon(x++, y);
            }
            
            kaydyt[ruudut[x][y]] = true;
            laskin++;
            System.out.println(ruudut[x][y]);
            System.out.println();
            
        
        


    }

    public void lisaaPinoon(int x, int y) {
        pino.add(ruudut[x][y]);
        kaydyt[ruudut[x][y]] = true;
    }

    public ArrayList<Integer> vapaatRuudut(int x, int y) {
        ArrayList<Integer> vapaat = new ArrayList<>();

        //Voiko mennä ylös
        if(!(y-1<0 || kaydyt[ruudut[x][y-1]] )) {
            vapaat.add(0);
        }

        //Voiko mennä alas
        if(!(y+1>koko-1 || kaydyt[ruudut[x][y+1]] )) {
            vapaat.add(1);
        }

        //Voiko mennä vasemmalle
        if(!(x-1<0 || kaydyt[ruudut[x-1][y]] )) {
            vapaat.add(2);
        }

        //Voiko mennä oikealle
        if(!(x+1<koko-1 || kaydyt[ruudut[x+1][y]] )) {
            vapaat.add(3);
        }

        return vapaat;
    }

    public boolean t() {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.remove(a.size()-1);
        a.remove(a.size()-1);
        
        

        return a.isEmpty();
    }
*/


}