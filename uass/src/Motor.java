public class Motor {
    private String nomorPlat;
    private String merk;
    private boolean tersedia;

    public Motor(String nomorPlat, String merk) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.tersedia = true;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
