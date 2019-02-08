# Testausdokumentti

## Labyrintinluoja
Labyritinluojasta testataan ensin, että ruutujen luominen toimii, jonka jälkeen testataan se, että ruuduista voi luoda halutun kokoisen labyrintin. Kaikki testaus labyrintinluojaan toteutetaan junit testeinä. 

## Ruutu
Ruudusta JUnit-testeillä testataan yleisesti toimivatko ruudun luominen , toimiiko naapurin lisääminen ruudulle ja toimiiko ruudun käydyksi merkitseminen oikein.

## Pino
Pinosta on testattu tutkimalla tehokkuus ja näiden testien perusteella pino kykenee suorittamaan noin miljoona pinoon lisäystä ja poistoa sekunnissa. Tehokkuutta ei testata JUnit-testeillä, koska Traviksella oli ongelmia saada testejä suoritettua alle sekunnissa. JUnit-testit liittyvät lähinnä pinon toimintaan yleisesti eli siihen toimivatko push, pop, ja peek -metodit oikein. 


