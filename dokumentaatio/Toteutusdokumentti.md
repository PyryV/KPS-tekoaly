# Toteutusdokumentti
Ohjelma on toteutettu Gradle-projektina ja se noudattaa kerrosarkkitehtuuria, jossa kerroksia on tässä tapauksessa vain kaksi, koska tiedon pysyväistallennusta ei ole. Ohjelman käyttöliittymäkerroksessa on vain UI-luokka, joka huolehtii käyttöliittymästä ja labyrintin piirtämisestä. Domain-kerroksessa on luokat Labyrintinluoja, joka huolehtii labyrintin luomeisesta eli luo ruudut ja tekee niistä puun, Ruutu, joka kuvastaa yhtä solmua puussa josta läbyrintti muodostuu sekä Pino, joka korvaa Javaan sisäänrakennetun pino-olion.

## Aika- ja tilavaativuudet
Tällä hetkellä labyrintin luominen vie aikaa O(n^2), sillä labyrintti on kaksiulotteinen, jolloin käsiteltävien ruutujen määrä on aina n*n, missä n on käyttäjän antama labyrintin sivunpituus. Piirtämisen aikavaativuus on vielä hieman enemmän, koska siinä pitää käsitellä myös ruutujen väliin tulevat seinät. Ohjelman tilavaativuus pysyy noin O(n^2) tuntumassa, mutta ääritapauksessa tilavaatimus voi olla jopa O(n^3), koska on mahdollista, että labyrinttiä tehdessä ei jouduta kertaakaan umpikujaan, jolloin pinossa olevien Alkio-olioiden määrä on labyrintin luomisen lopussa n. 

## Pakkauskaavio
![Pakkauskaavio](https://github.com/PyryV/Labyrintti/blob/master/dokumentaatio/images/Pakkauskaavio.png)