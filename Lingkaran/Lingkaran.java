public class Lingkaran {
    private final double PI = 3.141592;

    public void hitungLuas(double r) {
        double luas = PI * r * r;
        System.out.println("Luas lingkaran dengan jari-jari " + r + ":");
        System.out.println("Bilangan pecahan: " + luas);
        System.out.println("Bilangan bulat (type-casting): " + (int) luas);
        System.out.println("Pembulatan (rounding): " + Math.round(luas));
    }
}
