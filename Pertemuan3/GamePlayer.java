/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenviroment;

/**
 *
 * @author adrian
 */
public class GamePlayer {
    private double witdh;
    private double height;
    private int potitionx;
    private int potitiony;
    
    public GamePlayer(){
        
    }
    public GamePlayer(double witdh, double height, int potitionx, int potitiony){
    }
    void setDimension(double witdh, double height){
        this.witdh = witdh;
        this.height = height;
    }
    void setPotition(int potitionx, int potitiony){
        this.potitionx = potitionx;
        this.potitiony = potitiony;
    }
    double getwitdh(){
        return this.witdh;
    }
    double getheight(){
        return this.height;
    }
    int getx(){
        return this.potitionx;
    }
    int gety(){
        return this.potitiony;
    }
    void run(){
        System.out.println("Player is running");
    }
    void run(int incrementX){
        incrementX += potitionx;
        System.out.println("Player is running current X position= "+ incrementX);
    }
}
