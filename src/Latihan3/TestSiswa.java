/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author SMK TELKOM
 */
public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAge(23);
        siswa.setAddress("Malang");
        siswa.setWaliSiswa("Abdul");
        
        System.out.println("Name : "+siswa.getName()
        + "\nAbsen : "+siswa.getAbsen()+
        "\nNama Wali siswa : "+siswa.getWaliSiswa()+"\n"+"Alamat Wali siswa : "+siswa.getAddress());
    }
}