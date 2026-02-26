/**
 * OOPSBannerApp UC7
 * Using Inner Class to store character patterns
 */

public class Oopsbannerappuc7 {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createMaps() {

        return new CharacterPatternMap[]{

                new CharacterPatternMap('O', new String[]{
                        "  ***  ",
                        " *   * ",
                        "*     *",
                        "*     *",
                        "*     *",
                        " *   * ",
                        "  ***  "
                }),

                new CharacterPatternMap('P', new String[]{
                        " ***** ",
                        " *    *",
                        " *    *",
                        " ***** ",
                        " *      ",
                        " *      ",
                        " *      "
                }),

                new CharacterPatternMap('S', new String[]{
                        "  ***** ",
                        " *      ",
                        " *      ",
                        "  ***** ",
                        "       *",
                        "       *",
                        " *****  "
                })
        };
    }

    public static String[] getPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[7];
    }

    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getPattern(message.charAt(j), maps);
                System.out.print(pattern[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createMaps();
        printMessage("OOPS", maps);
    }
}