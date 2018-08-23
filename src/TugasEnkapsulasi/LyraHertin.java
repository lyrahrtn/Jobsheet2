/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEnkapsulasi;

/**
 *
 * @author SMK TELKOM
 */
public class LyraHertin {
    public static void main(String[] args) {
        EncapLyra lyra = new EncapLyra();
        lyra.setNamaAyah("Herman Sutarto");
        lyra.setNamaIbu("Sri Wulyani");
        lyra.setNamaSendiri("Lyra Hertin");
        lyra.setNamaSaudara("Damar Hertino");
        lyra.setAlamat("Jalan Danau Buyan G7 F15, Sawojajar");
        lyra.setHobi("Menyanyi, Menari");
        lyra.setCitacita("Web Developer dan Pemimpin sebuah perusahaan");
        lyra.setUmur(16);
        
        System.out.println("Nama Ayah : "+lyra.getNamaAyah()+
                "\nNama Ibu : "+lyra.getNamaIbu()+
                "\nNama Saya : "+lyra.getNamaSendiri()+
                "\nNama Saudara : "+lyra.getNamaSaudara()+
                "\nUmur : "+lyra.getUmur()+
                "\nAlamat : "+lyra.getAlamat()+
                "\nHobi : "+lyra.getHobi()+
                "\nCita-cita : "+lyra.getCitacita());
    }
}
