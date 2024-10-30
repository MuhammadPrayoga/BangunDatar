public class Lingkaran extends BangunDatar {
    private int r;

    // Constructor untuk menginisialisasi atribut r
    public Lingkaran(int r) {
        this.r = r;
    }

    // menghitung luas lingkaran menggunakan jari-jari
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    // Keliling
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}