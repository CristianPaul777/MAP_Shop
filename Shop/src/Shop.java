public class Shop {

    public int minTastatur(int[] t) {
        int min = t[0];
        for (int x : t) if (x < min) min = x;
        return min;
    }

    public int maxArtikel(int[] t, int[] u) {
        int max = t[0];
        for (int x : t) if (x > max) max = x;
        for (int x : u) if (x > max) max = x;
        return max;
    }

}