package com.pertemuan4.belanja;

import java.util.ArrayList;
import java.util.Scanner;

public class DaftarBelanja {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> daftarBelanja = new ArrayList<>();

    System.out.println("=== Program Daftar Belanja ===");
    System.out.println("Ketik nama barang yang mau dibeli (ketik 'selesai' untuk berhenti):");

    while (true) {
      System.out.print("Masukkan nama barang: ");
      String barang = input.nextLine();

      if (barang.equalsIgnoreCase("selesai")) {
        break;
      }

      daftarBelanja.add(barang);
    }

    System.out.println("\n=== Daftar Belanja Kamu ===");
    if (daftarBelanja.isEmpty()) {
      System.out.println("Kamu belum menambahkan barang apapun.");
    } else {
      for (int i = 0; i < daftarBelanja.size(); i++) {
        System.out.println((i + 1) + ". " + daftarBelanja.get(i));
      }
    }

    input.close();
  }
}
