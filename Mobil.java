/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis1pbo_221232001._abdul.hilman.thiusana;

/**
 *
 * @author developerkejar.id
 */
class Mobil {
    private Mesin mesin;

    public Mobil(Mesin mesin) {
        this.mesin = mesin;
    }

    public void nyalakanMesin() {
        this.mesin.nyalakan();
    }

    public void matikanMesin() {
        this.mesin.matikan();
    }

    public void tambahKecepatan() {
        this.mesin.tambahKecepatan();
    }

    public void kurangKecepatan() {
        this.mesin.kurangKecepatan();
    }

    public int getKecepatan() {
        return this.mesin.getKecepatan();
    }
}