package session1;

public class TV {
    public int channel = 1;
    public int volumeLevel = 1;
    public boolean on =  false;

    float size = 1;

    public TV(){

    }
    public TV(int newChannel){
        channel = newChannel;
    }

    //use this to call a data field of a class
    public void turnOn() {
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }

    public void setVolume(int newVolumeLevel) {
        if(this.on && newVolumeLevel >= 1 && newVolumeLevel<= 10){
            this.volumeLevel = newVolumeLevel;
        }
    }

    public static void print(){
        System.out.println( "this is a static method");
    }
}
