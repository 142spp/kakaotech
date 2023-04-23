package week2.buds;

public class Bud {
    private boolean isWear;
    public Bud(){
        isWear = false;

        while(true){
            updateWear();
        }
    }
    private void updateWear(){
        isWear = sensorWear();
    }
    public boolean getIsWear(){
        return isWear;
    }
}
