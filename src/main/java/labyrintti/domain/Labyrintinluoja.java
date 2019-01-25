
package labyrintti.domain;


public class Labyrintinluoja {
    private int koko;
    private Ruutu[] ruudut;
    
    public void tulostaRuudut() {
        for(int i=0; i<koko*koko; i++) {
            System.out.println(ruudut[i].toString());
        }
    }

    /**
     * Metodi luo ruudukon josta labyrintti muodostetaan.
     * Ruudukon sivunpituus määritellään parametrilla koko.
     * @param koko
     */
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

    public Ruutu[] getRuudut() {
        return ruudut;
    }


}