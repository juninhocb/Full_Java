package oop.inheritance;

public class BrazilClub extends Club{

    private int supportersNo;

    public BrazilClub(int titles, String name, int supporters) {
        super(titles, name);
        this.supportersNo = supporters;
    }
    public void earnLibertadores(){
        super.earnTitle();
    }
    public void earnBrasileirao(){
        super.earnTitle();
    }
    public void earnCopaDoBrasil(){
        super.earnTitle();
    }

    public int getSupportersNo() {
        return supportersNo;
    }

    public void setSupportersNo(int supportersNo) {
        this.supportersNo = supportersNo;
    }

    public Object clone(String newName){
        BrazilClub brazilClub = new BrazilClub(this.getTitlesNo(), newName, this.supportersNo);
        return brazilClub;
    }


}
