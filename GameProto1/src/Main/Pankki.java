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
public class Pankki {

    int kassa;
    int laina;
    int kokonaisLaina;
    double lainanKorko;

    public Pankki(int kassa, double korko) {
        this.kassa = kassa;
        this.lainanKorko = korko;
    }

    public void toKassa(int maara) {
        this.kassa = this.kassa + maara;
    }

    public void setLaina(int maara) {
        this.kassa = this.kassa + maara;
        this.kokonaisLaina = +maara;
        this.laina = this.laina + maara;
    }

    public void toLaina(int maara) {
        this.laina = this.laina - maara;
        this.kassa = this.kassa - maara;
    }

    public int getKassa() {
        return this.kassa;
    }

    public int getLainaaJaljella() {
        return this.laina;
    }

    public int getKokonaisLaina() {
        return this.kokonaisLaina;
    }
}
