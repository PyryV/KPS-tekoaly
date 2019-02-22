package labyrintti.domain;

public class Pino {
    private Alkio ylin;
    private boolean tyhja;

    public Pino() {
        tyhja = true;
    }

    /**
     * Lisää annetun alkion pinon päällimmäiseksi
     * @param ruutu
     */
    public void push(Ruutu ruutu) {
        if(tyhja) {
            ylin = new Alkio(ruutu);
            tyhja = false;
            ylin.setViimeinen();
        } else {
            Alkio alkio = new Alkio(ruutu);
            alkio.setNaapuri(ylin);
            ylin = alkio;
        }
    }
    /**
     * Poistaa pinon päällimmäisen alkion
     */
    public void pop() {
        
        if(!tyhja) {
            if(ylin.viimeinen) {
                tyhja = true;
            } else {
                Alkio alkio = ylin.getNaapuri();
                ylin = alkio;
            }
        }
    }
    /**
     * Tarkistaa onko pino tyhjä
     * @return true jos on
     */
    public boolean isEmpty() {
        return tyhja;
    }

    /**
     * Palauttaa pinon päällimmäisen alkion
     */
    public Ruutu peek() {
        return ylin.ruutu;
    }

    private class Alkio {
        private Ruutu ruutu;
        private Alkio naapuri;
        private boolean viimeinen;

        private Alkio(Ruutu ruutu) {
            this.ruutu = ruutu;
        }

        private void setViimeinen() {
            viimeinen = true;
        }

        private void setNaapuri(Alkio alkio) {
            naapuri = alkio;
        }

        private Alkio getNaapuri() {
            return naapuri;
        }
    }
} 