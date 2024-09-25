package classes;

public class MementoObject {
    private int temp;
    private int vol;

    public MementoObject(int t, int v) {
        temp = t;
        vol = v;
    }
    public int getTemperature() {
        return temp;
    }
    public int getVolume() {
        return vol;
    }
}