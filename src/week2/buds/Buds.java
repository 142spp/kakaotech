package week2.buds;

public class Buds {
    private BudCase budcase;
    private Bud rightBud, leftBud;

    public Buds(){
        budcase = new BudCase();
        rightBud = new Bud();
        leftBud = new Bud();
    }
    public boolean isPerfectWear(){
        return rightBud.getIsWear() && leftBud.getIsWear();
    }

    public void
}
