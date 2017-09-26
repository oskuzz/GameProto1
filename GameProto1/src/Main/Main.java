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
        Pankki pankki = new Pankki(1000000, 0);
        int luku = 200001;
        System.out.println("Alku kassa: " + pankki.getKassa());
        
        System.out.println("Lainaa 1000");
        pankki.setLaina(luku);

        System.out.println("Kassa: " + pankki.getKassa());
        System.out.println("Lainaa Jäljellä: " + pankki.getLainaaJaljella());
        
        System.out.println("Maksaa lainaa 10000");
        pankki.toLaina(luku);
        
        System.out.println("Korko: " + pankki.getKorko());
        
        System.out.println("Kassa: " + pankki.getKassa());
        System.out.println("Lainaa Jäljellä: " + pankki.getLainaaJaljella());

        System.out.println("KokonaisLaina: " + pankki.getKokonaisLaina());
    }
}
