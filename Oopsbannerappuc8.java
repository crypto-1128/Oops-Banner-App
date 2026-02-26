/**
 * OOPSBannerApp UC8
 * Using HashMap for storing character patterns
 */

import java.util.HashMap;

public class Oopsbannerappuc8 {

    public static HashMap<Character, String[]> createMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        map.put('P', new String[]{
                " ***** ",
                " *    *",
                " *    *",
                " ***** ",
                " *      ",
                " *      ",
                " *      "
        });

        map.put('S', new String[]{
                "  ***** ",
                " *      ",
                " *      ",
                "  ***** ",
                "       *",
                "       *",
                " *****  "
        });

        return map;
    }

    public static void display(String message, HashMap<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {

            for (char ch : message.toCharArray()) {

                String[] pattern = map.get(ch);
                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> map = createMap();
        display("OOPS", map);
    }
}