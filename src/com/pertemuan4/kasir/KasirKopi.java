package com.pertemuan4.kasir;

import java.util.Scanner;

public class KasirKopi {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Kasir Kopi ===");

        System.out.print("Masukkan nama pembeli: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nama minuman: ");
        String minuman = input.nextLine();

        System.out.print("Masukkan harga per gelas: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;

        System.out.println("\n=== Struk Pembelian ===");
        System.out.println("Pembeli : " + nama);
        System.out.println("Minuman : " + minuman);
        System.out.println("Jumlah  : " + jumlah + " gelas");
        System.out.println("Total   : Rp" + total);

        input.close();
    }
}
