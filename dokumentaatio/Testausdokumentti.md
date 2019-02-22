# Testausdokumentti

## UI
Käyttöliittymälle ei ole ollenkaan JUnit-testejä, koska jokainen labyrintti on erilainen, joten labyrinttien piirtämistä on miltei mahdotonta tarkastaa automaattisilla testeillä. Käyttöliittymää onkin testattu käsin tulostamalla useampia 50x50 labyrinttejä ja tarkastamalla, että ne ovat täydellisiä eli jokaiseen ruutuun pääsee eikä labyrintistä löydy reittejä joista pääsisi takaisin lähtöpisteeseen ilman, että joutuu kääntymään ympäri.

### Virheellisiä labyrinttejä
![Virheellinen labyrintti](https://github.com/PyryV/Labyrintti/blob/master/dokumentaatio/images/Virheellinen%20labyrintti.png)
Labyrintissä on reitti, jota pitkin pääsee takaisin löhtöpisteeseen kääntymättä ympäri.

![Virheellinen labyrintti 2](https://github.com/PyryV/Labyrintti/blob/master/dokumentaatio/images/Virheellinen%20labyrintti%202.png)
Labyrintissä on alue johon ei pääse ollenkaan.

## Labyrintinluoja
Labyritinluojasta testataan ensin, että ruutujen luominen toimii, jonka jälkeen testataan se, että ruuduista voi luoda halutun kokoisen labyrintin. Melkein kaikki testaus labyrintinluojaan toteutetaan JUnit-testeinä. Itse labyrinttien täydellisyyden testaaminen on haastavaa, sillä jokaista mahdollista labyrinttia ei voi testata, joten joudun sen osalta vain luottamaan siihen, että koska en ole vielä ohjelmaa ajaessani nähnyt virheellistä labyrintti täytyy labyrintin luomisen toimia oikein. 

## Ruutu
Ruudun testaaminen on aika triviaalia, koska Ruutu-olio ei itsessään tee juuri mitään muuta kuin palauttaa tietoja itsestään, joten kaikki testaaminen voidaan tehdä helposti JUnit-testeillä.

## Pino
Pinosta on testattu tutkimalla tehokkuus ja näiden testien perusteella pino kykenee suorittamaan noin miljoona pinoon lisäystä ja poistoa sekunnissa. Tehokkuutta ei testata JUnit-testeillä, koska Traviksella oli ongelmia saada testejä suoritettua alle sekunnissa. JUnit-testit liittyvät lähinnä pinon toimintaan yleisesti eli siihen toimivatko push, pop, ja peek -metodit oikein. Pinosta myös testataan, että se ei hajoa jos tyhjän pinon pop()-metodia kutsutaan.


