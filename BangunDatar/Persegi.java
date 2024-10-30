public class Persegi extends BangunDatar {
    private float sisi;

    public Persegi (float sisi) {
        this.sisi = sisi;
    }

    public float luas() {
        return (float) (sisi * sisi);
    }

    public float keliling() {
        return (float) (4 * sisi);
    }
}
