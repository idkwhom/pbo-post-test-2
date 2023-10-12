import java.util.Scanner;
public class TokoMakananRingan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Deklarasi variabel
        String[] namaMakanan = {"Keripik kentang", "Keripik singkong", "Keripik pisang", "Makaroni", "Mie instan", "Cokelat", "Permen", "Es krim"};
        int[] hargaMakanan = {1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500};
        int jumlahMakanan;
        int totalHarga;
        int uangBayar;
        int uangKembalian;
        // Input data
        System.out.println("Nama makanan: ");
        String namaMakanan = input.nextLine();
        System.out.println("Harga makanan: ");
        int hargaMakanan = input.nextInt();
        System.out.println("Jumlah makanan: ");
        int jumlahMakanan = input.nextInt();
        System.out.println("Uang bayar: ");
        int uangBayar = input.nextInt();
        // Hitung total harga
        totalHarga = hargaMakanan * jumlahMakanan;
        // Hitung uang kembalian
        uangKembalian = uangBayar - totalHarga;
        // Tampilkan total harga dan uang kembalian
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Uang kembalian: " + uangKembalian);
        // Hapus barang dari daftar
        System.out.println("Hapus barang dari daftar: ");
        String barangDihapus = input.nextLine();
        for (int i = 0; i < namaMakanan.length; i++) {
            if (namaMakanan[i].equals(barangDihapus)) {
                namaMakanan[i] = null;
                hargaMakanan[i] = 0;
            }
        }
        // Tampilkan daftar barang yang tersisa
        System.out.println("Daftar barang yang tersisa:");
        for (int i = 0; i < namaMakanan.length; i++) {
            if (nama
