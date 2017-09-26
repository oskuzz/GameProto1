/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author osku0
 */
public class Main {

    public static void main(String[] args) {
        Pankki pankki = new Pankki(100, 0.1);
        System.out.println("Alku kassa: " + pankki.getKassa());
        
        System.out.println("Lainaa 100");
        pankki.setLaina(100);

        System.out.println("Kassa: " + pankki.getKassa());
        System.out.println("Lainaa Jäljellä: " + pankki.getLainaaJaljella());
        
        System.out.println("Maksaa lainaa 50");
        pankki.toLaina(50);
        
        System.out.println("Kassa: " + pankki.getKassa());
        System.out.println("Lainaa Jäljellä: " + pankki.getLainaaJaljella());

        System.out.println("KokonaisLaina: " + pankki.getKokonaisLaina());
    }
}
