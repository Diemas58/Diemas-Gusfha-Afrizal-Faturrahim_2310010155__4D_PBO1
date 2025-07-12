package Cryptocurrency;

import java.util.Scanner;
//class
public class CryptoApp {
    public static void main(String[] args) {
        //object
        try (Scanner input = new Scanner(System.in)) {

            //array + Object + inheritance + Polymorphism
            CryptoAsset[] assets = {
                new Bitcoin(0),
                new Solana(0)
            };

            int pilihan;
            //perulangan
            do {
                //io
                System.out.println("\n=== Crypto Wallet Menu ===");
                System.out.println("1. Cek Jumlah Aset");
                System.out.println("2. Tambah Aset");
                System.out.println("3. Withdraw Aset");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");

                //error handling (untuk memvalidasi input)
                while (!input.hasNextInt()) {
                    System.out.print("Input harus angka! Coba lagi: ");
                    input.next(); // membersihkan buffer
                }
                pilihan = input.nextInt();

                //seleksi (switch-case)
                switch (pilihan) {
                    case 1 -> {
                        //polymorphism
                        //accessor
                        for (CryptoAsset asset : assets) {
                            System.out.println(asset.getNama() + ": " + asset.getJumlah() + " (" + asset.getNilaiAsset() + " USD)");
                        }

                        // hitung nilai seluruh aset
                        double total = 0;
                        for (CryptoAsset asset : assets) {
                            total += asset.getNilaiAsset();
                        }
                        System.out.println("Total Networth: " + total + " USD");
                    }

                    case 2 -> {
                        try {
                            System.out.print("Beli Koin (1.BTC, 2.SOL): ");
                            int pilihKoin = input.nextInt();

                            if (pilihKoin != 1 && pilihKoin != 2) {
                                throw new IllegalArgumentException("Koin tidak tersedia!");
                            }

                            System.out.print("Masukkan jumlah yang ingin dibeli: ");
                            double jumlahBeli = input.nextDouble();

                            if (jumlahBeli < 0)
                                throw new IllegalArgumentException("Jumlah tidak boleh negatif!");

                            //mutator
                            int index = pilihKoin - 1;
                            assets[index].setJumlah(assets[index].getJumlah() + jumlahBeli);

                            System.out.println("Berhasil membeli " + assets[index].getNama() + "!");

                            //polymorphisma
                            double total = 0;
                            for (CryptoAsset asset : assets) {
                                total += asset.getNilaiAsset();
                            }
                            System.out.println("Total Nilai Sekarang: " + total + " USD");


                        } catch (IllegalArgumentException e) {
                            System.out.println("Error saat beli aset: " + e.getMessage());
                            input.nextLine(); // membersihkan buffer input
                        }
                    }

                    case 3 -> {
                        try {
                            System.out.print("Withdraw Koin (1.BTC, 2.SOL): ");
                            int pilihWD = input.nextInt();

                            if (pilihWD != 1 && pilihWD != 2) {
                                throw new IllegalArgumentException("Koin tidak tersedia!");
                            }

                            System.out.print("Jumlah yang ingin diwithdraw: ");
                            double jumlahWD = input.nextDouble();

                            if (jumlahWD < 0)
                                throw new IllegalArgumentException("Jumlah tidak boleh negatif!");

                            int index = pilihWD - 1;

                            //Accessor + Mutator + Seleksi
                            if (jumlahWD <= assets[index].getJumlah()) {
                                assets[index].setJumlah(assets[index].getJumlah() - jumlahWD);
                                System.out.printf("Berhasil withdraw %.4f %s\n", jumlahWD, assets[index].getNama());
                            } else {
                                System.out.println("Jumlah tidak cukup!");
                            }

                        } catch (IllegalArgumentException e) {
                            System.out.println("Error saat withdraw: " + e.getMessage());
                            input.nextLine(); // clear buffer
                        }
                    }

                    case 4 -> System.out.println("Terima kasih sudah menggunakan dompet joowi!");

                    default -> System.out.println("Pilihan tidak valid!");
                }

            } while (pilihan != 4);
        }
    }
}