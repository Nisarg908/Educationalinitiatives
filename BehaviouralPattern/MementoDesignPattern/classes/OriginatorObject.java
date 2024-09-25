package classes;

public class OriginatorObject {
    private int temp;
    private int vol;

    public OriginatorObject(int t, int v) {
        temp = t;
        vol = v;
    }
    public void setTemperature(int t) {
        temp = t;
    }
    public void setVolume(int v) {
        vol = v;
    }
    public int getTemperature(int t) {
        return temp;
    }
    public int getVolume(int v) {
        return vol;
    }
    public MementoObject saveObjectState() {
        return new MementoObject(temp,vol);
    }
    public void restoreObjectState(MementoObject m) {
        temp = m.getTemperature();
        vol = m.getVolume();
    }
    public void operateMachine() {
        System.out.println("Machine operating with Temp : "+temp+" and Vol : "+vol);
    }
}