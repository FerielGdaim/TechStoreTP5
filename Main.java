package techstore;

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile(1, "Galaxy", "REF-M1", 1500, 6.5, "Snapdragon", 8,
                SystemeExploitation.Android, 48, 12, 2, 5000);
        OrdinateurDeBureau pc = new OrdinateurDeBureau(2, "Tour", "REF-PC1", 2000, 24, "i7", 16,
                SystemeExploitation.Windows, 1000, "RTX 3060", "650W");
        OrdinateurPortable lp = new OrdinateurPortable(3, "ThinkPad", "REF-LP1", 2500, 15.6, "i5", 16,
                SystemeExploitation.Ubuntu, 512, "Intel Iris", 60000);
        ComposantStockage ssd = new ComposantStockage(4, "SSD", "REF-S1", 200, 256);
        Peripheriques souris = new Peripheriques(5, "Souris", "REF-P1", 50, "Bluetooth", "sans fil");

        System.out.println(m + "\nGarantie : " + m.garantirAppareil() + " an(s)\n");
        System.out.println(pc + "\nGarantie : " + pc.garantirAppareil() + " an(s)\n");
        System.out.println(lp + "\nGarantie : " + lp.garantirAppareil() + " an(s)\n");
        System.out.println(ssd + "\nGarantie : " + ssd.garantirAppareil() + " an(s)\n");
        System.out.println(souris);
    }
}