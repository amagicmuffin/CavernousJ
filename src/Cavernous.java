public class Cavernous {
    public static void main(String[] args) {
        char[][] screen1map =  {{'#','#','#','#','#','#','#','#','#','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','#','#','#','#','#','#','#','#','#'}};

        Map screen1 = new Map(screen1map);

        screen1.printMap();
    }
}
