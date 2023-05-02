package oop;

import oop.inheritance.BrazilClub;
import oop.inheritance.EnglishClub;

public class FootballClubs {

    public void runMe(){

        BrazilClub palmeiras = new BrazilClub(250, "Palmeiras", 10000000);
        BrazilClub gremio = new BrazilClub(175, "Gremio", 5000000);
        BrazilClub atleticoMg = new BrazilClub(80, "Atletico MG", 6000000);
        BrazilClub cruzeiro = new BrazilClub(190, "Cruzeiro", 4000000);

        EnglishClub chelsea = new EnglishClub(98, "Chelsea", 125);
        EnglishClub manchesterCity = new EnglishClub(110, "Manchester City", 189);
        EnglishClub liverpool = new EnglishClub(220, "Liverpool", 325);
        EnglishClub manchesterUnited = new EnglishClub(300, "Manchester United", 402);

        palmeiras.earnBrasileirao();
        palmeiras.earnLibertadores();
        palmeiras.earnCopaDoBrasil();
        System.out.println("titles: " + palmeiras.getTitlesNo());
        System.out.println("supporters: " + palmeiras.getSupportersNo());

        chelsea.earnChampionsLeague();
        chelsea.setWembleyAppearances(201);
        System.out.println("titles: " + chelsea.getTitlesNo());
        System.out.println("appearances: " + chelsea.getWembleyAppearances());

        System.out.println("Number of clubs created is " + manchesterCity.getClubsNo());

        BrazilClub novoGremio = ( BrazilClub) gremio.clone("Novo Gremio");

        System.out.println("Number of clubs created is " + manchesterCity.getClubsNo());

        System.out.println("titles of original: " + gremio.getTitlesNo());
        System.out.println("titles of clone: " + novoGremio.getTitlesNo());

        System.out.println("supports of original: " + gremio.getSupportersNo());
        System.out.println("supports of clone: " + novoGremio.getSupportersNo());




    }


}
