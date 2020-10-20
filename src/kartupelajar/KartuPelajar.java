/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartupelajar;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class KartuPelajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("    FORM PEMBUATAN KARTU PELAJAR    ");
        System.out.println("––––––––––––––––––––––––––––––––––––");
        System.out.print("Nama          : ");
        String Nama = input.nextLine();
        System.out.print("NIS           : ");
        String NIS = input.nextLine();
        System.out.print("Jenis Kelamin : ");
        String JenisKelamin = input.nextLine();
        System.out.print("Agama         : ");
        String Agama = input.nextLine();
        System.out.print("Alamat        : ");
        String Alamat = input.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Hasil(Nama, NIS, JenisKelamin, Agama, Alamat);
        
        
    }

    private static void Hasil(String Nama, String NIS, String JenisKelamin, String Agama, String Alamat) {
        System.out.println("    KARTU PELAJAR SMK TELKOM MALANG    ");
        System.out.println("–––––––––––––––––––––––––––––––––––––––");
        System.out.print("PASFOTO ");
        System.out.println("   Nama          : " + Nama);
        System.out.print("PASFOTO ");
        System.out.println("   NIS           : " + NIS);
        System.out.print("PASFOTO ");
        System.out.println("   Jenis Kelamin : " + JenisKelamin);
        System.out.print("PASFOTO ");
        System.out.println("   Agama         : " + Agama);
        System.out.print("PASFOTO ");
        System.out.println("   Alamat        : " + Alamat);
    }
    
    
    
}
