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
    public int maxUsbImBudget(int[] u, int b) {
        int max = -1;
        for (int x : u) if (x <= b && x > max) max = x;
        return max;
    }

    public int maxAusgabe(int b, int[] t, int[] u) {
        int maxSum = -1;
        for (int x : t)
            for (int y : u)
                if (x + y <= b && x + y > maxSum)
                    maxSum = x + y;
        return maxSum;
    }
}