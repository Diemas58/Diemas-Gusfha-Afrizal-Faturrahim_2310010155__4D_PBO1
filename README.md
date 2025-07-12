# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `CryptoAsset`, `Bitcoin`, `Solana`, dan `CryptoApp` adalah contoh dari class.

```bash
public class CryptoAsset {
    ...
}

public class Bitcoin extends CryptoAsset {
    ...
}

public class Solana extends CryptoAsset {
    ...
}

public class CryptoApp {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `CryptoAsset[] assets = {new Bitcoin(0), new Solana(0)};` adalah contoh pembuatan object.

```bash
CryptoAsset[] assets = {
                new Bitcoin(0),
                new Solana(0)
            }
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `jumlah` adalah contoh atribut.

```bash
protected String nama;
protected double jumlah;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `CryptoAsset`, `Bitcoin`, dan `Solana`.

```bash
public CryptoAsset(String nama, double jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

public Bitcoin(double jumlah) {
        super("Bitcoin", jumlah);
    }

public Solana(double jumlah) {
        super("Solana", jumlah);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJumlah` adalah contoh method mutator.

```bash
public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJumlah`, `getNama`, `getHargaPasar`, dan `getNilaiAset` adalah contoh method accessor.

```bash
public double getJumlah() {
        return jumlah;
    }

public String getNama() {
        return nama;
    }

public double getHargaPasar() {
        return 0;
    }

public double getNilaiAset() {
        return getJumlah() * getHargaPasar();
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `jumlah` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private final String nama;
private double jumlah;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Bitcoin`, dan `Solana` mewarisi `CryptoAsset` dengan sintaks `extends`.

```bash
public class Bitcoin extends CryptoAsset {
    ...
}

public class Solana extends CryptoAsset {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `getHargaPasar()` di `Bitcoin`, dan `Solana` .

```bash
@Override
public double getHargaPasar() {
    return 100000; // implementasi untuk Bitcoin
}


@Override
public double getHargaPasar() {
    return 140; // implementasi untuk Solana
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if-else` dalam proses validasi input pembelian dan withdraw, serta seleksi `switch` dalam menu utama program `CryptoApp`.

```bash
switch (pilihan) {
    case 1 -> {
        // Menampilkan jumlah aset
    }
    case 2 -> {
        // Menambahkan aset
    }
    case 3 -> {
        // Withdraw aset
    }
    case 4 -> {
        // Keluar dari program
    }
    default -> System.out.println("Pilihan tidak valid!");
}

if (pilihKoin != 1 && pilihKoin != 2) {
    throw new IllegalArgumentException("Koin tidak tersedia!");
}

if (jumlahBeli < 0)
    throw new IllegalArgumentException("Jumlah tidak boleh negatif!");

if (jumlahWD <= assets[index].getJumlah()) {
    assets[index].setJumlah(assets[index].getJumlah() - jumlahWD);
   System.out.println("Berhasil withdraw " + jumlahWD + " " + assets[index].getNama());
} else {
    System.out.println("Jumlah tidak cukup!");
}

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do-while` untuk menampilkan menu utama secara terus-menerus hingga pengguna memilih keluar, dan `for` untuk menampilkan serta menjumlahkan nilai seluruh aset kripto.

```bash
do {
    System.out.println("\n=== Crypto Wallet Menu ===");
    ...
} while (pilihan != 4); // perulangan menu utama

for (CryptoAsset asset : assets) {
    System.out.println(asset.getNama() + ": " + asset.getJumlah() + " (" + asset.getNilaiAsset() + " USD)");

double total = 0;
for (CryptoAsset asset : assets) {
    total += asset.getNilaiAsset();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.print`, `System.out.println`, dan `System.out.printf` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Pilih menu (1-4): ");
pilihan = input.nextInt();

System.out.print("Beli Koin (1.BTC, 2.SOL): ");
int pilihKoin = input.nextInt();

System.out.print("Masukkan jumlah yang ingin dibeli: ");
double jumlahBeli = input.nextDouble();

System.out.printf("Total Nilai Sekarang: %.2f USD\n", total);
System.out.println("Berhasil membeli " + assets[index].getNama() + "!");

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `CryptoAsset[] assets = { new Bitcoin(0), new Solana(0) };` adalah contoh penggunaan array.

```bash
CryptoAsset[] assets = {
    new Bitcoin(0),
    new Solana(0)
};

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
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

    int index = pilihKoin - 1;
    assets[index].setJumlah(assets[index].getJumlah() + jumlahBeli);

    System.out.println("Berhasil membeli " + assets[index].getNama() + "!");
} catch (IllegalArgumentException e) {
    System.out.println("Error saat beli aset: " + e.getMessage());
    input.nextLine(); // membersihkan buffer input
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Diemas Gusfha Afrizal Faturrahim
NPM: 2310010155
