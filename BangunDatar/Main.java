public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran (5);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        Segitiga segitiga = new Segitiga(5, 10);
        System.out.println("\nLuas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        
        Persegi persegi = new Persegi(7);
        System.out.println("\nLuas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());


        
    }
}
