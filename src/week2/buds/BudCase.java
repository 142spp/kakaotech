package week2.buds;

public class BudCase {
    private boolean isCaseCharge;
    private boolean isLeftBudConnected;
    private boolean isRightBudConnected;

    private float battery;
    private enum LED {OFF, GREEN, RED};
    private LED led;

    public BudCase(){
        isCaseCharge = false;
        isLeftBudConnected = false;
        isRightBudConnected = false;
        battery = 0f;
        led = LED.OFF;

        while(true){ // 백그라운드로 실행
            updateCharge();
            updateLeftBud();
            updateRightBud();
            updateBattery();
            updateLED();

            delay(10);
        }
    }

    private void updateCharge(){
        isCaseCharge = sensorCharge();
    }
    private void updateLeftBud(){
        isLeftBudConnected = sensorLeftBud();
    }
    private void updateRightBud(){
        isRightBudConnected = sensorRightBud();
    }
    private void updateBattery(){
        battery = getBattery();
    }
    private void updateLED(){
        if(isCaseCharge) {
            led = LED.RED;
            if(battery == MAX_BATTERY)
                led = LED.GREEN;
        }
        else led = LED.OFF;
    }

}
