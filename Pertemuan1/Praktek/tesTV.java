/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayubakar
 */
public class tesTV {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is "+ tv1.channel + " and volume level is "+ tv1.volumeLevel);
        System.out.println("tv1's channel is "+ tv2.channel + " and volume level is "+ tv2.volumeLevel);
    }
}


class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = False;
    
    void turnOn(){
        on = True;
    }
    void turnOff() {
        off = False;
    }
    void setChannel(int newChannel) {
        channel = newChannel;
    }
    void setVolume(int newVolumeLevel) {
        volumeLevel = newVolumeLevel;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
    void volumeUp(){
        volumeLevel++;
    }
    void volumeDown(){
        volumeLevel--;
    }
}
