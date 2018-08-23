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
public class EncapSiswa {
    private String name;
    private String address;
    private int absen;
    private String WaliSiswa;
    private String alamat;
    
    public int getAbsen(){
        return absen;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getWaliSiswa(){
        return WaliSiswa;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAge(int newAbsen){
        absen = newAbsen;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setWaliSiswa(String waliSiswa)
    {
        WaliSiswa = waliSiswa;
    }
    public void setAlamat(String alamat){
        alamat = alamat;
    }
}
