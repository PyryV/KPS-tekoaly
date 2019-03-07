package labyrintti.domain;

/**
 * Luokka, joka huolehtii koko labyrintin luonnista
 */
public class Labyrintinluoja {
    private Ruutu[][] ruudut;
    private int koko;
    private int x;
    private int y;
    private long time1;
    private long time2;
    private long time3;

    public Ruutu[][] luo(int koko) {
        this.koko = koko;
        time1 = System.currentTimeMillis();
        luoRuudut();
        time2 = System.currentTimeMillis();
        muodostaLabyrintti();
        time3 = System.currentTimeMillis();
        return ruudut;
    }

    /**
     * Luo ruudukon johon labyrintti muodostetaan
     */
    public void luoRuudut() {
        ruudut = new Ruutu[koko][koko];
        int id = 0;
        for(int i = 0; i<koko; i++) {
            for(int j = 0; j<koko; j++) {
                ruudut[j][i] = new Ruutu(id, j, i);
                id++;
            }
        }
    }

    /**
     * Muodostaa labyrintin tekemällä aiemmin luoduista ruuduista puun
     */
    public void muodostaLabyrintti() {
        Satunnainen satunnainen = new Satunnainen();
        int suunta;
        Pino pino = new Pino();
        setRuutu(0,0);
        ruudut[x][y].kay();
        pino.push(ruudut[0][0]);
        while(true) {
            suunta = satunnainen.getLuku();
            int askeleet = 0;
            while(askeleet<5) {
                if(suunta==0 && kasittele(x+1, y)) {
                    pino.push(ruudut[x][y]);
                    setRuutu(x+1, y);
                    askeleet = 0;
                    break;
                } else {
                    suunta=1;
                    askeleet++;
                }
                if(suunta==1 && kasittele(x-1, y)) {
                    pino.push(ruudut[x][y]);
                    setRuutu(x-1, y);
                    askeleet = 0;
                    break;
                } else {
                    suunta=2;
                    askeleet++;
                }
                if(suunta==2 && kasittele(x, y+1)) {
                    pino.push(ruudut[x][y]);
                    setRuutu(x, y+1);
                    askeleet = 0;
                    break;
                } else {
                    suunta=3;
                    askeleet++;
                }
                if(suunta==3 && kasittele(x, y-1)) {
                    pino.push(ruudut[x][y]);
                    setRuutu(x, y-1);
                    askeleet = 0;
                    break;
                } else {
                    suunta=0;
                    askeleet++;                    
                }
                
            }
            if(pino.isEmpty()) break;
            if(askeleet!=0) {
                setRuutu(pino.peek().getX(), pino.peek().getY());
                pino.pop();
            } 
            

        }
    }

    public void setRuutu(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Päättää voiko kyseiseen ruutuun mennä
     * @param x
     * @param y
     * @return palauttaa true jos voi ja false jos ei voi
     */
    public boolean kasittele(int x, int y) {
        
        if(!(x>koko-1) && (x>=0) && !(y>koko-1) && (y>=0)) {
            Ruutu ruutu = ruudut[x][y];
            Ruutu ruutuNyt = ruudut[this.x][this.y];
            if(ruutu.onkoKayty() || ruutuNyt.onkoNaapuri(ruutu)) {
                return false;
            } else {
                ruutuNyt.lisaaNaapuri(ruutu);
                ruutu.lisaaNaapuri(ruutuNyt);
                ruutu.kay();
                ruutuNyt.kay();
                return true;
            }
        }
        return false;

    }

    public void setKoko(int koko) {
        this.koko=koko;
    }

    public Ruutu[][] getRuudut() {
        return ruudut;
    }

    public long[] getAjat() {
        long[] ajat = {(time2-time1), (time3-time2)};
        return ajat;
    }
}