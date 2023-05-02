package oop.inheritance;

public abstract class Club {

    private static int clubsNo;
    private int titlesNo;
    private final String NAME;

    Club(int titles, String name){
        this.clubsNo++;
        this.titlesNo = titles;
        this.NAME = name;
    }

    public void earnTitle(){
        this.titlesNo++;
    }

    public int getTitlesNo(){
        return this.titlesNo;
    }

    public int getClubsNo(){
        return this.clubsNo;
    }


}
