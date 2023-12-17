/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuis1pbo_221232001._abdul.hilman.thiusana;

/**
 *
 * @author developerkejar.id
 */
public class Main {
    public static void main(String[] args) {
        MesinHonda mesinHonda = new MesinHonda();
        MesinSuzuki mesinSuzuki = new MesinSuzuki();
        MesinNissan mesinNissan = new MesinNissan();

        Mobil mobilHonda = new Mobil(mesinHonda);
        Mobil mobilSuzuki = new Mobil(mesinSuzuki);
        Mobil mobilNissan = new Mobil(mesinNissan);

        System.out.println("Mobil Honda");
        mobilHonda.nyalakanMesin();
        mobilHonda.tambahKecepatan();
        mobilHonda.tambahKecepatan();
        mobilHonda.kurangKecepatan();
        System.out.println("Kecepatan: " + mobilHonda.getKecepatan());
        mobilHonda.matikanMesin();

        System.out.println("Mobil Suzuki");
        mobilSuzuki.nyalakanMesin();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.kurangKecepatan();
        System.out.println("Kecepatan: " + mobilSuzuki.getKecepatan());
        mobilSuzuki.matikanMesin();

        System.out.println("Mobil Nissan");
        mobilNissan.nyalakanMesin();
        mobilNissan.tambahKecepatan();
        mobilNissan.tambahKecepatan();
        mobilNissan.tambahKecepatan();
        mobilNissan.kurangKecepatan();
        System.out.println("Kecepatan: " + mobilNissan.getKecepatan());
        mobilNissan.matikanMesin();

    }
}
