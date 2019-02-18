public class ArrayDivision {

    public int[] division(int[] tab, int n) {
        int x = tab.length / n;
        int newTab[] = new int[n];
        if (n == 0) {
            throw new ArithmeticException();
        }
        if (n < 0) {
            throw new NegativeArraySizeException();
        }
        if (n%2 == 0 && n > tab.length / 2) {
            throw new LargeNException();
        }
        if (n%2 != 0 && n > (tab.length / 2 + 1)) {
            throw new LargeNException();
        }
        if (tab == null) {
            throw new NullPointerException();
        }
        if (n > tab.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (tab.length % n == 0) {
            for (int j = 0; j < n; j++) {
                int tmp = 0;
                for (int i = j * x; i < (j + 1) * x; i++) {
                    tmp += tab[i];
                }
                newTab[j] = tmp;
            }
        }
        if (tab.length % n != 0) {
            int pomoc = 0;
            int pomoc2 = 0;
            for (int j = 0; j < n; j++) {
                int tmp = 0;
                x = tab.length / n + 1;
                pomoc2 = pomoc;
                for (int i = pomoc; i < pomoc2 + x && i < tab.length; i++) {
                    tmp += tab[i];
                    pomoc++;
                }
                newTab[j] = tmp;
            }
        }
        return newTab;
    }
}
