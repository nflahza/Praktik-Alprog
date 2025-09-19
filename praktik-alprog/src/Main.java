
public class Main {
    public static void main(String[] args) {
        // Nomor 3
        System.out.println("Welcome to java");
        System.out.println("im telkom university student");
        System.out.println("i think, Programming is Fun");
        // Nomor 4
        double hasil = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
        System.out.println(hasil);
        // Nomor 5
        int umur = 20;
        double tinggi = 175.5;
        String nama = "Andi";
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        // Nomor 6
        int deret_1 = 1+2+3+4+5+6+7+8+9+10;
        System.out.println("hasil penjumlahan deret adalah: " + deret_1);
        // Nomor 6 (Rumus Deret)
        int n = 10;
        int deret_2 = (1 + n)*n/2; // Deret Aritmatika (a=1, b=1)
        System.out.println("hasil penjumlahan deret adalah: " + deret_2);
        // Nomor 6 (for loop)
        int deret_3 = 0;
        for (int i = 0; i <= n; i++) {
            deret_3 += i;
        }
        System.out.println("hasil penjumlahan deret adalah: " + deret_3);

    }
}