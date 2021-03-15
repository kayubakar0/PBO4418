/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class MatematikaDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        matematika hasil = new matematika();
        hasil.pertambahan(10, 20);
        hasil.pengurangan(10, 5);
        hasil.perkalian(10, 20);
        hasil.pembagian(20, 2);
        
    }
}

class matematika{
    void pertambahan(int a, int b){
        System.out.println(a+b);
    }
    void pengurangan(int a, int b) {
        System.out.println(a-b);
    }
    void perkalian(int a, int b){
        System.out.println(a*b);
    }
    void pembagian(int a, int b){
        double bagi = a/b;
        System.out.println(bagi);
    }
}