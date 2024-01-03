import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rental rental = new Rental();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Motor Tersedia");
            System.out.println("2. Sewa Motor");
            System.out.println("3. Kembalikan Motor");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    rental.tampilkanMotorTersedia();
                    break;
                case 2:
                    System.out.print("Masukkan nomor plat motor yang ingin disewa: ");
                    String nomorPlatSewa = scanner.nextLine();
                    Motor motorSewa = rental.sewaMotor(nomorPlatSewa);
                    if (motorSewa != null) {
                        System.out.println("Anda telah menyewa motor " + motorSewa.getMerk() + " dengan nomor plat " + motorSewa.getNomorPlat());
                    } else {
                        System.out.println("Motor tidak tersedia atau tidak ditemukan");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor plat motor yang ingin dikembalikan: ");
                    String nomorPlatKembali = scanner.nextLine();
                    for (Motor motor : rental.getDaftarMotor()) {
                        if (motor.getNomorPlat().equals(nomorPlatKembali)) {
                            rental.kembalikanMotor(motor);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan rental");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
