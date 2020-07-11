package chapter9d;

public class WeddingCake extends Cake {

    private String tiers;

    public WeddingCake(){
        super("mint");
    }


    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
