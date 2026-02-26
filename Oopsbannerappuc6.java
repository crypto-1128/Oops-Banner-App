/**
 * OOPSBannerApp UC6
 * Using separate methods for each character
 */

public class Oopsbannerappuc6 {

    public static String[] getOPattern() {
        return new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ***** ",
                " *    *",
                " *    *",
                " ***** ",
                " *      ",
                " *      ",
                " *      "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "  ***** ",
                " *      ",
                " *      ",
                "  ***** ",
                "       *",
                "       *",
                " *****  "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }
    }
}