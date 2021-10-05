public class Player {
    private char player;
    private int iPos;
    private int jPos;

    public Player(char p, int i, int j) {
        player = p;
        iPos = i;
        jPos = j;
    }

    public char getPlayer() {
        return player;
    }

    public int getiPos() {
        return iPos;
    }

    public int getjPos() {
        return jPos;
    }

    public void Move(String direction) {
        switch (direction) {
            case "a":
                MoveLeft();
                break;
            case "d":
                MoveRight();
                break;
            case "s":
                MoveDown();
                break;
            case "w":
                MoveUp();
                break;
            default:
                throw new Error("Invalid movement command");
        }
    }

//            Map.setTile(Player.coords, ground)
//            Player.setCoords(newPlace)
//            Map.setTile(Player.coords, Player)
//            Player.facing = direction
//            Map.render()

    private void MoveLeft() {
        jPos--;
    }
    
    private void MoveRight() {
        jPos++;
    }
    
    private void MoveDown() {
        iPos++;
    }
    
    private void MoveUp() {
        iPos--;
    }
    
}
