# Määrittelydokumentti

Kurssilla aion toteuttaa tekoälyn kivi, sakset, paperi -peliin. Tarkoitukseni on myös vertailla muutamaa erilaista tekoälyä esimerkiksi siinä miten ne toimivat ihmistä, sekä toisiaan vastaan. Argoritmissä aion hyödyntää Zhijian Wangin, Bin Xun ja Hai-Jun Zhoun [tutkimusta] (https://arxiv.org/abs/1404.5199) siitä miten ihmiset tekevät päätöksiä useamman peräkkäisen kivi, sakset, paperi -pelin aikana. Tutkimukseen perustuva strategia on esitelty yksinkertaisemmin tällä Numberphile-kanavan [YouTube-videolla](https://www.youtube.com/watch?v=rudzYPHuewc&t=201s). 

## Algoritmit ja tietorakenteet

Ensimmäisenä algoritminä tulen hydyntämään aiemmalla videolla esiteltyä strategiaa, jossa ihmistä vastaan voittaa pääpiirteittäin siten, että hävitessä pelaa kivestä, saksista ja paperista sen, jota ei sillä kierroksella pelattu ollenkaan. Jos taas voitti tulisi pelata se minkä vastustaja pelasi edellisellä kierroksella ja tasapelissä pitää vain valita satunnaisesti. Tässä strategiassa on kuitenkin muutamia aukkoja kuten se, että kyseinen strategia on muutaman kierroksen jälkeen helposti havaittavissa ja jos vastustaja tietää strategian on sitä helppo hyödyntää. Trkoituksenani on siis hioa sellainen algoritmi joka on toimiva ihmistä vastaan ja jota on vaikea päätellä pelin aikana. 

Algoritmien toteutuksessa aion käyttää yksinkertaisia binäärihakupuita, joiden avulla muodostan yksinkertaisen päättelyketjun tekoälylle. Binäärihakupuita aion hyödyntään myös siinä, miten itse pelissä selvitetään voittaja.

## Pelin toiminta yksinkertaisesti

Peli tulee pyörimään tekstikäyttöliittymän avulla ja siinä annetaan syötteenä, joko "kivi", "sakset" tai "paperi" -merkkijono, johon tekoäly vastaa omalla vaihtoehdollaan, jonka se on päätellyt edellisten kierrosten perusteella. 

## Aikavaatimukset

Koska käytämme binäärihakupuuta ja päättely tehdään siinä operaatioiden tulisi valmistua ajassa *O*(log *n*) olettaen, että puusta saadaan tasapainoinen. Jos nöin ei ole operaatioiden kesto on silloin *O*(*h*), mikä ei sekään välttämättä ole paha tässä tilanteessa, sillä en odota binäärihakupuun kasvavan hirveän suureksi. Suorituksessa tulee todennäköisesti myös vakiokokoisten taulukoiden läpikäymistä, mutta koska niiden aikavaatimus on *O*(1) eivät ne vaikuta tehokkuuteen.
   
