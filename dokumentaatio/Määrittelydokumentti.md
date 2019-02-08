# Määrittelydokumentti

Toteutettava ohjelma on satunnaisen labyrintin generointi -algoritmi, joka luo n*n kokoiseen ruudukkoon labyrintin. 

## Algoritmit ja tietorakenteet

Algoritminä aion aluksi käyttää, yksinkertaista rekursiivistä algoritmia, joka esitellään pääpiirteisesti [täällä](http://datagenetics.com/blog/november22015/index.html). Tämän jälkeen tarkoituksena on, että ruudukosta tulee verkko, jonka läpikäymällä luon samalla itse labyrintin. Verkon läpikäynti ei välttämättä tule olemaan tehokkainta mahdollista, koska labyrintin tekeminen perustuu suurelta osin sattumaan, jotta jokaisella kerralla saadaan erilainen labyrintti.

Yksinkertaisuudessaan tarkoitus on, että lopusllisessa ohjelmassa jokainen ruudukon ruutu on yksi verkon solmu ja kaarien avulla määritellään mihin mistäkin ruudusta pääsee kulkemaan.

## Aikavaatimukset

Koska ruudukon koko on aina n^2 vie ruudukon luominen samassa suhteessa aikaa. Mutta kun ruudukosta tulee verkko saadaan labyrintin luominen toteutettua syvyyshaulla *O*(*n*+*m*).
   
