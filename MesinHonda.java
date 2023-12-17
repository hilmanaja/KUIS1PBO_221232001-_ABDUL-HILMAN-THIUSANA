/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis1pbo_221232001._abdul.hilman.thiusana;

/**
 *
 * @author developerkejar.id
 */
class MesinHonda extends Mesin {
    public MesinHonda() {
        super("Honda");
    }

    @Override
    public int getTambahanKecepatan() {
        return 10;
    }

    @Override
    public int getKuranganKecepatan() {
        return 5;
    }
}