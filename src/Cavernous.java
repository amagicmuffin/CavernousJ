public class Cavernous {
    private Map screen1;
    private Player player1;
    
    public Cavernous() {
        Map screen1 =  {{'#','#','#','#','#','#','#','#','#','#'},
                        {'#','.','.','.','.','.','.','.','.','#'},
                        {'#','.','.','.','.','.','.','.','.','#'},
                        {'#','.','.','.','.','.','.','.','.','#'},
                        {'#','#','#','#','#','#','#','#','#','#'}};
        player1 = new Player('@',1,1);
    }
    
    public static void main(String[] args) {
        LoadCavernous();
        
        Scanner userInput = new Scanner(System.in); // TODO: does this need to be somewhere else?
        
        // main game loop
        boolean gaming = true;
        while (gaming) {
            mapInput(getInput(userInput));
        }
    }
    
    /** Sets up screen1, renders screen **/
    private void LoadCavernous() {
        // loads screen (all that needs to be loaded rn is the player)
        // TODO: may need a method to load screen?
        screen1.setTile(player1.getiPos,player1.getjPos,player1.getPlayer);
        
        // renders screen
        screen1.render();
    }
    
    private String getInput(Scanner userInput) {
        return userInput.nextLine();
    }
    
    /** process input while viewing map **/
    private void mapInput(String userInput) {
        // switch statement to call functions if x,y,etc inputs are inputted
    }
}

// TODO: get started on main game loop, Scanner input
// TODO: player class may need Player.currentScreen attribute
