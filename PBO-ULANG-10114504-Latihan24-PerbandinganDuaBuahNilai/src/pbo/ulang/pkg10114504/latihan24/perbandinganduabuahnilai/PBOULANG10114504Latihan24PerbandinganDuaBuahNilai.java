/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan24.perbandinganduabuahnilai;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program perbandingan dua buah nilai
 */

import java.util.Scanner;

public class PBOULANG10114504Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner (System.in);
        int pertama,kedua;
        String b;
        
        for (b = "ya";b.equals("ya")|| b.equals("Ya");){
        
        
        System.out.print("Masukan Nilai Pertama : ");
        pertama = scan.nextInt();
        System.out.print("Masuk Nilai Kedua     : ");
        kedua = scan.nextInt();
        
        if (pertama > kedua){
            System.out.println("Hasil : "+pertama+" Lebih Besar dari "+kedua);
        }
            else if (kedua > pertama){
            System.out.println("Hasil : "+kedua+" Lebih Besar dari "+pertama);
        }
        System.out.println("");
        System.out.print("Ulangi Aktifitas ? (Ya/Tidak)");
        b = scan.next();
        }
        
    
    }
}
 
