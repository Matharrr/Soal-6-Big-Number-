package p2.soal6;

import java.util.Scanner;
import java.math.BigInteger; 
/*
    menambahkan import BigInteger yang berfungsi untuk menambahkan variable
    BigInteger dan juga memungkinkan operari matematika pada range long
*/

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class P2Soal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //membuat objek scanner bernama scan
        BigInteger a = scan.nextBigInteger(); //membaca input user sebagai BigInteger dan menyimpannya pada variabel a
        BigInteger b = scan.nextBigInteger(); //membaca input user sebagai BigInteger dan menyimpannya pada variabel b
        
        BigInteger tambah = a.add(b); //menjumlahkan a dan b menggunakan method add dan menyimpannya pada variabel tambah
        BigInteger kali = a.multiply(b); //mengalikan a dan b menggunakan method kali
        
        System.out.println(tambah);
        System.out.println(kali);
    }
}