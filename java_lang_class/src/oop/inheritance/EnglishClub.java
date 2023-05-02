package oop.inheritance;

public class EnglishClub extends Club{

    private int wembleyAppearances;
    public EnglishClub(int titles, String name, int appearances) {
        super(titles, name);
        this.wembleyAppearances = appearances;
    }

    public void earnPremiereLeague(){
        super.earnTitle();
    }
    public void earnFACup(){
        super.earnTitle();
    }

    public void earnLeagueCup(){
        super.earnTitle();
    }

    public void earnChampionsLeague(){
        super.earnTitle();
    }

    public int getWembleyAppearances() {
        return wembleyAppearances;
    }

    public void setWembleyAppearances(int wembleyAppearances) {
        this.wembleyAppearances = wembleyAppearances;
    }
}
