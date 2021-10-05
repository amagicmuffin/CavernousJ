public class Map {
    private char[][] map;

    public Map(char[][] m) {
        map = m;
    }

    /* simple getters and setters */
    public char[][] getMap() {
        return map;
    }

    public char getTile(int i, int j) {
        return map[i][j];
    }

    public void setTile(int i, int j, char newTile) {
        map[i][j] = newTile;
    }

    /* moving tiles */
    public void Move(int i1, int j1, int i2, int j2) {
        final char FLOOR_TILE = '.'; // TODO: should this be somewhere else?
        setTile(i2, j2, getTile(i1,j1));
        setTile(i1, j1, FLOOR_TILE);
    }

    /* rendering map */
    public void render() {
        System.out.println(this);
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
