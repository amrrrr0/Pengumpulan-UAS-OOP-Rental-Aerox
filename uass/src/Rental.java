import java.util.ArrayList;
import java.util.List;

public class Rental {
    private List<Motor> daftarMotor;

    public Rental() {
        this.daftarMotor = new ArrayList<>();
        daftarMotor.add(new Motor("AD 4511 JIN", "Yamaha Aerox 155"));
        daftarMotor.add(new Motor("DK 0121 BOS", "Yamaha Aerox 155"));
        daftarMotor.add(new Motor("H 3333 BAT", "Yamaha Aerox 155"));
    }

    public void tampilkanMotorTersedia() {
        System.out.println("Motor Tersedia:");
        for (Motor motor : daftarMotor) {
            if (motor.isTersedia()) {
                System.out.println(motor.getNomorPlat() + " - " + motor.getMerk());
            }
        }
        System.out.println();
    }

    public Motor sewaMotor(String nomorPlat) {
        for (Motor motor : daftarMotor) {
            if (motor.getNomorPlat().equals(nomorPlat) && motor.isTersedia()) {
                motor.setTersedia(false);
                return motor;
            }
        }
        return null;
    }

    public void kembalikanMotor(Motor motor) {
        motor.setTersedia(true);
        System.out.println("Terima kasih telah mengembalikan motor " + motor.getMerk() + " dengan nomor plat " + motor.getNomorPlat());
    }

    public Motor[] getDaftarMotor() {
        return daftarMotor.toArray(new Motor[0]);
    }
}
