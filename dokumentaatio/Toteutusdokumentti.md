# Toteutusdokumentti
Ohjelma on toteutettu Gradle-projektina ja se noudattaa kerrosarkkitehtuuria, jossa kerroksia on tässä tapauksessa vain kaksi, koska tiedon pysyväistallennusta ei ole. Ohjelman käyttöliittymäkerroksessa on vain UI-luokka, joka huolehtii käyttöliittymästä ja labyrintin piirtämisestä. Domain-kerroksessa on luokat Labyrintinluoja, joka huolehtii labyrintin luomeisesta eli luo ruudut ja tekee niistä puun, Ruutu, joka kuvastaa yhtä solmua puussa josta labyrintti muodostuu sekä Pino, joka korvaa Javaan sisäänrakennetun pino-olion. Ohjelmassa myös javan oma Random-olio on korvattu luokalla Satunnainen, jonka toiminta perustuu System.nanoTime()/4 jakojäännökseen, jolloin saadaan käyttötarkoitukseemme tarpeeksi satunnainen luku väliltä 0-3.

## Aika- ja tilavaativuudet
Labyrintin aikavaatimuksen pitäisi olla noin O(n^2), mutta kun tein testejä huomasin, että jostain syystä labyrintin luominen nopeutuu ensimmäisten kierrosten jälkeen. Esimerkiksi jos 50x50 labytintin luominen kestää ensimmäisellä kerralla 19ms niin seuraavalla kerralla sen luominen kestääkin vain 6ms. Tämä nopeutuminen tietenkin nollaantuu kun ohjelman sammuttaa ja käynnistää uudelleen. Suurin pullonkaula suoriteuksessa on labyrintin tulostaminen konsoliin, sillä se vie huomattavasti enemmän aikaa kuin ruutujen luominen ja labyrintin piirtäminen. Ohjelman tilavaativuus pysyy noin O(n^2) tuntumassa. 

## Pakkauskaavio
![Pakkauskaavio](https://github.com/PyryV/Labyrintti/blob/master/dokumentaatio/images/Pakkauskaavio.png)

## Tietorakenteet
Ohjelmassa on itse toteutettu pino sekä puu. Pino on periaatteessa vain linkitetty lista, joka testien perusteella osoittautui riittävän nopeaksi. Itse labyrintti taas tallennetaan puuna.

## Ohjelman puutteita ja parannusehdotuksia
Pinon toimintaa voisi ehkä hieman nopeuttaa, mutta toisaalta tässä tapauksessa se ei ole ollut pullonkaulana. 