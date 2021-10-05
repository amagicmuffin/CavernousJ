public class Map {
    char[][] map;

    public Map(char[][] m) {
        map = m;
    }

    public char[][] getMap() {
        return map;
    }

    public char getTile(int i, int j) {
        return map[i][j];
    }

    public void setTile(int i, int j, char newTile) {
        map[i][j] = newTile;
    }

    public String toString() {
        String output = "";

        // generate i rows
        for (int i = 0; i < map.length; i++) {
            // generate j columns per row
            for (int j = 0; j < map[0].length; j++) { // TODO: could that 0 be i?
                output += map[i][j];
                output += " ";
            }
            output += "\n";
        }

        return output;
    }
}
