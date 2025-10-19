public class Main {
    public static void main(String[] args) {
        Shop s = new Shop();

        int[] tast = {40, 50, 60};
        int[] usb = {8, 12};
        int b = 60;

        System.out.println("Min Tastatur: " + s.minTastatur(tast));
        System.out.println("Max Artikel: " + s.maxArtikel(tast, usb));
        System.out.println("Max USB im Budget 30: " + s.maxUsbImBudget(new int[]{15, 45, 20}, 30));
        System.out.println("Max Ausgabe: " + s.maxAusgabe(b, tast, usb));
    }
}