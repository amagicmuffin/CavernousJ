public class Cavernous {
    public static void main(String[] args) {
        char[][] screen1map =  {{'#','#','#','#','#','#','#','#','#','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','#','#','#','#','#','#','#','#','#'}};

        Map screen1 = new Map(screen1map);

        Player player1 = new Player('@', 1,1);

        screen1.render();
        screen1.setTile(player1.getiPos(), player1.getjPos(), player1.getPlayer());
        screen1.render();
        player1.TryMove("d", screen1);
        screen1.render();
        player1.TryMove("d", screen1);
        screen1.render();
    }
}

// TODO: get started on main game loop, Scanner input