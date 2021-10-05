public class Player {
    char player;
    int iPos;
    int jPos;

    public Player(char p, int i, int j) {
        player = p;
        iPos = i;
        jPos = j;
    }
    
    // add getters, setters
    
    public void Move(String direction) {
        if (direction.equals("a")) MoveLeft();
        if (direction.equals("d")) MoveRight();
        if (direction.equals("s")) MoveDown();
        if (direction.equals("w")) MoveUp();
    }
    
    private void MoveLeft() {
        // implementation
    }
    
    private void MoveRight() {
        // implementation
    }
    
    private void MoveDown() {
        // implementation
    }
    
    private void MoveUp() {
        // implementation
    }
    
}
