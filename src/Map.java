public class Map {
    char[][] map;

    public Map(char[][] m) {
        map = m;
    }

    public char[][] getMap() {
        return map;
    }

    public String printMap() {
        String output = "";

        // generate i rows
        for (int i = 0; i < map.length; i++) {
            // generate j columns per row
            for (int j = 0; i < map[0].length; i++) { // TODO: could that 0 be i?
                output += map[i][j];
            }
            output += "\n";
        }

        return output;
    }
}
