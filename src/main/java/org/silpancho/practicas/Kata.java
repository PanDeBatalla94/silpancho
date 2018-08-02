package org.silpancho.practicas;

/**
 * kata 12.
 */
public class Kata {
    private static final int INI = 50;

    /**
     * @param num int
     * @return score
     */
    public long getScore(int num) {
        long t = 0;
        for (int i = 1; i <= num; i++) {
            t += i * INI;
        }
        return t;
    }
}