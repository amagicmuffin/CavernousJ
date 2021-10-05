public class Cavernous {
    public static void main(String[] args) {
        char[][] screen1map =  {{'#','#','#','#','#','#','#','#','#','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','#','#','#','#','#','#','#','#','#'}};

        Map screen1 = new Map(screen1map);

        System.out.println(screen1);
        screen1.setTile(1,0,'@');
        System.out.println(screen1);
    }
}
