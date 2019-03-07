# Käyttöohje
Lataa Labyrintin suoritettava [jar-tiedosto](https://github.com/PyryV/Labyrintti/releases/download/v1.0/Labyrintti-all.jar)

Siirry konsolissa samaan kansioon kuin mihin tallensit tiedoston ja käynnistä ohjelma komennolla:

```
java -jar Labyrintti-all.jar
```

Labyrintti luodaan antamalla mikä tahansa ykköstä suurempi luku.

```
||-------------------------------------------||
|| Anna labyrintin sivunpituus.              ||
|| Kakkosta pienempi luku lopettaa ohjelman. ||
||-------------------------------------------||
7
```
Ohjelma tulostaa valmiin labyrintin ja kertoo kuinka kauan aikaa meni ruudukon luomiseen, itse labyrintin muodostamiseen ja sen piirtämiseen.

```
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
XX  XX      XX              XX
XX  XX  XX  XXXXXX  XXXXXXXXXX
XX  XX  XX      XX          XX
XX  XX  XXXXXX  XXXXXXXXXX  XX
XX  XX  XX              XX  XX
XX  XX  XXXXXXXXXXXXXX  XX  XX
XX  XX          XX      XX  XX
XX  XX  XXXXXX  XX  XXXXXX  XX
XX  XX  XX      XX  XX      XX
XX  XXXXXX  XXXXXX  XXXXXX  XX
XX      XX      XX      XX  XX
XXXXXX  XXXXXX  XXXXXX  XX  XX
XX              XX          XX
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

Ruutujen luominen kesti: 0ms
Labyrintin luominen kesti: 0ms
Piirtäminen kesti: 1ms
```

Ohjelman suoritus lopetetaan antamalla mikä tahansa kakkosta pienempi luku.
