import java.util.Scanner;

public class Cavernous {
    
    public static void main(String[] args) {
        char[][] defaultMap =  {{'#','#','#','#','#','#','#','#','#','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','.','.','.','.','.','.','.','.','#'},
                                {'#','#','#','#','#','#','#','#','#','#'}};
        Map screen1 = new Map(defaultMap);
        Player player1 = new Player('@',1,1);

        LoadCavernous(screen1,player1);
        
        Scanner userInput = new Scanner(System.in); // TODO: does this need to be somewhere else?
        
        // main game loop
        boolean gaming = true;
        while (gaming) {
            UserInput.Input(getLine(userInput), screen1, player1);
        }
    }
    
    /** Sets up screen1, renders screen **/
    private static void LoadCavernous(Map screen, Player player) {
        // loads screen (all that needs to be loaded rn is the player)
        // TODO: may need a method to load screen?
        screen.setTile(player.getiPos(),player.getjPos(),player.getPlayer());
        
        // renders screen
        screen.render();
    }
    
    private static String getLine(Scanner userInput) {
        return userInput.nextLine();
    }
}

// TODO: get started on main game loop, Scanner input
// TODO: player class may need Player.currentScreen attribute
