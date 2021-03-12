/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @vincenciashnt User
 */
public class Testsimplecircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //circle1
       simplecircle circle = new simplecircle();
       System.out.println("The area of the circle of radius" + circle.radius + "is" + circle.getarea());
       //circle2
       simplecircle circle2 = new simplecircle(25);
       System.out.println("The area of the circle of radius" + circle2.radius + "is" + circle2.getarea());
       //circle3
       simplecircle circle3 = new simplecircle(125);
       System.out.println("The area of the simple circle of radius" + circle3.radius + "is" + circle3.getarea());
       //circle4
       simplecircle circle4 = new simplecircle(100);
       System.out.println("The area of the simple circle of radius" + circle4.radius + "is" + circle4.getarea());
    }
}

class simplecircle {
    double radius;
    
    simplecircle() {
        radius = 1;
    }
    simplecircle(double newradius) {
        radius = newradius;
    }
    double getarea(){
        return radius * radius * 3.14;
    }
}