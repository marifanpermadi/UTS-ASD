package ASD.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama ;
        double saldoSekarang, penarikan, setor;
        int pilihan1, pilihan2, batasTransaksi = 5;


        System.out.print("Masukan nama anda: ");
        nama = sc.nextLine();
        System.out.print("Masukan saldo awal: ");
        saldoSekarang = sc.nextDouble();
        

        while (batasTransaksi >= 1) {
            
            System.out.println("\n==Selamat datang "+nama+"! di ATM Bank Sattuan Puluhan==");
            System.out.print("\nMenu Transaksi: \n \n"
							 + "1. Penarikan \n"
							 + "2. Menabung \n"
							 + "3. Selesai \n"
							 + "Pilih transaksi [1/2/3]");
            pilihan1 = sc.nextInt();

            switch (pilihan1) {
                case 1:
                    System.out.println("\nSaldo anda sekarang: Rp."+saldoSekarang);
                    System.out.print("Masukan jumlah penarikan: ");
                    penarikan = sc.nextDouble();

                    if (penarikan >= 2000) {
                        if (saldoSekarang - penarikan >= 5000) {
                            System.out.println("\n==NOTA==");
                            System.out.println("Saldo awal anda Rp."+saldoSekarang);
                            System.out.print("Jumlah penarikan Rp."+penarikan+"\n");
                            saldoSekarang = saldoSekarang - penarikan;
                            System.out.println("Saldo anda sekarang Rp."+(saldoSekarang)+"\n");
                            batasTransaksi -= 1;

                            if (batasTransaksi > 0) {
                                System.out.println("Batas transaksi anda tersisa "+(batasTransaksi)+" kali lagi");
                                System.out.println("Apakah anda akan bertransaksi lagi? 1.Ya 2.Tidak");
                                pilihan2 = sc.nextInt();

                                if (pilihan2 == 1) {
                                    break;
                                } else {
                                    System.out.println("\nAnda membatalkan transaksi");
                                    System.out.println("Terimakasih telah bertransaki bersama kami");
                                    batasTransaksi = 0;
                                    }
                            } else {
                                System.out.println("Maaf, batas transaksi anda telah habis");
                                System.out.println("Terimakasih telah bertransaksi bersama kami");
                                }

                        } else {
                            System.out.println("Maaf saldo anda tidak cukup");
                            }
                    } else {
                        System.out.println("Maaf, penarikan minimal Rp.2000");
                        }
                    break;

                case 2:
                    System.out.println("Saldo anda sekarang: Rp."+saldoSekarang);
                    System.out.print("Masukan jumlah setoran: ");
                    setor = sc.nextDouble();

                    if (setor >= 2000) {
                        System.out.println("\n==NOTA==");
                        System.out.println("Saldo awal anda: Rp."+saldoSekarang);
                        System.out.println("Jumlah setoran: Rp."+setor);
                        saldoSekarang = saldoSekarang+setor;
                        System.out.println("Saldo anda sekarang: Rp."+saldoSekarang+"\n");
                        batasTransaksi -= 1;
                       
                        if (batasTransaksi > 0) {
                            System.out.println("Batas transaksi anda tersisa "+(batasTransaksi)+" kali lagi\n");
                            System.out.println("Apakah anda akan bertransaksi lagi? 1.Ya 2.Tidak");
                            pilihan2 = sc.nextInt();

                            if (pilihan2 == 1) {
                                break;
                            } else {
                                System.out.println("\nAnda membatalkan transaksi");
                                System.out.println("Terimakasih telah bertransaki bersama kami");
                                batasTransaksi = 0;
                                }
                        } else {
                            System.out.println("Maaf, batas transaksi anda telah habis");
                            System.out.println("Terimakasih telah bertransaksi bersama kami");
                            }

                    } else {
                        System.out.println("Maaf, jumlah setor tunai minimal Rp.2000");
                        }
                    break;
                
                case 3:
                    System.out.println("\nTerimakasih telah bertransaksi bersama kami");
                    batasTransaksi = 0;
                    break;

                default:
                    System.out.println("Pilihan yang anda masukan salah");
                    System.out.println("SIlahkan masukan pilihan yang tersedia");
            }
                    
        }
        sc.close();
    }
}
