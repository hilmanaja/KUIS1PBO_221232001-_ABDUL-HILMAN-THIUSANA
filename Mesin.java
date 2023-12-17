/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis1pbo_221232001._abdul.hilman.thiusana;

/**
 *
 * @author developerkejar.id
 */
class Mesin {
    private String merk;
    private int kecepatan;
    private boolean menyala;

    public Mesin(String merk) {
        this.merk = merk;
        this.kecepatan = 0;
        this.menyala = false;
    }

    public void nyalakan() {
        this.menyala = true;
    }

    public void matikan() {
        this.menyala = false;
    }

    public void tambahKecepatan() {
        if (this.menyala) {
            this.kecepatan += getTambahanKecepatan();
        }
    }

    public void kurangKecepatan() {
        if (this.menyala) {
            this.kecepatan -= getKuranganKecepatan();
        }
    }

    public int getKecepatan() {
        return this.kecepatan;
    }

    public int getTambahanKecepatan() {
        return 0;
    }

    public int getKuranganKecepatan() {
        return 0;
    }
}
