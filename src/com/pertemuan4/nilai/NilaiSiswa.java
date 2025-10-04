package com.pertemuan4.nilai;

import java.util.Scanner;

public class NilaiSiswa {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("=== Program Input Nilai Siswa ===");

    System.out.print("Masukkan jumlah siswa: ");
    int jumlahSiswa = input.nextInt();

    double[] nilai = new double[jumlahSiswa];

    for (int i = 0; i < jumlahSiswa; i++) {
      System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
      nilai[i] = input.nextDouble();
    }

    double total = 0;
    for (int i = 0; i < jumlahSiswa; i++) {
      total += nilai[i];
    }
    double rataRata = total / jumlahSiswa;

    System.out.println("\n=== Daftar Nilai Siswa ===");
    for (int i = 0; i < jumlahSiswa; i++) {
      System.out.println("Siswa ke-" + (i + 1) + ": " + nilai[i]);
    }
    System.out.println("Rata-rata nilai: " + rataRata);

    input.close();
  }
}
