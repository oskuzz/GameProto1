/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static java.lang.Math.floor;

/**
 *
 * @author osku0
 */
public class Pankki {

    double kassa;
    int laina;
    int kokonaisLaina;
    double lainanKorko;

    public Pankki(int kassa) {
        this.kassa = kassa;
    }

    public void toKassa(int maara) {
        this.kassa = this.kassa + maara;
    }

    //lisää otetun lainan kassaan
    //lisää lainan kokonaislainan arvoon
    public void setLaina(int maara) {
        this.kassa = this.kassa + maara;
        this.kokonaisLaina = +maara;
        this.laina = this.laina + maara;
    }

    public void toLaina(int maara) {

        //katsoo lainan määrästä sopivan koron.
        if (maara <= 100) {
            this.lainanKorko = 0.3;
        } else if (maara <= 500) {
            this.lainanKorko = 0.25;
        } else if (maara <= 1000) {
            this.lainanKorko = 0.20;
        } else if (maara <= 5000) {
            this.lainanKorko = 0.15;
        } else if (maara <= 10000) {
            this.lainanKorko = 0.1;
        } else if (maara <= 100000) {
            this.lainanKorko = 0.05;
        }

        //tarkistaa onko lainan maksamisessa mitään ongelmia.
        if (maksunTarkistaminen(maara)) {

            //vähentää maksetun lainan lainan määrästä
            //kassasta vähentää annetun koron kanssa saman lainan.
            this.laina = this.laina - maara;
            this.kassa = this.kassa - floor((maara + (maara * this.lainanKorko)));
        }
    }

    public double getKorko() {
        return this.lainanKorko;
    }

    public double getKassa() {
        return this.kassa;
    }

    public int getLainaaJaljella() {
        return this.laina;
    }

    public int getKokonaisLaina() {
        return this.kokonaisLaina;
    }

    //tarkistaa onko maksettava summa sama kuin otettu laina ja tarkistaa onko kassassa tarpeeksi rahaa maksaakseen lainan takaisin.
    public boolean maksunTarkistaminen(int maara) {
        if (this.laina == maara) {
            if (this.kassa >= floor((maara + (maara * this.lainanKorko)))) {
                System.out.println("Läpi");
                return true;
            } else {
                System.out.println("Ei mennyt läpi");
                return false;
            }
        } else {
            System.out.println("Ei mennyt läpi!");
            return false;
        }
    }
}
