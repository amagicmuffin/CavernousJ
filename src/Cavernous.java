public class Cavernous {
    public static void main(String[] args) {
        char[][] screen1map =  {{'#','#','#','#','#','#','#','#','#','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','#','#','#','#','#','#','#','#','#'}};

        Map screen1 = new Map(screen1map);

        Player player1 = new Player('@', 1,0);

        player1.Move("d");

        screen1.render();
        screen1.setTile(player1.getiPos(), player1.getjPos(), player1.getPlayer());
        System.out.println(player1.getiPos() + " " + player1.getjPos());
        screen1.render();
    }
}
