/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis1pbo_221232001._abdul.hilman.thiusana;

/**
 *
 * @author developerkejar.id
 */
class MesinNissan extends Mesin {
    public MesinNissan() {
        super("Nissan");
    }

    @Override
    public int getTambahanKecepatan() {
        if (this.getKecepatan() < 300) {
            return 20;
        }
        return 0;
    }

    @Override
    public int getKuranganKecepatan() {
        if (this.getKecepatan() > 0) {
            return 15;
        }
        return 0;
    }
}